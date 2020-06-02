package test.hive.udf.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SliptW3 {
	public ArrayList<String> readtxt(ArrayList<String> cibiao) throws IOException {
		InputStream is=this.getClass().getResourceAsStream("cibiao.txt");
		InputStreamReader read1 = new InputStreamReader(is, "utf-8");
		BufferedReader br = new BufferedReader(read1);
		  String line="";
		  line = br.readLine();  
          while (line != null) {  
              line = br.readLine(); 
              cibiao.add(line);
          } 
          return cibiao;
	}
	public boolean Judge(String string,ArrayList<String> cibiao) {
		for(int i=0;i<cibiao.size()-1;i++) {
			if(cibiao.get(i).length()<string.length()) {
				continue;
			}
			else {
				if(cibiao.get(i).substring(0, string.length()).equals(string)) {
					return true;
				}
			}
		}
		return false;
	}
	public ArrayList<String> delete(ArrayList<String> cibiao,ArrayList<String> cibiao1){
		
		for(int i=0;i<cibiao1.size();i++) {
			if(!cibiao.contains(cibiao1.get(i))) {
				cibiao1.remove(i);i--;
			}
		}
		return cibiao1;
		
	}
	public ArrayList<String> sliptword(String string,ArrayList<String> cibiao) throws IOException {
		cibiao=readtxt(cibiao);
		ArrayList<String> cibiao2=new ArrayList<String>();	
		int begin=0;String str="";int w=0;
		for(int i=1;i<=string.length();i++) {
			if(string.length()==i)str=string.substring(begin).toLowerCase();
			else str=string.substring(begin, i).toLowerCase();
			if(str.charAt(0)>=65&&str.charAt(0)<=90||str.charAt(0)>=97&&str.charAt(0)<=122) w=1;
			if(!Judge(str,cibiao)) {
			
				if(str.length()>1) {
					
					if(w==1&&str.charAt(str.length()-1)>=65&&str.charAt(str.length()-1)<=90||str.charAt(str.length()-1)>=97&&str.charAt(str.length()-1)<=122) {
						cibiao2.add(str);w=0;
					}
					else {
					cibiao2.add(str.substring(0, str.length()-1));i--;
					}
				}
				else {					
					cibiao2.add(str);					
				}
				begin=i;
			}
			else if(string.length()==i) {
				if(str.length()==1&&w==1&&string.charAt(string.length()-1)>=65&&string.charAt(string.length()-1)<=90||string.charAt(string.length()-1)>=97&&string.charAt(string.length()-1)<=122) {
					continue;
				}
				cibiao2.add(str);			
			}
		}		
		return delete(cibiao,cibiao2);
	}
	public ArrayList<String> readtxt(String str) throws IOException {
		ArrayList<String> province=new ArrayList<String>();
		InputStream is=this.getClass().getResourceAsStream(str);
		InputStreamReader reader = new InputStreamReader(is,"utf-8");
		  BufferedReader br = new BufferedReader(reader);
		  String line="";
		  line = br.readLine();  
          while (line != null) {  
              line = br.readLine(); 
              province.add(line);
          } 
          return province;
	}
public String city(ArrayList<String> province,String string) {
		
		for(int i=0;i<province.size()-1;i++) {
			String[] pro=province.get(i).split(",");
			for(int j=0;j<pro.length;j++) {
		      if(string.contains(pro[j])) {
		    	  return pro[0];
		      }		
			}
		}
		return "1";
	}
	public String Mcity(String str2) throws IOException {
		ArrayList<String> province=readtxt("province.txt");
		String str="1";
		str=city(province,str2);
				if(!str.equals("1"))
					return str;
				return "";
	}
	
	public static void main(String[] args) throws IOException {
		String str="\\\"(1)Java讲师招聘:1、负责java相关课程的授课；2、负责参与java课程体系的建设和完善；3、熟悉web前端编程（Html+CSS+JavaScript)4.精通Java核心语法.精通Java基础&高级（IO、多线程、线程池、集合进阶、反射、Socket）JavaWeb（MySQL、JDBC、Servlet、过滤器、监听器、内置对象、JSTL、JavaBean、用户管理系统）& RIA（JQuery、Ajax、BootStrap、EsayUI、正则表达式、XML解析、内容发布系统：用户管理、登录注册、内容发布）5.有很强的动手编码能力,以编码驱动教学，带领学生java web项目实践；6.表达能力强，声音清晰自然，个性开朗，乐于与人交流；7.有过教学经验,并且是所在培训机构学生口碑最好的讲师,优先考虑(2) web前端讲师招聘岗位职责：1、负责web前端相关课程（HTML、DIV+CSS、JavaScript）的授课；2、负责参与web前端课程体系的建设和完善；3、负责前台脚本程序开发，如校验、特效等用户体验的前端效果 ；4、有HTML5或手机APP前端开发经验最好优先考虑。任职要求：1、计算机相关专业毕业；酷爱本职工作，并乐于钻研WEB前端效果的技巧与实现；2、精通：HTML、DIV+CSS、JavaScript等页面技术 ；3.有很强的动手编码能力,以编码驱动教学，带领学生java web项目实践；4.表达能力强，声音清晰自然，个性开朗，乐于与人交流；5.有过教学经验,并且是所在培训机构学生口碑最好的讲师,优先考虑 (3)大数据平台讲师招聘:1. 有丰富的大数据开发经验2. 熟悉大数据离线计算生态（Hadoop、Sqoop、Hive、HBase、Spark、调度框架等）；3. 熟悉大数据实时计算生态（Storm、Spark、Flume、Kafka等）；4. 熟悉分布式系统、负载均衡技术、搜索技术等；5. 沟通表达能力强，声音清晰自然，个性开朗，乐于与人交流；6. 负责相关课程教学工作，按进度完成教学任务；7. 参与大数据课程研发和后期优化；8. 参与完成教学相关的文档编写工作；9.有过教学经验,并且是所在培训机构学生口碑最好的讲师,优先考虑 (4) Python讲师招聘:1.熟悉python语言，深入理解 python 解释器原理；2.熟练使用python常用模块和linux系统；3.有多年实际项目开发经验，深入掌握 django/tornado/flask 等web框架；4.熟悉MYSQL数据库，参与过至少一到两个电商平台项目的完整开发；5.有3年以上实际项目开发经验，深入掌握 django/tornado/flask 等web框架；6.有过教学经验,并且是所在培训机构学生口碑最好的讲师,优先考虑 (5)人工智能讲师招聘:1. 熟悉至少一种深度学习常用框架，如TensorFlow，PyTorch。在机器学习、智能决策、自然语言处理、语音识别、图像识别等领域有研究或项目经历优先；2. 熟悉机器学习常用算法和原理，如线性回归、逻辑回归、SVM、kmeans、决策树等；3. 熟悉至少一种深度学习模型 如CNN、RNN、KNN等，并掌握相关优化方案；4. 具有较强编程能力，熟练使用python；5. 数学基础良好，熟悉线性代数，概率论与数理统计，矩阵分析，最优化理论，凸优化，数学分析，泛函分析等.岗位职责：1. 负责机器学习/人工智能课程体系设计和完善；2. 负责机器学习/人工智能课程的讲授；3. 负责Python机器学习部分的研究工作；4. 带领学员参加实训并指导学员完成实操项目；5. 根据学生及市场需要，高质量完成授课任务；6. 结合技术发展的发展变化，实时改进教学方法，完善教学体系；7. 完成课程辅导工作，解答学员课程疑问，保证学员的学习质量；8.有过教学经验,并且是所在培训机构学生口碑最好的讲师,优先考虑 （6）物联网讲师招聘: 1.ARM嵌入式培训方向的课程体系建设与实施；2.负责相关的教学资料（实训大纲、教学PPT、教学用书、教学案例等）的研发工作。3.完成嵌入式Linux技术的推广与普及；4.负责产品及项目文档的编写工作。任职要求：1.专科及以上学历，计算机、电子、自动化等相关专业，叁年以上相关领域开发经验；2.精通C、数据结构、嵌入式软件开发、；3.熟悉软件工程、计算机网络、NB-IOT、云计算；4.精通linux shell编程、Makefile编写、linux高级编程；5.语言表达能力强，沟通能力强，责任心强，热衷于技术传播和教育事业；6.有团队精神，普通话标准，口齿清晰，语言逻辑性强；7.有过教学经验,并且是所在培训机构学生口碑最好的讲师,优先考虑.工作地址：贵州工程职业学院查看职位地图\\\"\r\n" + 
				"";
		SliptW3 sliptw3=new SliptW3();
		ArrayList<String> ci = 
				sliptw3.sliptword(str.toString(),new ArrayList<String>());
		for(int i=0;i<ci.size();i++) {
			System.out.println(ci.get(i));
		}
	}
}
