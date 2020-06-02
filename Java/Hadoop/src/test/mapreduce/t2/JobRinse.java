package test.mapreduce.t2;
import org.apache.hadoop.io.Text;
public class JobRinse {
	private Text T=new Text();
	private int Pdu(String str,int d) {
		int i=0,sum=0;
		if(!B) d++;
		while(true) {
			i=str.indexOf(",",d);
			if(i==-1) return -1;
			for(int k=i-1;k>=0;k--) {
				if(str.charAt(k)=='\"') sum++;
				else break;
			}
			if(sum%2==0) sum=0;
			else {
				B=false;
				return i;
			}
			d=i+1;
		}
	}
	private static int COUNT=0;
	private int COUNT2=0;
	private String[] STR=new String[14];
	private boolean B=false;
	public Text rinse1(Text value) {
		 String str=value.toString();
		 int count=1;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==',') count++;
			}
	     String[] string=new String[count];
	     COUNT2=0;
	     int begin=0,end=0,k=0;
		 while(k<count&&str.length()>0) { 
			 if(str.charAt(begin) == '\"' || B) end=Pdu(str,end+2);  		 
			 else end = str.indexOf("," , begin );
			 if(end < 0) end = str.length();    
			 string[k++] = str.substring(begin, end); 
			 begin=end+1;
			 COUNT2++;
			 if(end >= str.length() - 1) break; 
		 }
		 boolean b=true;
		 if(COUNT!=0) b=false;
		 for(int i=0;i<COUNT2;i++) {
			 if(!b) STR[COUNT-1]+=string[i];
			 else {				 
				 try {
				 STR[COUNT]=string[i];
				 }catch(Exception e) {
					 System.out.println("报错------------------------------------"+COUNT);
					 break;
				 }
				 COUNT++;
			 }
			 if(!b) b=true;
		 }
		 if(COUNT<13) {
			 B=true;
			 return null;
		 }
		 else {
		 B=false;
		 if(STR[9]==null||STR[10]==null||"".equals(STR[10])||STR[10].contains("实习")){
			 COUNT=0;
			 return null;
		 }
		 StringBuffer sb=new StringBuffer();
		 for(String s:STR) {
			 sb.append(s);
			 sb.append('\u0001');
		 }
		 COUNT=0;
		 T.set(sb.toString());
		 return T;
		 }
		}
}
