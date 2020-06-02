package test.hive.udf.t1;

import java.io.IOException;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

@SuppressWarnings("deprecation")
public class SalaryUDF extends UDF{
	salary s=new salary();
	Text t=new Text();
	public Text evaluate(Text value) throws IOException {
		Text result=new Text();
		if(value==null) {
			result.set("0");
			return result;
		}
		String str=s.count(value.toString())+"";
		t.set(str);
		return t;
	}
}
