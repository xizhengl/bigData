package test.hive.udf.t1;

import java.io.IOException;

public class salary {
	public double Wrow(String string,int i) {
		string=string.substring(0, string.length());
		String[] str=string.split("-");
		double a=Double.valueOf(str[0]);
		double b=Double.valueOf(str[1]);
		switch(i) {
		case 1:return (a+b)/2*1000;
		case 2:return (a+b)/2;
		case 3:if(b<10) {return (a+b)/2*10000;}
		       else {return (a+b)/24*10000;}
		case 5:return (a+b)/2*10000;
		case 6:return (a+b)/24*10000;
		case 7:return (a+b)/2*30;
		default :return (a+b)/2;
		}
	}
	public int Row(String string) {
		if(string.contains("K")) {
			string=string.replaceAll("K","");
			return (int)Wrow(string,1);
		}
		else if(string.contains("k")) {
			string=string.replaceAll("k","");
			return (int)Wrow(string,1);
		}
		else if(string.contains("元/月")) {
			string=string.replaceAll("元/月","");
			return (int)Wrow(string,2);
		}
        else if(string.contains("万")) {
        	string=string.replaceAll("万","");
        	return (int)Wrow(string,3);
		}
        else if(string.contains("千/月")) {
        	string=string.replaceAll("千/月","");
        	return (int)Wrow(string,1);
		}
        else if(string.contains("万/月")) {
        	string=string.replaceAll("万/月","");
        	return (int)Wrow(string,5);
        }
        else if(string.contains("万/年")) {
        	string=string.replaceAll("万/年","");
        	return (int)Wrow(string,6);
		}
        else if(string.contains("元/日")) {
        	string=string.replaceAll("元/日","");
        	return (int)Wrow(string,7);
        }
       else {
    	   return (int)Wrow(string,8);
        }
	}
	public int count(String string) throws IOException{
		try {
		return Row(string);
		}
		catch(Exception e) {
			return 0;
		}
	}
}
