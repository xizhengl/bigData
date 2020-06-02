package other;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Start implements ServletContextListener{
	public static String STR="{\"gjc\":[{\"name\":\"人工智能\",\"avs\":10608,\"candid\":9036,\"bim\":7233,\"automapper\":6714,\"c102\":6298,\"backgroud\":5725,\"block\":5684,\"borderx\":5394,\"awkd\":4323,\"accumulated\":4209},{\"name\":\"数据分析\",\"analyticsjd\":68845,\"b403\":10320,\"auditor\":9649,\"autosvs\":8829,\"auchan\":7591,\"aokeycig\":6893,\"alzheimer\":6313,\"archiving\":5124,\"asahi\":4663,\"assuring\":4354},{\"name\":\"数据分析师\",\"casing\":10400,\"c2\":2071,\"because\":2060,\"adwords\":1612,\"capability\":1523,\"angular\":1395,\"basic\":917,\"c#\":910,\"assisting\":826,\"approvals\":789},{\"name\":\"数据挖掘\",\"attract\":32186,\"cbap\":29143,\"bookkeeping\":15139,\"best\":11094,\"casperjs\":10202,\"allow\":8687,\"agreed\":8413,\"cac\":7670,\"appium\":7212,\"bad\":4876},{\"name\":\"机器学习\",\"caffecet6\":36677,\"broad\":15488,\"begun\":15357,\"c6\":14961,\"assessments\":10736,\"b16\":9531,\"bios\":9117,\"aspen\":7971,\"base\":7236,\"blog\":7060},{\"name\":\"机器视觉\",\"compliance\":1838,\"com\":879,\"but\":554,\"cmu\":377,\"category\":337,\"conduct\":295,\"adas\":250,\"behaviors\":237,\"client\":215,\"collaboratively\":201},{\"name\":\"深度学习\",\"browserify\":28636,\"children\":18429,\"api\":10239,\"ad6\":9028,\"center\":6501,\"assist\":6333,\"clever\":5916,\"cad\":5296,\"characteristics\":5103,\"ckvision\":4551},{\"name\":\"算法\",\"axurerp\":12502,\"candidate\":9956,\"agile\":9948,\"c++socket\":7156,\"arraycomm\":7030,\"cloudera\":4743,\"bitcoin\":4386,\"battery\":4105,\"cmmi\":3686,\"bases\":3645},{\"name\":\"算法工程师\",\"box\":5716,\"ce\":4629,\"ad\":4559,\"asil\":3548,\"api\":3391,\"bootloader7\":2281,\"android \":2166,\"builder\":1816,\"ccss\":1787,\"caption\":1751},{\"name\":\"自然语言处理\",\"bat\":6900,\"because\":5485,\"cialdini\":4044,\"comments\":3512,\"asic\":3338,\"capture\":3015,\"bordering\":2559,\"agile\":2167,\"cblas\":1589,\"between\":1377}],\"salary\":{\"自然语言处理\":41083,\"算法\":36057,\"算法研究员\":31944,\"图像算法\":29902,\"机器学习\":27465,\"图像识别\":27228,\"深度学习\":26840,\"语音识别\":25087,\"图像处理\":23821,\"算法工程师\":21445},\"city\":[{\"name\":\"上海\",\"variety\":13,\"main\":\"人工智能\",\"salary\":\"21208\"},{\"name\":\"云南\",\"variety\":6,\"main\":\"深度学习\",\"salary\":\"7828\"},{\"name\":\"内蒙古\",\"variety\":6,\"main\":\"深度学习\",\"salary\":\"8130\"},{\"name\":\"北京\",\"variety\":15,\"main\":\"图像算法\",\"salary\":\"24295\"},{\"name\":\"台湾\",\"variety\":1,\"main\":\"数据挖掘\",\"salary\":\"12000\"},{\"name\":\"吉林\",\"variety\":6,\"main\":\"机器学习\",\"salary\":\"8527\"},{\"name\":\"四川\",\"variety\":13,\"main\":\"算法\",\"salary\":\"13972\"},{\"name\":\"天津\",\"variety\":13,\"main\":\"机器视觉\",\"salary\":\"11879\"},{\"name\":\"宁夏\",\"variety\":4,\"main\":\"深度学习\",\"salary\":\"6366\"},{\"name\":\"安徽\",\"variety\":11,\"main\":\"算法工程师\",\"salary\":\"12043\"},{\"name\":\"山东\",\"variety\":13,\"main\":\"算法\",\"salary\":\"9809\"},{\"name\":\"山西\",\"variety\":9,\"main\":\"机器视觉\",\"salary\":\"8165\"},{\"name\":\"广东\",\"variety\":13,\"main\":\"数据分析师\",\"salary\":\"17640\"},{\"name\":\"广西\",\"variety\":9,\"main\":\"算法工程师\",\"salary\":\"9773\"},{\"name\":\"新疆\",\"variety\":4,\"main\":\"人工智能\",\"salary\":\"7841\"},{\"name\":\"江苏\",\"variety\":13,\"main\":\"图像识别\",\"salary\":\"15015\"},{\"name\":\"江西\",\"variety\":9,\"main\":\"算法\",\"salary\":\"8887\"},{\"name\":\"河北\",\"variety\":12,\"main\":\"数据分析\",\"salary\":\"8421\"},{\"name\":\"河南\",\"variety\":13,\"main\":\"数据分析\",\"salary\":\"9287\"},{\"name\":\"浙江\",\"variety\":13,\"main\":\"机器视觉\",\"salary\":\"19654\"},{\"name\":\"海南\",\"variety\":10,\"main\":\"数据分析师\",\"salary\":\"18282\"},{\"name\":\"湖北\",\"variety\":13,\"main\":\"算法工程师\",\"salary\":\"11837\"},{\"name\":\"湖南\",\"variety\":13,\"main\":\"深度学习\",\"salary\":\"11437\"},{\"name\":\"澳门\",\"variety\":2,\"main\":\"深度学习\",\"salary\":\"10125\"},{\"name\":\"甘肃\",\"variety\":7,\"main\":\"数据挖掘\",\"salary\":\"7500\"},{\"name\":\"福建\",\"variety\":13,\"main\":\"机器视觉\",\"salary\":\"13592\"},{\"name\":\"西藏\",\"variety\":4,\"main\":\"自然语言处理\",\"salary\":\"18214\"},{\"name\":\"贵州\",\"variety\":11,\"main\":\"深度学习\",\"salary\":\"9518\"},{\"name\":\"辽宁\",\"variety\":10,\"main\":\"图像处理\",\"salary\":\"10120\"},{\"name\":\"重庆\",\"variety\":13,\"main\":\"数据分析师\",\"salary\":\"12039\"},{\"name\":\"陕西\",\"variety\":13,\"main\":\"语音识别\",\"salary\":\"12457\"},{\"name\":\"青海\",\"variety\":4,\"main\":\"人工智能\",\"salary\":\"12555\"},{\"name\":\"香港\",\"variety\":8,\"main\":\"算法工程师\",\"salary\":\"12338\"},{\"name\":\"黑龙江\",\"variety\":7,\"main\":\"机器学习\",\"salary\":\"9195\"}],\"tag_top\":[{\"name\":\"人工智能\",\"value\":28370},{\"name\":\"数据分析\",\"value\":54525},{\"name\":\"数据分析师\",\"value\":6571},{\"name\":\"数据挖掘\",\"value\":29440},{\"name\":\"机器学习\",\"value\":23449}],\"job_info\":[]}";
	private static int I=0;
	 @Override  
	    public void contextInitialized(ServletContextEvent event) {
		 I++;
		 System.out.println("访问Hbase"+I);
		 HbaseDemo h=new HbaseDemo();
		 ReadFile r=new ReadFile();
		 //STR=h.queryAllTable("h_top_tag_gjc5","h_tag_salary_top","h_city_tag_salary","h_tag_top","h_job_info2");
		 ArrayList<String> list=r.readtxt_absolute("/usr/hadoop/shell/tmp.txt");
		 if(list.size()!=5) list=r.readtxt("table.txt");
		  
		 System.out.println("表格："+list.get(1)+","+list.get(2)+","+list.get(3)+","+list.get(0)+","+list.get(4));
		 if(list.size()==5)
		 STR=h.queryAllTable(list.get(1),list.get(2),list.get(3),list.get(0),list.get(4));
		 else
			 System.out.println("表格错误");
	 }  
	    @Override  
	    public void contextDestroyed(ServletContextEvent event) {  
	        }  
}
