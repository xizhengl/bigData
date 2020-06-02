#!/bin/bash
#版本

function read_file(){
version="t3.1"

arr_data=('jobs1.csv' 'jobs2.csv' 'jobs3.csv' 'jobs4.csv' 'jobs5.csv' 'jobs6.csv')
arr_jar=('xie-mr1.jar' 'xie-udf2.jar')
arr_web=('BigDataTest.war')
arr_bs=('data' 'jar' 'web')
count=0

echo "程序开始"
echo "版本$version"
echo "正在检测文件是否缺失"
if [ -f "/usr/hadoop/shell/t3.sh" ]
    then
    count=` expr 1 + $count `
    else
    echo "/usr/hadoop/shell/t3.sh未确认"
fi

for((i=0;i<${#arr_bs[@]};i++))

do
eval tmp=\${arr_${arr_bs[$i]}[@]}
for data in $tmp
do
    if [ ! -f "/usr/hadoop/${arr_bs[$i]}/$data" ]
        then
        echo "/usr/hadoop/${arr_bs[$i]}/$data未确认"
        break 2
        else
        echo "$data已确认"
    fi
    count=` expr 1 + $count `
done

done
if [ $count == 10 ]
then
    echo "文件检测完毕"
    upload
else
    echo "文件不完整，准备退出"
fi
}

function upload(){

    echo "准备上传数据"
    hadoop fs -rmr /data
    hadoop fs -rmr /jar
    hadoop fs -mkdir /data
    hadoop fs -mkdir /jar
    hadoop fs -put /usr/hadoop/data/* /data
    hadoop fs -put /usr/hadoop/jar/* /jar

    echo "上传完毕"
    echo "准备进行初步清洗"
    echo "该过程可能需要4-8分钟"
    echo "具体情况视机器而定"

    hadoop fs -test -e /out
    if [ $? == 1 ]
    then
        `hadoop fs -mkdir /out`
    fi
    for dir in ${arr_data[@]}
    do
        echo "正在清洗$dir"
    `hadoop fs -test -e /out/$dir`
    if [ $? == 0 ]
    then
        `hadoop fs -rmr /out/$dir`
    fi
        `hadoop jar /usr/hadoop/jar/xie-mr1.jar test.mapreduce.t2.Main /data/$dir /out/$dir`
    done

    echo "初步清洗完成"

    hive2
}

function hive2(){

    arr_table=("jobs_" "h_tag_top_" "h_top_tag_gjc_" "h_tag_salary_top_" "h_city_tag_salary_" "h_job_info_")
    count=0

    echo "准备进行针对性清洗"
    echo "该过程可能需要30-60分钟"
    echo "具体情况视机器而定"

    tmp_path="/usr/hadoop/shell/tmp.txt"
    if [ -f $tmp_path ];then
        `rm -f $tmp_path`
    fi



    hive -e "drop function fenci"
    hive -e "drop function fenci_city"
    hive -e "drop function fenci_salary"
    hive -e "create function fenci as 'test.hive.udf.t2.fenciUDF' using jar 'hdfs:///jar/xie-udf3.jar'"
    hive -e "create function fenci_city as 'test.hive.udf.t1.CityUDF' using jar 'hdfs:///jar/xie-udf2.jar'"
    hive -e "create function fenci_salary as 'test.hive.udf.t1.SalaryUDF' using jar 'hdfs:///jar/xie-udf2.jar'"

while ((1)); do
    count2=0

    for ((i=0;i<${#arr_table[@]};i++))
        do
        hadoop fs -test -e /user/hive/warehouse/${arr_table[$i]}$count
        if [ $? == 0 ]
            then
            count=` expr 1 + $count `
            break
        fi
        count2=` expr 1 + $count2 `
    done

    if [ $count2 == ${#arr_table[@]} ]
        then
        break
    fi
done
count2=$count
count=0

#第一张jobs表
table_name=${arr_table[$count]}$count2
echo "开始创建$table_name"
hive -e "create table $table_name(company_financing_stage string,company_industry string,company_location string,company_name string,company_nature string,company_overview string,company_people string,job_edu_require string,job_exp_require string,job_info string,job_name string,job_salary string,job_tag string,job_welfare string) row format delimited fields terminated by '\u0001';"

for dir in ${arr_data[@]}
do
    for (( j = 0; j < 10; j++ )); do
    `hadoop fs -test -e /out/$dir/part-r-0000$j`
    if [ $? == 0 ]
    then
        `hive -e "load data inpath '/out/$dir/part-r-0000$j' into table $table_name;"`
    else
        break
    fi
    done
done

hive -e "SELECT COUNT(job_name) FROM $table_name"
echo "$table_name清洗完毕"


#第二张h_tag_top表
count=` expr 1 + $count `
table_name=${arr_table[$count]}$count2
echo $table_name >> $tmp_path
echo "开始创建$table_name"
hive -e "create table $table_name
(job_tag string,count int)
STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler'
WITH SERDEPROPERTIES ('hbase.columns.mapping' = ':key,info:count')
TBLPROPERTIES ('hbase.table.name' = '$table_name',
'hbase.mapred.output.outputtable' = '$table_name');"
hive -e "insert into $table_name
select job_tag,count(1) as count from ${arr_table[0]}$count2 group by job_tag order by count desc limit 10;"

hive -e "select * from $table_name"
echo "$table_name清洗完毕"

#第三张h_top_tag_gjc表
count=` expr 1 + $count `
table_name=${arr_table[$count]}$count2
echo $table_name >> $tmp_path
echo "开始创建$table_name"
hive -e "create table $table_name
(job_tag string,gjc string,count string)
STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler'
WITH SERDEPROPERTIES ('hbase.columns.mapping' = ':key,info:job_info,info:count')
TBLPROPERTIES ('hbase.table.name' = '$table_name',
'hbase.mapred.output.outputtable' = '$table_name');"

hive -e "insert into $table_name
select a.job_tag,concat_ws(',',collect_set(a.gjc)) as gjc_z,concat_ws(',',collect_set(cast(a.count as string))) as count_z from
(select gjc,job_tag,count(1) as count from (select job_tag,gjc from ${arr_table[0]}$count2
lateral view explode(split(fenci(job_info),','))t1 as gjc)b,${arr_table[1]}$count2 where b.job_tag=${arr_table[1]}$count2.job_tag group by b.gjc,b.job_tag)a
group by a.job_tag;"

echo "$table_name清洗完毕"

#第四张职业均薪TOP
count=` expr 1 + $count `
table_name=${arr_table[$count]}$count2
echo $table_name >> $tmp_path
echo "开始创建$table_name"

hive -e "create table $table_name
(job_tag string,salary int)
STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler'
WITH SERDEPROPERTIES ('hbase.columns.mapping' = ':key,info:salary')
TBLPROPERTIES ('hbase.table.name' = '$table_name',
'hbase.mapred.output.outputtable' = '$table_name');"
hive -e "insert into $table_name
select tag,cast(avg(salary) as int) as salary from
(select job_tag as tag,fenci_salary(job_salary) as salary from ${arr_table[0]}$count2)a
where salary!=0
group by tag
order by salary desc
limit 10;"

echo "$table_name清洗完毕"

#第五张城市招聘信息
count=` expr 1 + $count `
table_name=${arr_table[$count]}$count2
echo $table_name >> $tmp_path
echo "开始创建$table_name"

hive -e "create table $table_name
(city string,tag string,count string,salary int)
STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler'
WITH SERDEPROPERTIES ('hbase.columns.mapping' = ':key,info:tag,info:count,info:salary')
TBLPROPERTIES ('hbase.table.name' = '$table_name',
'hbase.mapred.output.outputtable' = '$table_name');"
hive -e "insert into $table_name
select location,concat_ws(',',collect_set(job_tag)),concat_ws(',',collect_set(cast(count as string))),cast(avg(salary2) as int) from
(select fenci_city(company_location) as location,job_tag,count(1) as count,avg(salary) as salary2 from
(select company_location,job_tag,fenci_salary(job_salary) as salary from ${arr_table[0]}$count2)b
where salary!=0
group by company_location,job_tag)a
group by location;"

echo "$table_name清洗完毕"

#第六张招聘信息表
count=` expr 1 + $count `
table_name=${arr_table[$count]}$count2
echo $table_name >> $tmp_path
echo "开始创建$table_name"

hive -e "create table $table_name
(id int,city string,company_name string,job_name string,salary string,job_tag string)
STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler'
WITH SERDEPROPERTIES ('hbase.columns.mapping' = ':key,info:city,info:company_name,info:job_name,info:salary,info:job_tag')
TBLPROPERTIES ('hbase.table.name' = '$table_name',
'hbase.mapred.output.outputtable' = '$table_name');"


hive -e "insert into $table_name
select row_number() over (order by job_tag) as id,z.* from
(
select distinct * from(
select location,company_name,job_name,job_salary,job_tag from
(select fenci_city(${arr_table[0]}$count2.company_location) as location,${arr_table[0]}$count2.company_name,${arr_table[0]}$count2.job_name,${arr_table[0]}$count2.job_salary,${arr_table[0]}$count2.job_tag
from ${arr_table[0]}$count2,${arr_table[1]}$count2 where ${arr_table[0]}$count2.job_tag=${arr_table[1]}$count2.job_tag limit 700)a
union all
select location,company_name,job_name,job_salary,job_tag from
(select * from(select fenci_city(${arr_table[0]}$count2.company_location) as location,${arr_table[0]}$count2.company_name,${arr_table[0]}$count2.job_name,${arr_table[0]}$count2.job_salary,${arr_table[0]}$count2.job_tag
from ${arr_table[0]}$count2)bb,${arr_table[4]}$count2 where bb.location=${arr_table[4]}$count2.city limit 1300)b
)c
)z;
"

echo "$table_name清洗完毕"

echo "hive清洗完毕"

tomcat
}

function tomcat(){
tomcat_path="/usr/tomcat"
web_dir_name='BigDataTest'
echo "tomcat开始部署"

if [ -f $tomcat_path/webapps/${arr_web[0]} ];then
`rm -f "$tomcat_path/webapps/${arr_web[0]}"`
fi

cp /usr/hadoop/${arr_bs[2]}/${arr_web[0]} $tomcat_path/webapps/${arr_web[0]}

if [ -d $tomcat_path/webapps/$web_dir_name ];then
`rm -rf "$tomcat_path/webapps/$web_dir_name"`
fi

startup.sh

cp $tmp_path $tomcat_path/webapps/$web_dir_name/WEB-INF/classes/other/table.txt

echo "tomcat部署完毕"
echo "程序结束"
}
read_file
#hive2
