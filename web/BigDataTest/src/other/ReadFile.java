package other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ReadFile {

	public ArrayList<String> readtxt(String str){
		ArrayList<String> province=new ArrayList<String>();
		InputStream is=this.getClass().getResourceAsStream(str);
		InputStreamReader reader;
		try {
			reader = new InputStreamReader(is,"utf-8");
	
		  BufferedReader br = new BufferedReader(reader);
		  String line="";
		  line = br.readLine();  
          while (line != null) {
        	  province.add(line);
        	  line = br.readLine();
          } 
		} catch ( IOException e) {
			e.printStackTrace();
		}
          return province;
	}
	
	  public ArrayList<String> readtxt_absolute(String string) {
	        String pathname=string;
	        File filename = new File(pathname);
	        ArrayList<String> cibiao =new ArrayList<String>();
	         InputStreamReader reader;
			try {
				reader = new InputStreamReader(
				         new FileInputStream(filename));
			
	          @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(reader);
	          String line="";
	          line = br.readLine();
	          while (line != null) {
	              cibiao.add(line);
	              line = br.readLine();
	          }
			} catch (IOException e) {
				readtxt("table.txt");
				e.printStackTrace();
			}
	          return cibiao;
	    }

}
