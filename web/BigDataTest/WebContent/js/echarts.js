
	var sdata=eval(jsonDataVar);
	console.log("数据如下");
	console.log(jsonDataVar);
	var gjc=sdata.gjc;
	for(var i=0;i<gjc.length;i++){
		var id=String.fromCharCode(97+i);
		document.getElementById(String.fromCharCode(97+i)).innerHTML=gjc[i].name+"职业需求";
		
		var j=96;
		
		 for(var key in gjc[i]){
			 var id2=id;
			 id2+= String.fromCharCode(j);
			 j++;
			 if(j==97) continue;

			 // console.log(id2);
			 document.getElementById(id2+'2').innerHTML=gjc[i][key]+'个';
			 document.getElementById(id2+'1').innerHTML=gjcxs(key);
			 
		 }
	}
	
function gjcxs(string){
	if(string=="c"||string=="r") {
			return string+"语言";
		}
		if(string=="实践") {
			return "实践经验";
		}
		if(string=="bash") {
			return "Linux bash命令";
		}
		if(string=="ocr") {
			return "OCR技术";
		}
		if(string=="uml") {
			return "Uml建模";
		}
		if(string=="sql") {
			return "类Sql语言";
		}
		if(string=="spark") {
			return "Spark框架";
		}
		if(string=="erdas") {
			return "ERDAS IMAGINE";
		}
		if(string=="sse") {
			return "SSE指令集";
		}
		if(string=="tornado") {
			return "Tornado框架";
		}
		if(string=="sqoop") {
			return "Sqoop框架";
		}
		if(string=="redis") {
			return "Redis数据库";
		}
		if(string=="oozie") {
			return "Oozie Server";
		}
		if(string=="sas") {
			return "统计分析软件";
		}
		if(string=="linux") {
			return "Linux系统";
		}
		if(string=="impala") {
			return "Impala引擎";
		}
		if(string=="theano") {
			return "Theano Python库";
		}
		if(string=="django") {
			return "Django框架";
		}
		if(string=="office") {
			return "Office";
		}
		if(string=="word") {
			return "Word";
		}
		if(string=="nosql") {
			return "NoSql数据库";
		}
		if(string=="gensim") {
			return "Gensim Python工具包";
		}
		if(string=="c++") {
			return "C++语言";
		}
		if(string=="paddlepaddle") {
			return "PaddlePaddle框架";
		}
		if(string=="opencv") {
			return "OpenCV视觉库";
		}
		if(string=="orb-slam") {
			return "ORB-SLAM算法";
		}
		if(string=="ar") {
			return "AR";
		}
		if(string=="ps") {
			return "PS";
		}
		if(string=="oracle") {
			return "Oracle Database";
		}
		if(string=="pymc") {
			return "Pymc Python库";
		}
		if(string=="slam") {
			return "SLAM同步定位与建图";
		}
		if(string=="n-gram") {
			return "N-Gram模型";
		}
		if(string=="vm") {
			return "VM虚拟机";
		}
		if(string=="mpi") {
			return "MPI通讯协议";
		}
		if(string=="c#") {
			return "C#编程语言";
		}
		if(string=="tornado") {
			return "Tornado框架";
		}
		if(string=="db2") {
			return "DB2数据库管理系统";
		}
		if(string=="caffe") {
			return "Caffe框架";
		}
		if(string=="caffe") {
			return "Caffe框架";
		}
		if(string=="dsp") {
			return "数字信号处理";
		}
		if(string=="docker") {
			return "Docker引擎";
		}
		if(string=="tcp") {
			return "TCP协议";
		}
		if(string=="web server") {
			return "Web Server";
		}
		if(string=="mysql") {
			return "MySql数据库";
		}
		if(string=="mapreduce") {
			return "Mapreduce";
		}
		if(string=="theano") {
			return "THeano";
		}
		if(string=="envi") {
			return "完整的遥感图像处理平台";
		}
		if(string=="shell") {
			return "Shell";
		}
		if(string=="idl") {
			return "交互式数据语言";
		}
		if(string=="fddb") {
			return "fddb算法";
		}
		if(string=="lfw") {
			return "LFW人脸数据库";
		}
		if(string=="hadoop") {
			return "Hadoop";
		}
		if(string=="java") {
			return "JAVA";
		}
		if(string=="keras") {
			return "Keras深度学习库";
		}
		if(string=="mongodb") {
			return "Mongodb数据库";
		}
		if(string=="cmusphinx") {
			return "Cmusphinx系统";
		}
		if(string=="mvc") {
			return "MVC框架";
		}
		if(string=="lstm") {
			return "长短期记忆网络";
		}
		if(string=="spss") {
			return "统计产品与服务解决方案";
		}
		if(string=="mxnet") {
			return "Mxnet深度学习库";
		}
		if(string=="photoshop") {
			return "PS";
		}
		if(string=="nlp") {
			return "自然语言处理";
		}
		if(string=="kafka") {
			return "Kafka系统";
		}
		if(string=="cnn") {
			return "CNN模型";
		}
		if(string=="dnn") {
			return "DNN算法";
		}
		if(string=="sqlserver") {
			return "Sql Server";
		}
		if(string=="scikit-learn") {
			return "Scikit-learn";
		}
		if(string=="memcache") {
			return "Memcache系统";
		}
		if(string=="xgboost") {
			return "Xgboost算法";
		}
		if(string=="android") {
			return "Android";
		}
		if(string=="rnn") {
			return "RNN模型";
		}
		if(string=="illustrator") {
			return "Adobe Illustrator";
		}
		if(string=="ros") {
			return "机器人操作系统";
		}
		if(string=="kdd") {
			return "KDD";
		}
		if(string=="vins") {
			return "Vins算法";
		}
		if(string=="ai"||string=="人工智能") {
			return "AI";
		}
		if(string=="scala") {
			return "Scala语言";
		}
		if(string=="hbase") {
			return "hbase数据库";
		}
		if(string=="mahout") {
			return "Mahout";
		}
		return string;
}
	//文字轮播
	wzlb();
	function wzlb(){
	var data_job_info = sdata.job_info;
	var oUl=document.getElementById('job_info_ul');
    var aLi=oUl.getElementsByTagName('li');
	var liStr='';
	for (var i = 0; i < data_job_info.length; i++) {
            liStr+='<li onmouseover="mouseover(this)" onmouseout="mouseout()">'+data_job_info[i].city+' '+data_job_info[i].company_name+' '+data_job_info[i].salary+' '+data_job_info[i].tag+'</li>';
            };
	oUl.innerHTML=liStr;
	}
	
$(function () {
function addBox(result){
            //result是一个集合,所以需要先遍历
            $.each(result,function(index,obj){
                $("#box").append("<div class='product'>"+//获得图片地址
                    "<div><img class='img' src="+obj['url']+"/></div>"+
                    //获得名字
                    "<div class='p1 p'>"+obj['name']+"</div>"+
                    //获得性别
                    "<div class='p2 p'>"+obj['sex']+"</div>"+
                    //获得邮箱地址
                    "<div class='p3 p'>"+obj['email']+"</div>"+
                    "</div>");
            });
        }

    echarts_2();
    map();
    echarts_3();
    echarts_4();
    echarts_6();

    function echarts_1() {
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('echarts_1'));

        var data = [
            {value: 12,name: '计算机'},
            {value: 13,name: '金融'},
            {value: 70,name: '会计'},
            {value: 52,name: '工程师'},
            {value: 35,name: '电商'}
        ];

        option = {
            backgroundColor: 'rgba(0,0,0,0)',
            tooltip: {
                trigger: 'item',
                formatter: "{b}: <br/>{c} ({d}%)"
            },
            color: ['#af89d6', '#4ac7f5', '#0089ff', '#f36f8a', '#f5c847'],
            legend: { //图例组件，颜色和名字
                x: '70%',
                y: 'center',
                orient: 'vertical',
                itemGap: 12, //图例每项之间的间隔
                itemWidth: 10,
                itemHeight: 10,
                icon: 'rect',
                data: ['行业一', '行业二', '行业三', '行业四', '行业五'],
                textStyle: {
                    color: [],
                    fontStyle: 'normal',
                    fontFamily: '微软雅黑',
                    fontSize: 12,
                }
            },
            series: [{
                name: '行业占比',
                type: 'pie',
                clockwise: false, //饼图的扇区是否是顺时针排布
                minAngle: 20, //最小的扇区角度（0 ~ 360）
                center: ['35%', '50%'], //饼图的中心（圆心）坐标
                radius: [50, 75], //饼图的半径
                avoidLabelOverlap: true, ////是否启用防止标签重叠
                itemStyle: { //图形样式
                    normal: {
                        borderColor: '#1e2239',
                        borderWidth: 2,
                    },
                },
                label: { //标签的位置
                    normal: {
                        show: true,
                        position: 'inside', //标签的位置
                        formatter: "{d}%",
                        textStyle: {
                            color: '#fff',
                        }
                    },
                    emphasis: {
                        show: true,
                        textStyle: {
                            fontWeight: 'bold'
                        }
                    }
                },
                data: data
            }, {
                name: '',
                type: 'pie',
                clockwise: false,
                silent: true,
                minAngle: 20, //最小的扇区角度（0 ~ 360）
                center: ['35%', '50%'], //饼图的中心（圆心）坐标
                radius: [0, 40], //饼图的半径
                itemStyle: { //图形样式
                    normal: {
                        borderColor: '#1e2239',
                        borderWidth: 1.5,
                        opacity: 0.21,
                    }
                },
                label: { //标签的位置
                    normal: {
                        show: false,
                    }
                },
                data: data
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
        window.addEventListener("resize",function(){
            myChart.resize();
        });
    }
    function echarts_2() {
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('echarts_2'));
		var zpzs=192894;
		var data_tmp=sdata.tag_top;
        option = {
            backgroundColor: 'rgba(0,0,0,0)',
            tooltip: {
                trigger: 'item',
                formatter: "{b}: <br/>{c}名({d}%)"
            },
            legend: {
                x: 'center',
                y: '2%',
                // data: ['吃饭', '睡觉', '打架', '吵架', '劝架'],
				 data: ['其他', data_tmp[3].name, data_tmp[0].name, data_tmp[2].name, data_tmp[1].name],
                icon: 'circle',
                textStyle: {
                    color: '#b6b5ab',
                }
            },
            calculable: true,
            series: [{
                name: '车型',
                type: 'pie',
                //起始角度，支持范围[0, 360]
                startAngle: 0,
                //饼图的半径，数组的第一项是内半径，第二项是外半径
                radius: [41, 110],
                //支持设置成百分比，设置成百分比时第一项是相对于容器宽度，第二项是相对于容器高度
                center: ['50%', '20%'],
                //是否展示成南丁格尔图，通过半径区分数据大小。可选择两种模式：
                // 'radius' 面积展现数据的百分比，半径展现数据的大小。
                //  'area' 所有扇区面积相同，仅通过半径展现数据大小
                roseType: 'area',
                //是否启用防止标签重叠策略，默认开启，圆环图这个例子中需要强制所有标签放在中心位置，可以将该值设为 false。
                avoidLabelOverlap: false,
                label: {
                    normal: {
                        show: true,
                        formatter: '{c}个'
                    },
                    emphasis: {
                        show: true
                    }
                },
                labelLine: {
                    normal: {
                        show: true,
                        length2: 1,
                    },
                    emphasis: {
                        show: true
                    }
                },
                data: [{
                    value: zpzs- data_tmp[0].value- data_tmp[1].value- data_tmp[2].value- data_tmp[3].value,
                    name: '其他',
                    itemStyle: {
                        normal: {
                            color: '#f845f1'
                        }
                    }
                },
                    {
                        value: data_tmp[3].value,
                        name: data_tmp[3].name,
                        itemStyle: {
                            normal: {
                                color: '#ad46f3'
                            }
                        }
                    },
                    {
                        value: data_tmp[0].value,
                        name: data_tmp[0].name,
                        itemStyle: {
                            normal: {
                                color: '#5045f6'
                            }
                        }
                    },
                    {
                        value: data_tmp[2].value,
                        name: data_tmp[2].name,
                        itemStyle: {
                            normal: {
                                color: '#4777f5'
                            }
                        }
                    },
                    {
                       value: data_tmp[1].value,
                       name: data_tmp[1].name,
                        itemStyle: {
                            normal: {
                                color: '#44aff0'
                            }
                        }
                    },

                    {
                        value: 0,
                        name: "其他",
                        label: {
                            show: false
                        },
                        labelLine: {
                            show: false
                        }
                    },
                    { 
                        value: 0,
                        name: "",
                        label: {
                            show: false
                        },
                        labelLine: {
                            show: false
                        }
                    },
                    {
                        value: 0,
                        name: "",
                        label: {
                            show: false
                        },
                        labelLine: {
                            show: false
                        }
                    },
                    {
                        value: 0,
                        name: "",
                        label: {
                            show: false
                        },
                        labelLine: {
                            show: false
                        }
                    },
                    {
                        value: 0,
                        name: "",
                        label: {
                            show: false
                        },
                        labelLine: {
                            show: false
                        }
                    }
                ]
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
        window.addEventListener("resize",function(){
            myChart.resize();
        });
    }
    function map() {
        // 基于准备好的dom，初始化echarts实例
		var cityData=sdata.city;
		
        var myChart = echarts.init(document.getElementById('map'));

        var nameColor = "rgb(55, 75, 113)"
        var name_fontFamily = '宋体'
        var name_fontSize = 35
        var mapName = 'china'
        var data = []
        var geoCoordMap = {};
        var toolTipData = [];

        /*获取地图数据*/
        myChart.showLoading();
        var mapFeatures = echarts.getMap(mapName).geoJson.features;
        myChart.hideLoading();
		
        mapFeatures.forEach(function(v) {
            // 地区名称
            var name = v.properties.name;
			var citydata;
			
			for(var cityI=0;cityI<cityData.length;cityI++){
				
				if(cityData[cityI].name==name){
					citydata=cityData[cityI];
					break;
				}
			}
				
			if(citydata==undefined||citydata==null){
				citydata=eval("({'main':'未知','variety':'0'})");
			}
            // 地区经纬度
            geoCoordMap[name] = v.properties.cp;
            data.push({
                name: name,
                value: Math.round(Math.random() * 100 + 10)
            })
            toolTipData.push({
                name: name,
                value: [{
                    name: "热门职业（IT）",
                    value: citydata.main
                },
                    {
                        name: "岗位种类数量",
                        value: citydata.variety+"种"
                    },
                    {
                        name: "平均薪资",
                        value: citydata.salary+"￥"
                    }
                ]
            })
        });

        var max = 480,
            min = 9; // todo
        var maxSize4Pin = 50,
            minSize4Pin = 20;

        var convertData = function(data) {
            var res = [];
            for (var i = 0; i < data.length; i++) {
                var geoCoord = geoCoordMap[data[i].name];
                if (geoCoord) {
                    res.push({
                        name: data[i].name,
                        value: geoCoord.concat(data[i].value),
                    });
                }
            }
            return res;
        };

        option = {



            tooltip: {
                trigger: 'item',
                formatter: function(params) {
                    if (typeof(params.value)[2] == "undefined") {
                        var toolTiphtml = ''
                        for(var i = 0;i<toolTipData.length;i++){
                            if(params.name==toolTipData[i].name){
                                toolTiphtml += toolTipData[i].name+':<br>'
                                for(var j = 0;j<toolTipData[i].value.length;j++){
                                    toolTiphtml+=toolTipData[i].value[j].name+':'+toolTipData[i].value[j].value+"<br>"
                                }
                            }
                        }
                        //console.log(toolTiphtml)
                        // console.log(convertData(data))
                        return toolTiphtml;
                    } else {
                        var toolTiphtml = ''
                        for(var i = 0;i<toolTipData.length;i++){
                            if(params.name==toolTipData[i].name){
                                toolTiphtml += toolTipData[i].name+':<br>'
                                for(var j = 0;j<toolTipData[i].value.length;j++){
                                    toolTiphtml+=toolTipData[i].value[j].name+':'+toolTipData[i].value[j].value+"<br>"
                                }
                            }
                        }
                        //console.log(toolTiphtml)
                        // console.log(convertData(data))
                        return toolTiphtml;
                    }
                }
            },
            legend: {
                orient: 'vertical',
                y: 'bottom',
                x: 'right',
                data: ['credit_pm2.5'],
                textStyle: {
                    color: '#fff'
                }
            },
            visualMap: {
                show: false,
                min: 0,
                max: 600,
                left: 'left',
                top: 'bottom',
                text: ['高', '低'], // 文本，默认为数值文本
                calculable: true,
                seriesIndex: [1],
                inRange: {
                    // color: ['#3B5077', '#031525'] // 蓝黑
                    // color: ['#ffc0cb', '#800080'] // 红紫
                    // color: ['#3C3B3F', '#605C3C'] // 黑绿
                    //  color: ['#0f0c29', '#302b63', '#24243e'] // 黑紫黑
                    // color: ['#23074d', '#cc5333'] // 紫红
                    //   color: ['#00467F', '#A5CC82'] // 蓝绿
                    // color: ['#1488CC', '#2B32B2'] // 浅蓝
                    // color: ['#00467F', '#A5CC82','#ffc0cb'] // 蓝绿红
                    // color: ['#00467F', '#A5CC82'] // 蓝绿
                    // color: ['#00467F', '#A5CC82'] // 蓝绿
                    // color: ['#00467F', '#A5CC82'] // 蓝绿
                    color: ['#4c60ff','#CBE54E'] // 蓝绿
                }
            },
            /*工具按钮组*/
            toolbox: {
                show: false,
                orient: 'vertical',
                left: 'right',
                top: 'center',
                feature: {

                    dataView: {
                        readOnly: false
                    },
                    restore: {},
                    saveAsImage: {}
                }
            },
            geo: {
                show: true,
                map: mapName,
                label: {
                    normal: {
                        show: false
                    },
                    emphasis: {
                        show: false
                    }
                },
                roam: true,//控制是否移动
                itemStyle: {
                    normal: {
                        areaColor: '#4c60ff',
                        borderColor: '#002097'
                    },
                    emphasis: {
                        areaColor: '#293fff'
                    }
                }
            },
            series: [{
                name: '散点',
                type: 'scatter',
                coordinateSystem: 'geo',
                data: convertData(data),
                symbolSize: function(val) {
                    return val[2] / 10;
                },
                label: {
                    normal: {
                        formatter: '{b}',
                        position: 'right',
                        show: false
                    },
                    emphasis: {
                        show: false
                    }
                },
                itemStyle: {
                    normal: {
                        color: 'rgba(255,255,0,0.8)'//地图上点的颜色
                    }
                }
            },
                {
                    type: 'map',
                    map: mapName,
                    geoIndex: 0,
                    aspectScale: 0.75, //长宽比
                    showLegendSymbol: false, // 存在legend时显示
                    label: {
                        normal: {
                            show: true
                        },
                        emphasis: {
                            show: false,
                            textStyle: {
                                color: '#fff'
                            }
                        }
                    },
                    roam: true,
                    itemStyle: {
                        normal: {
                            areaColor: '#031525',//不知道
                            borderColor: '#3B5077',//不知道
                        },
                        emphasis: {
                            areaColor: '#2B91B7'//不知道
                        }
                    },
                    animation: false,
                    data: data
                },
                {
                    name: '点',
                    type: 'scatter',
                    coordinateSystem: 'geo',
                    symbol: 'pin', //气泡
                    symbolSize: function(val) {
                        var a = (maxSize4Pin - minSize4Pin) / (max - min);
                        var b = minSize4Pin - a * min;
                        b = maxSize4Pin - a * max;
                        return a * val[2] + b;
                    },
                    label: {

                        normal: {
                            show: false,
                            formatter:function (params) { return params.data.value[2] },
                            textStyle: {
                                color: '#fff',//我也不知道这啥
                                fontSize: 9,
                            }
                        }
                    },
                    itemStyle: {

                        normal: {
                            color: 'rgba(255,255,0,0)', //标志颜色,类似于地图标点的一个指针，在这里显示无色
                        }
                    },
                    zlevel: 6,
                    data: convertData(data),
                },
                {
                    name: 'Top 5',
                    type: 'effectScatter',
                    coordinateSystem: 'geo',
                    data: convertData(data.sort(function(a, b) {
                        return b.value - a.value;
                    }).slice(0, 5)),
                    symbolSize: function(val) {
                        return val[2] / 10;
                    },
                    showEffectOn: 'render',
                    rippleEffect: {
                        brushType: 'stroke'
                    },
                    hoverAnimation: true,
                    label: {
                        normal: {
                            formatter: '{b}',
                            position: 'right',
                            show: true
                        }
                    },
                    itemStyle: {
                        normal: {
                            color: 'rgba(255,255,0,0.8)',
                            shadowBlur: 10,
                            shadowColor: '#05C3F9'
                        }
                    },
                    zlevel: 1
                },

            ]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
        window.addEventListener("resize",function(){
            myChart.resize();
        });
    }
    function echarts_3() {
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('echarts_3'));
		var data_tmp=sdata.city;
		
		
        option = {

            tooltip : {
                trigger: 'axis',
				formatter: "{b}: <br/>{c}￥"
            },
            legend: {
                orient: 'vertical',
                data:['简易程序案件数']
            },
            grid: {
                left: '3%',
                right: '3%',
                top:'8%',
                bottom: '5%',
                containLabel: true
            },
            color:['#CBE54E'],//线的颜色
            toolbox: {
                show : false,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },

            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    axisTick:{show:false},
                    boundaryGap : false,
                    axisLabel: {
                        textStyle:{
                            color: '#b6b5ab',//字的颜色
                            fontSize:'12'
                        },
                        lineStyle:{
                            color:'#2c3459',
                        },
                        interval: {default: 0},
                        rotate:50,
                        formatter : function(params){
                            var newParamsName = "";// 最终拼接成的字符串
                            var paramsNameNumber = params.length;// 实际标签的个数
                            var provideNumber = 4;// 每行能显示的字的个数
                            var rowNumber = Math.ceil(paramsNameNumber / provideNumber);// 换行的话，需要显示几行，向上取整
                            /**
                             * 判断标签的个数是否大于规定的个数， 如果大于，则进行换行处理 如果不大于，即等于或小于，就返回原标签
                             */
                            // 条件等同于rowNumber>1
                            if (paramsNameNumber > provideNumber) {
                                /** 循环每一行,p表示行 */
                                var tempStr = "";
                                tempStr=params.substring(0,4);
                                newParamsName = tempStr+"...";// 最终拼成的字符串
                            } else {
                                // 将旧标签的值赋给新标签
                                newParamsName = params;
                            }
                            //将最终的字符串返回
                            return newParamsName
                        }

                    },
                    data: [ data_tmp[0].name,data_tmp[1].name,data_tmp[2].name,data_tmp[3].name,data_tmp[4].name,data_tmp[5].name,data_tmp[6].name,
							data_tmp[7].name,data_tmp[8].name,data_tmp[9].name,data_tmp[10].name,data_tmp[11].name,data_tmp[12].name,data_tmp[13].name,
							data_tmp[14].name,data_tmp[15].name,data_tmp[16].name,data_tmp[17].name,
							data_tmp[18].name,data_tmp[19].name,data_tmp[20].name,data_tmp[21].name,
							data_tmp[22].name,data_tmp[23].name,data_tmp[24].name,data_tmp[25].name,
							data_tmp[26].name,data_tmp[27].name,data_tmp[28].name,data_tmp[29].name,data_tmp[30].name,data_tmp[31].name,data_tmp[32].name,data_tmp[33].name]
                }
            ],
            yAxis : {

                type : 'value',
                axisLabel: {
                    textStyle: {
                        color: '#b6b5ab',//数值颜色
                        fontSize:'12',
                    }
                },
                axisLine: {
                    lineStyle:{
                        color:'rgba(160,160,160,0.3)',
                    }
                },
                splitLine: {
                    lineStyle:{
                        color:'rgba(160,160,160,0.3)',
                    }
                },

            }
            ,
            series : [
                {
                    // name:'简易程序案件数',
                    type:'line',
                    areaStyle: {

                        normal: {type: 'default',
                            color: new echarts.graphic.LinearGradient(0, 0, 0, 0.8, [{
                                offset: 0,
                                color: '#CBE54E'//峰值颜色
                            }, {
                                offset: 1,
                                color: '#4c60ff'//全部颜色
                            }], false)
                        }
                    },
                    smooth:true,
                    itemStyle: {
                        normal: {areaStyle: {type: 'default'}}
                    },
                    data:[data_tmp[0].salary,data_tmp[1].salary,data_tmp[2].salary,data_tmp[3].salary,data_tmp[4].salary,data_tmp[5].salary,data_tmp[6].salary,data_tmp[7].salary,data_tmp[8].salary,data_tmp[9].salary,data_tmp[10].salary,
data_tmp[11].salary,data_tmp[12].salary,data_tmp[13].salary,data_tmp[14].salary,data_tmp[15].salary,data_tmp[16].salary,data_tmp[17].salary,data_tmp[18].salary,data_tmp[19].salary,data_tmp[20].salary,data_tmp[21].salary,data_tmp[22].salary,data_tmp[23].salary,data_tmp[24].salary,data_tmp[25].salary,data_tmp[26].salary,data_tmp[27].salary,data_tmp[28].salary,data_tmp[29].salary,data_tmp[30].salary,data_tmp[31].salary,data_tmp[32].salary,data_tmp[33].salary]
                }
            ]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
        window.addEventListener("resize",function(){
            myChart.resize();
        });
    }
    function echarts_4() {
		
		var salaryData_5=sdata.salary;
		var key=new Array();
		var keyI=0;
		for(var k in salaryData_5){
			key[keyI]=k;
			keyI++;
		}
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('echarts_4'));

        option = {

            tooltip : {
                trigger: 'item',
				formatter: "{b}: <br/>{c}￥"
            },

            toolbox: {
                show : false,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {
                        show: true,
                        type: ['pie', 'funnel']
                    },
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            series : [

                {
                    name:'信息',
                    type:'pie',
                    color: ['#af89d6', '#f5c847', '#ff999a', '#0089ff','#25f3e6'],
                    radius : [20, 100],
                    center : ['50%', '50%'],
                    roseType : 'area',
                    data:[
                        {value:salaryData_5[key[0]], name:'NO1.'+key[0]},
                        {value:salaryData_5[key[1]], name:'NO2.'+key[1]},
                        {value:salaryData_5[key[2]], name:'NO3.'+key[2]},
                        {value:salaryData_5[key[3]], name:'NO4.'+key[3]},
                        {value:salaryData_5[key[4]], name:'NO5.'+key[4]},
						{value:salaryData_5[key[5]], name:'NO6.'+key[5]},
						{value:salaryData_5[key[6]], name:'NO7.'+key[6]},
						{value:salaryData_5[key[7]], name:'NO8.'+key[7]},
						{value:salaryData_5[key[8]], name:'NO9.'+key[8]},
						{value:salaryData_5[key[9]], name:'NO10.'+key[9]},

                    ]
                }
            ]
        };


        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
        window.addEventListener("resize",function(){
            myChart.resize();
        });
    }
	
    function echarts_5() {
        
		
		var salary=sdata.salary;
		var salary_i=0;
		
		var salary_data_x = new Array();
		var salary_data_y = new Array();
		for(var key in salary){
			salary_i++;
			if(salary_i<5) continue;
			salary_data_x[salary_i-5]=key;
			salary_data_y[salary_i-5]=salary[key];
		}
        var myChart = echarts.init(document.getElementById('echarts_5'));

        var xData = salary_data_x;

        var data = salary_data_y;

        option = {
            // backgroundColor: "#141f56",

            tooltip: {
                show: "true",
                trigger: 'item',
                backgroundColor: 'rgba(0,0,0,0.4)', // 背景
                padding: [8, 10], //内边距
                // extraCssText: 'box-shadow: 0 0 3px rgba(255, 255, 255, 0.4);', //添加阴影
                formatter: function(params) {
                    if (params.seriesName != "") {
                        return params.name + ' ：  ' + params.value + '元';
                    }
                },

            },
            grid: {
                borderWidth: 0,
                top: 20,
                bottom: 35,
                left:55,
                right:30,
                textStyle: {
                    color: "#fff"
                }
            },
            xAxis: [{
                type: 'category',

                axisTick: {
                    show: false
                },
                axisLine: {
                    show: true,
                    lineStyle: {
                        color: '#363e83',
                    }
                },
                axisLabel: {
                    inside: false,
                    textStyle: {
                        color: '#bac0c0',
                        fontWeight: 'normal',
                        fontSize: '12',
                    },
                    // formatter:function(val){
                    //     return val.split("").join("\n")
                    // },
                },
                data: xData,
            }, {
                type: 'category',
                axisLine: {
                    show: false
                },
                axisTick: {
                    show: false
                },
                axisLabel: {
                    show: false
                },
                splitArea: {
                    show: false
                },
                splitLine: {
                    show: false
                },
                data: xData,
            }],
            yAxis: {
                type: 'value',
                axisTick: {
                    show: false
                },
                axisLine: {
                    show: true,
                    lineStyle: {
                        color: '#32346c',
                    }
                },
                splitLine: {
                    show: true,
                    lineStyle: {
                        color: '#32346c ',
                    }
                },
                axisLabel: {
                    textStyle: {
                        color: '#bac0c0',
                        fontWeight: 'normal',
                        fontSize: '12',
                    },
                    formatter: '{value}',
                },
            },
            series: [{
                // name: '生师比(%)',
                type: 'bar',
                itemStyle: {
                    normal: {
                        show: true,
                        color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                            offset: 0,
                            color: '#00c0e9'
                        }, {
                            offset: 1,
                            color: '#3b73cf'
                        }]),
                        barBorderRadius: 50,
                        borderWidth: 0,
                    },
                    emphasis: {
                        shadowBlur: 15,
                        shadowColor: 'rgba(105,123, 214, 0.7)'
                    }
                },
                zlevel: 2,
                barWidth: '20%',
                data: data,
            },
                {
                    name: '',
                    type: 'bar',
                    xAxisIndex: 1,
                    zlevel: 1,
                    itemStyle: {
                        normal: {
                            color: '#121847',
                            borderWidth: 0,
                            shadowBlur: {
                                shadowColor: 'rgba(255,255,255,0.31)',
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowOffsetY: 2,
                            },
                        }
                    },
                    barWidth: '20%',
                    data: [30, 30, 30, 30, 30]
                }
            ]
        }


        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
        window.addEventListener("resize",function(){
            myChart.resize();
        });
    }
    function echarts_6() {
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('echarts_6'));
		var data_tmp=sdata.tag_top;
        var data = {
            "chart": [{
                month: data_tmp[0].name.slice(0,data_tmp[0].name.length/2)+"\n"+data_tmp[0].name.slice(data_tmp[0].name.length/2,data_tmp[0].name.length),
                value: data_tmp[0].value,

            },

                {
                     month: data_tmp[1].name.slice(0,data_tmp[1].name.length/2)+"\n"+data_tmp[1].name.slice(data_tmp[1].name.length/2,data_tmp[1].name.length),
                    value: data_tmp[1].value

                },

                {
                    month: data_tmp[2].name.slice(0,data_tmp[2].name.length/2)+"\n"+data_tmp[2].name.slice(data_tmp[2].name.length/2,data_tmp[2].name.length),
                    value: data_tmp[2].value

                },

                {
                    month: data_tmp[3].name.slice(0,data_tmp[3].name.length/2)+"\n"+data_tmp[3].name.slice(data_tmp[3].name.length/2,data_tmp[3].name.length),
                    value: data_tmp[3].value

                },

                {
                     month: data_tmp[4].name.slice(0,data_tmp[4].name.length/2)+"\n"+data_tmp[4].name.slice(data_tmp[4].name.length/2,data_tmp[4].name.length),
                    value: data_tmp[4].value

                }

            ]
        }


        var xAxisMonth = [],
            barData = [],
            lineData = [];
        for (var i = 0; i < data.chart.length; i++) {
            xAxisMonth.push(data.chart[i].month);
            barData.push({
                "name": xAxisMonth[i],
                "value": data.chart[i].value
            });
            lineData.push({
                "name": xAxisMonth[i],
                "value": data.chart[i].ratio
            });
        }

        option = {
            // backgroundColor: "#020d22",
            title: '',
            grid: {
                top: '10%',
                left: '18%',
                bottom: '3%',
                right:'5%',
                containLabel: true
            },
            tooltip: {
                trigger: 'axis',
				formatter: "{b}: <br/>{c}名",
                axisPointer: {
                    type: 'none'
                },
                formatter: function(params) {
                    return params[0]["data"].name + "<br/>" + '招聘岗位: ' + params[1]["data"].value+'名' ;
                }
            },
            xAxis: [{
                type: 'category',
                show: false,
                data: ['NO.1', 'NO.2', 'NO.3', 'NO.4', 'NO.5'],
                axisLabel: {
                    textStyle: {
                        color: '#b6b5ab'
                    }
                }
            },
                {
                    type: 'category',
                    position: "bottom",
                    data: xAxisMonth,
                    boundaryGap: true,
                    // offset: 40,
                    splitLine: {
                        show: false,
                        lineStyle: {
                            color: "rgba(255,255,255,0.2)"
                        }
                    },
                    axisTick: {
                        show: false
                    },
                    axisLine: {
                        show: true,
                        color: "rgba(255,255,255,0.2)"
                    },
                    axisLabel: {
                        textStyle: {
                            color: '#b6b5ab'
                        }
                    }
                }

            ],
            yAxis: [{
                show: true,
                offset: 52,
                splitLine: {
                    show: false,
                    lineStyle: {
                        color: "rgba(255,255,255,0.2)"
                    }
                },
                axisTick: {
                    show: false
                },
                axisLine: {
                    show: true,
                    color: "rgba(255,255,255,0.2)"
                },
                axisLabel: {
                    show: true,
                    color: '#b6b5ab'
                }
            }, {
                show: false,
                type: "value",
                // name: "合格率(%)",
                nameTextStyle: {
                    color: '#ccc'
                },
                axisLabel: {
                    color: '#ccc'
                },
                splitLine: {
                    show: false
                },
                axisLine: {
                    show: true
                },
                axisTick: {
                    show: true
                }
            }],
            color: ['#e54035'],
            series: [{
                name: '训练人次',
                type: 'pictorialBar',
                xAxisIndex: 1,
                barCategoryGap: '-80%',
                // barCategoryGap: '-5%',
                symbol: 'path://d="M150 50 L130 130 L170 130  Z"',
                itemStyle: {
                    normal: {
                        color: function(params) {
                            var colorList = [
                                'rgba(13,177,205,0.8)', 'rgba(29,103,182,0.6)',
                                'rgba(13,177,205,0.8)', 'rgba(29,103,182,0.6)',
                                'rgba(13,177,205,0.8)', 'rgba(29,103,182,0.6)'
                            ];
                            return colorList[params.dataIndex];
                        }
                    },
                    emphasis: {
                        opacity: 1
                    }
                },
                data: barData,
            },
                {
                    symbol: 'image://data:image/png;base64,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',
                    symbolSize: 42,
                    name: "完成率",
                    type: "line",
                    yAxisIndex: 1,
                    data: lineData,
                    itemStyle: {
                        normal: {
                            borderWidth: 5,
                            color: {
                                colorStops: [{
                                    offset: 0,
                                    color: '#821eff'
                                },

                                    {
                                        offset: 1,
                                        color: '#204fff'
                                    }
                                ],
                            }
                        }
                    }
                }
            ]
        }


        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
        window.addEventListener("resize",function(){
            myChart.resize();
        });
    }






})

