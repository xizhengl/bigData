# 1、基于大数据的招聘信息分析平台 

本项目使用 hadoop 集群（一主两从）作为数据清洗的环境，其中 hadoop 集群包括 hadoop、zookeeper、hive、hbase 等软件组成。Tomcat 作为前端页面展示环境。数据清洗中，使用 java 编写的 MapReduce 进行特殊清洗，使用hive 的 HQL 语句进行细化清洗，使用 java 编写的 UDF 进行特殊细化清洗。前端页面展示中，使用 java 编写的 servlet 与 hbase 交互，获取数据并用 js 解析，把结果通过使用 echarts 表格、layui 等界面等框架配合优化展示效果，最终展示形式采用网页形式。

# 2、 文件说明

* Java 
