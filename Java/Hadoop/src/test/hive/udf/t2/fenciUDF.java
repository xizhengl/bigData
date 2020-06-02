package test.hive.udf.t2;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

import test.hive.udf.t2.Classify;
import test.hive.udf.t2.Classify.ArrayClassity;

@SuppressWarnings("deprecation")
public class fenciUDF extends UDF{
	Text re=new Text();
	Classify cl=new Classify();
	ArrayList<ArrayClassity> cibiao=cl.readtxt("black.txt");
	ArrayList<ArrayClassity> english=cl.readtxt("englishword2.txt");
	ArrayList<ArrayClassity> cibiao1=cl.readtxt("whitenew.txt");
	StringBuffer sb=new StringBuffer();
	BlackST_2 b=new BlackST_2();
	public Text evaluate(Text value) {
		re.set("");
		if(value==null) {
			return re;
		}		
		try {
			ArrayList<String> list=b.Sfun(value.toString(),cibiao,cibiao1,english);

			for(String str:list) {
				if(str.length()>1||(str.length()==1&&(str.equals("r")||str.equals("c")))) {
					sb.append(str);
					sb.append(',');
				}
			}
			if(sb.length()>1) re.set(sb.substring(0,sb.length()-1));
			sb.setLength(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return re;
	}

}
