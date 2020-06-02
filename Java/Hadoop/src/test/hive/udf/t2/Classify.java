package test.hive.udf.t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Classify {
	 class ArrayClassity {
		char ch='0';
		ArrayList<String> Array=new ArrayList<String>();
	}
		public ArrayList<ArrayClassity> readtxt(String str) {
			ArrayList<ArrayClassity> province=new ArrayList<ArrayClassity>();
			ArrayClassity Ass=new ArrayClassity();
			province.add(Ass);
			InputStream is=this.getClass().getResourceAsStream(str);
			  try {
			InputStreamReader reader = new InputStreamReader(is,"utf-8");
			  BufferedReader br = new BufferedReader(reader);
			  String line="";

				line = br.readLine();

	          while (line != null) {  
	        	  if(line.equals("")) {
	        		  line = br.readLine();  
	        		  continue;
	        	  }
	        	  if(!line.equals("*")) {
	        		  province.get(province.size()-1).Array.add(line);province.get(province.size()-1).ch=line.charAt(0);
	        	  }
	        	  else {
	        		  ArrayClassity Asso=new ArrayClassity();
	        			province.add(Asso);
	        	  }
	              line = br.readLine();  
	          } 
				} catch (IOException e) {
					e.printStackTrace();
				}  
	          return province;
		}
}
