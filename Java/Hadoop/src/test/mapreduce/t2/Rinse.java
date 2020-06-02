package test.mapreduce.t2;

public class Rinse {
	
	static String[] fenge2(String str) {
		StringBuffer sb=new StringBuffer(str);
		String[] temp=new String[14];
		int end=0;
		int i=0;
		try {
		while(i<14) {
			
			
			if(sb.length()>0&&sb.charAt(0)=='"') 
				end=sb.indexOf("\",", 1)+1;
			else 
				end=sb.indexOf(",");
			
			if(end==-1) end=0;
			temp[i]=sb.substring(0,end);
			sb.delete(0, end+1);
			i++;
			
		}
		}catch(Exception e) {
			return null;
		}
		
		return temp;
	}
	
	static String[] fenge(String str){
		if(str.charAt(str.length()-1)==',') str+=',';
		String[] temp=str.split(",");
		if(temp.length>14) {
 			for(int i=1;i<temp.length;i++) {
				if(temp[i].length()>0&&temp[i].charAt(0)=='"'&&temp[i].charAt(temp[i].length()-1)!='"'){
					for(int j=i+1;j<temp.length;j++){
						if(temp[j].charAt(temp[j].length()-1)=='"') {
							String[] tmp=new String[temp.length-(j-i)];
							String s="";
							for(int n=0,nn=0;n<temp.length&&nn<tmp.length;n++) {
								if(n>=i&&n<=j) {
									s+=temp[n];
									continue;
								}
								if(!"".equals(s)) {
									tmp[nn]=s;
									s="";
									nn++;
								}
								tmp[nn]=temp[n];
								nn++;
							}
							temp=tmp;
						}
					}
				}
					
			}
		}
		
		if(temp[9]==null||"".equals(temp[9])||temp[10]==null||"".equals(temp[10])) return null;
		
		return temp;
//		StringBuffer sb=new StringBuffer();
//		for(int i=0;i<temp.length;i++) {
//			sb.append("["+temp[i]+"]");
//			if(i!=temp.length-1) sb.append(',');
//		}
//		return sb.toString();
	}
}
