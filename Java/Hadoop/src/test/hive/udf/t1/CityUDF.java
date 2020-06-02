package test.hive.udf.t1;

import java.io.IOException;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

@SuppressWarnings("deprecation")
public class CityUDF extends UDF{
	SliptW3 sliptw3=new SliptW3();
	Text t=new Text();
	public Text evaluate(Text value) throws IOException {
		Text result=new Text();
		if(value==null) {
			result.set("未分类");
			return result;
		}
		String str=sliptw3.Mcity(value.toString());
		if("".equals(str)) str="未分类";
		t.set(str);
		return t;
	}
}
