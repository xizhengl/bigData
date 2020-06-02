package test.hive.udf.t2;

import java.io.IOException;

import java.util.ArrayList;

import test.hive.udf.t2.Classify.ArrayClassity;


public class BlackST_2 {
	public boolean Judge(String string,ArrayList<ArrayClassity> cibiao) {
		for(int i=0;i<cibiao.size();i++) {
			if(cibiao.get(i).ch==string.charAt(0)) {
				for(int j=0;j<cibiao.get(i).Array.size();j++) {
					if(cibiao.get(i).Array.get(j).length()<string.length()) continue;
					if(cibiao.get(i).Array.get(j).substring(0, string.length()).equals(string)) {
						return true;
					}
				}
				break;
			}
		}
		return false;
	}
	public boolean Tcontain(ArrayList<ArrayClassity> cibiao,String str) {
		for(int i=0;i<cibiao.size();i++) {
			if(cibiao.get(i).ch==str.toLowerCase().charAt(0)) {
				for(int j=0;j<cibiao.get(i).Array.size();j++) {
					if(cibiao.get(i).Array.get(j).length()<str.length()) continue;
					if(str.equalsIgnoreCase(cibiao.get(i).Array.get(j).substring(0, str.length()))) {
						return true;
					}
				}
				break;
			}
		}
		return false;
	}

	public int Index(int begin,int i,String string,ArrayList<ArrayClassity> cibiao1) {
	
		for(;i<string.length();i++) {
			
			if(string.charAt(i)<65||string.charAt(i)>122||(string.charAt(i)>90&&string.charAt(i)<97)) {
				if(string.charAt(i)>=48&&string.charAt(i)<=57||Tcontain(cibiao1,string.substring(begin,i+1))) continue;
				return i;
			}
		}
		return i;
	}
	
	public ArrayList<String> Row(ArrayList<String> cibiao,ArrayList<ArrayClassity> cibiao1){

		ArrayList<String> cibiao2=new ArrayList<String>();String string="";
		for(int i=0;i<cibiao.size();i++) {
			if(contain(cibiao1,cibiao.get(i))||cibiao.get(i).charAt(0)>=65&&cibiao.get(i).charAt(0)<=90||cibiao.get(i).charAt(0)>=97&&cibiao.get(i).charAt(0)<=122) {
				if(!string.equals("")) {cibiao2.add(string);string="";}
				cibiao2.add(cibiao.get(i));
			}
			else {
				string+=cibiao.get(i);
			}
		}	
		if(string.length()>1)cibiao2.add(string);
		for(int i=0;i<cibiao2.size();i++) {
			if(cibiao2.get(i).equals("")) {cibiao2.remove(i);i--;}
		}
		return cibiao2;
	}
	public ArrayList<String> sliptword(String string,ArrayList<ArrayClassity> cibiao,ArrayList<ArrayClassity> cibiao1) {
		ArrayList<String> cibiao2=new ArrayList<String>();	
		int begin=0;String str="";
		
		for(int i=1;i<=string.length();i++) {
			if(string.length()==i)str=string.substring(begin).toLowerCase();
			else str=string.substring(begin, i).toLowerCase();

			if(str.charAt(0)>=65&&str.charAt(0)<=90||str.charAt(0)>=97&&str.charAt(0)<=122) 
				{

				int k=i-1;
				 i=Index(begin,i-1,string,cibiao1);
				    if(k==i) cibiao2.add(string.substring(begin).toLowerCase());
				    else cibiao2.add(string.substring(begin,i).toLowerCase());
				     begin=i;
				}
			else if(!Judge(str,cibiao)) {
				
				 if(str.length()>1){
					cibiao2.add(str.substring(0, str.length()-1));i--;
				}
				else {
					cibiao2.add(str);
				}
				begin=i;
			}
			else if(string.length()==i) {		
				cibiao2.add(str);begin=i;
			}
		}
		return Row(cibiao2,cibiao);
	}
	public boolean contain(ArrayList<ArrayClassity> cibiao,String str) {
		for(int i=0;i<cibiao.size();i++) {
			if(cibiao.get(i).ch==str.charAt(0)) {
				for(int j=0;j<cibiao.get(i).Array.size();j++) {
					if(cibiao.get(i).Array.get(j).length()!=str.length()) continue;
					if(cibiao.get(i).Array.get(j).equalsIgnoreCase(str)) {
						return true;
					}
				}
				break;
			}
		}
		return false;
	}

	public String Find(String string,ArrayList<ArrayClassity> cibiao) {
		for(int i=string.length();i>1;i--) {		
			for(int j=0;j<=string.length()-i;j++) {
				if(j+i-1==string.length()-1) {
					if(contain(cibiao,string.substring(j))) {					
						return string.substring(j);
					}
				}
				else {
					if(contain(cibiao,string.substring(j,j+i))) {
						
						return string.substring(j,j+i);
					}
				}
			}			
		}
		return "";
	}
	

	public ArrayList<String> Final(ArrayList<ArrayClassity> cibiao,ArrayList<ArrayClassity> cibiao1,ArrayList<String> cibiao2,ArrayList<ArrayClassity> english){
		ArrayList<String> cibiao4=new ArrayList<String>();
		for(int i=0;i<cibiao2.size();i++) {
			if(cibiao2.get(i).charAt(0)>=97&&cibiao2.get(i).charAt(0)<=122) {
				if(contain(english,cibiao2.get(i))) continue;
				if(contain(cibiao1,cibiao2.get(i))) {
				cibiao4.add(cibiao2.get(i));continue;
				}
				else if(cibiao2.get(i).length()<=6&&(cibiao2.get(i).charAt(cibiao2.get(i).length()-1)<48||cibiao2.get(i).charAt(cibiao2.get(i).length()-1)>57)){
					cibiao4.add(cibiao2.get(i));continue;
				}
			}
			if(contain(cibiao1,cibiao2.get(i))&&cibiao2.get(i).length()>1) {
				cibiao4.add(cibiao2.get(i));continue;
			}
			if((cibiao2.get(i)).length()<=7) {
				String str=Find(cibiao2.get(i),cibiao1);
				if(!str.equals("")) {			
				cibiao4.add(str);continue;
				}
			}
			if(i<cibiao2.size()-1&&(cibiao2.get(i)+cibiao2.get(i+1)).length()<=7) {
				String str=Find(cibiao2.get(i)+cibiao2.get(i+1),cibiao1);
				if(!str.equals("")) {			
				cibiao4.add(str);i++;continue;
				}
			}
			if(i<cibiao2.size()-2&&(cibiao2.get(i)+cibiao2.get(i+1)+cibiao2.get(i+2)).length()<=7) {
				String str=Find(cibiao2.get(i)+cibiao2.get(i+1)+cibiao2.get(i+2),cibiao1);
				if(!str.equals("")) {
				
				cibiao4.add(str);i+=2;continue;
				}
			}
			if(i<cibiao2.size()-3&&(cibiao2.get(i)+cibiao2.get(i+1)+cibiao2.get(i+2)+cibiao2.get(i+3)).length()<=7) {
				String str=Find(cibiao2.get(i)+cibiao2.get(i+1)+cibiao2.get(i+2)+cibiao2.get(i+3),cibiao1);
				if(!str.equals("")) {				
				cibiao4.add(str);i+=3;continue;
				}
			}
			
			if(!contain(cibiao,cibiao2.get(i))&&cibiao2.get(i).length()>1&&cibiao2.get(i).equals(null)) {			
				cibiao4.add(cibiao2.get(i));continue;
			}			
		}		
		return cibiao4;	
	}
	
	public ArrayList<String> Sfun(String str1,ArrayList<ArrayClassity> cibiao,ArrayList<ArrayClassity> cibiao1,ArrayList<ArrayClassity> english) throws IOException {
		
		ArrayList<String> cibiao2=new ArrayList<String>();//
	cibiao2=sliptword(str1,cibiao,cibiao1);
	
	cibiao2=Final(cibiao,cibiao1,cibiao2,english);	
	
	return cibiao2;
}
	


}
