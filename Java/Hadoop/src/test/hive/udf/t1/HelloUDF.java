package test.hive.udf.t1;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

@SuppressWarnings("deprecation")
public class HelloUDF extends UDF {
	SliptW3 sliptw3=new SliptW3();
	StringBuffer sb=new StringBuffer();
	public Text evaluate(Text str) throws IOException {
		Text result=new Text();
		if(str==null) {
			result.set("");
			return result;
		}
		ArrayList<String> ci = 
				sliptw3.sliptword(str.toString(),new ArrayList<String>());
		for(int i=0;i<ci.size();i++) {
			sb.append(ci.get(i));
			if(i!=ci.size()-1) sb.append(",");
		}
		result.set(sb.toString());
		sb.setLength(0);
		return result;
	}
}
