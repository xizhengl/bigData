package test.hive.udf.t2;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.io.Text;

import test.hive.udf.t2.Classify.ArrayClassity;

@SuppressWarnings("unused")
public class Test {

	public static void main(String[] args) throws IOException {
		String value="";
		
		fenciUDF fenci=new fenciUDF();
		
		System.out.println(fenci.evaluate(new Text(value)).toString());
		

	}

}
