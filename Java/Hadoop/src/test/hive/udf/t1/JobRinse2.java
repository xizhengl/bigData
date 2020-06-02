package test.hive.udf.t1;

import org.apache.hadoop.io.Text;

public class JobRinse2 {
	private Text T=new Text();
	private StringBuffer sb=new StringBuffer();
	private int Pdu(String str,int d) {
		int i=0;int sum=0;
		while(true) {
			i=str.indexOf(",",d);
			if(i==-1) return -1;
			for(int k=i-1;k>=0;k--) {
				if(str.charAt(k)=='\"') {
					sum++;
				}
				else {
					break;
				}
			}
			if(sum%2==0) {
				sum=0;
			}
			else {
				return i;
			}
			d=i+1;
		}
	}
	
	public Text rinse1(Text value) {
		 String str=value.toString();
	     String[] string=new String[100];
	     int begin=0;int end=0;int k=0;
	     
	     int count=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==',') {
					count++;
				}
			}

		
	     
		 while(true) {	 
			 if(str.charAt(begin) == '\"') { 
			      end=Pdu(str,end+1);  		 
			      } else { 
			        end = str.indexOf("," , begin ); 
			      } 
			     if(end < 0) { 
			        end = str.length() ; 
			      } 
			        
			      string[k++] = str.substring(begin, end); 
			      begin=end+1;
			      if(end >= str.length() - 1||end==-1) { 
				        break; 
				      } 
		 }
	     
		 for(String str2:string) {
			 sb.append(str2);
			 sb.append("\r");
		 }
		 
		 if(count<13) return null;
		 else {
		 if(string[9]==null&&string[10]==null&&string[10].contains("实习"))
		 {sb.delete(0, sb.length());return null;}
		 T.set(sb.toString());
		 return T;
		 }
	  
		}
	
}
