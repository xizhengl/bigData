package other;



import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class HbaseDemo {
	private boolean Judge(int s,int[] src,int k) {
		for(int i=0;i<k;i++) {
			if(s==src[i]) {
				return true;
			}
		}
		return false;
	}
	private int[] screen(int[] arr) {
	int[] scr=new int[10];int k=0;
	for(int i=0;i<scr.length;i++) {
		int max=0;int k1=0;
		for(int j=0;j<arr.length;j++) {
			if(!Judge(j,scr,k)) {
				if(arr[j]>max) {
					max=arr[j];k1=j;
				}
			}
		}
		scr[i]=k1;k++;
	}
	return scr;	
	}
	 public static Configuration config;
	    static {
	        config = HBaseConfiguration.create();
	        config.set("hbase.zookeeper.quorum", "master,slave1,slave2");
//	        config.set("hbase.zookeeper.quorum", "master2,s5,s6,s7");
	        config.set("hbase.zookeeper.property.clientPort", "2181");
	     }
	  public String queryAllTable(String gjc,String salary,String city,String tag_top,String job_info_table)  {
		  
	        ResultScanner resultx=null;
	        JSONObject jaResult=new JSONObject();
	        try{
	            System.out.println("---------------查询gjc表数据 START-----------------");
	            Connection  connection = ConnectionFactory.createConnection(config);
	            Table table = connection.getTable(TableName.valueOf(gjc));
	            resultx = table.getScanner(new Scan());
	            JSONArray ja=new JSONArray();
	            for (Result result : resultx) {
	                byte[] row = result.getRow();
	                System.out.println("row key is:" + new String(row));
	                byte[] j = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("job_info"));
	                byte[] c = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("count"));
	                String[] job_info_tmp=new String(j).split(",");
	                String[] sCount=new String(c).split(",");
	                int[] count=new int[sCount.length];
	                String[] job_info=new String[job_info_tmp.length];
	                for(int i=0,jj=0;i<sCount.length;i++) {
	                	if("".equals(job_info_tmp[i])) continue;
	                	job_info[jj]=job_info_tmp[i];
	                	count[jj]=Integer.parseInt(sCount[i]);
	                	jj++;
	                }
	                JSONObject json=new JSONObject();
	                json.put("name", new String(row));
	                int[] xb=screen(count);
	                for(int i=0;i<xb.length;i++) {
	                	json.put(job_info[xb[i]], count[xb[i]]);
	                }
	                ja.add(json);	            
	                }
	            jaResult.put("gjc", ja);
	            System.out.println("---------------结束gjc表数据 END-----------------");
	            System.out.println("---------------查询salary表数据 START-----------------");
	            table = connection.getTable(TableName.valueOf(salary));
	            resultx = table.getScanner(new Scan());
	            int[] s_salaryData=new int[10];
	            String[] s_tagData=new String[10];
	            int i=0;
	            for (Result result : resultx) {
	                byte[] row = result.getRow();
	                System.out.println("row key is:" + new String(row));
	                byte[] a = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("salary"));
	                s_salaryData[i]=Integer.parseInt(new String(a));
	                s_tagData[i]=new String(row);
	                i++;
	                }
	            int[] temp_xb=screen(s_salaryData);
	            
	            JSONObject json=new JSONObject();
	            for(i=0;i<10;i++) {
	            	json.put(s_tagData[temp_xb[i]], s_salaryData[temp_xb[i]]);
	            }
	            jaResult.put("salary", json);
	            System.out.println("---------------结束salary表数据 END-----------------");
	            System.out.println("---------------查询city表数据 START-----------------");
	            ja=new JSONArray();
	            table = connection.getTable(TableName.valueOf(city));
	            resultx = table.getScanner(new Scan());
	            for (Result result : resultx) {
	                byte[] row = result.getRow();
	                System.out.println("row key is:" + new String(row));
	                byte[] a = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("tag"));
	                byte[] b = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("count"));
	                byte[] c = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("salary"));
	                String[] tag_tmp=new String(a).split(",");
	                String[] sCount=new String(b).split(",");
	                int[] count=new int[sCount.length];
	                String[] tag=new String[tag_tmp.length];
	                for(int ii=0,jj=0;ii<sCount.length&&ii<tag_tmp.length;ii++) {
	                	if("".equals(tag_tmp[ii])) continue;
	                	tag[jj]=tag_tmp[ii];
	                	count[jj]=Integer.parseInt(sCount[ii]);
	                	jj++;
	                }
	                String s_tag="未分类";
	                temp_xb=screen(count);
	                for(i=0;i<temp_xb.length;i++) {
	                	if(temp_xb[i]<tag_tmp.length) {
	                		s_tag=tag_tmp[temp_xb[i]];
	                		break;
	                	}
	                }
	                String str=new String(row);
	                if(!str.equals("未分类")) {
	                JSONObject json2=new JSONObject();
	                json2.put("name", new String(row));
	                json2.put("variety", tag_tmp.length);
	                json2.put("main",s_tag);
	                json2.put("salary",new String(c));
	                ja.add(json2);
	                }
	                }
	            jaResult.put("city", ja);
	            System.out.println("---------------结束city表数据 END-----------------");
	            System.out.println("---------------查询tag_top表数据 START-----------------");
	            table = connection.getTable(TableName.valueOf(tag_top));
	            ja=new JSONArray();
	            s_salaryData=new int[10];
	            String[] s_tag_top=new String[10];
	            resultx = table.getScanner(new Scan());
	            i=0;
	            for (Result result : resultx) {
	                byte[] row = result.getRow();
	                System.out.println("row key is:" + new String(row));
	                byte[] a = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("count"));
	                s_salaryData[i]=Integer.parseInt(new String(a));
	                s_tag_top[i]=new String(row);
	                i++;
//	                JSONObject json2=new JSONObject();
//	                json2.put("name", tmp);
//	                json2.put("value", Integer.parseInt(new String(a)));
//	                ja.add(json2);
	            }
	            temp_xb=screen(s_salaryData);
	            for(i=0;i<5;i++) {
	                JSONObject json2=new JSONObject();
	                json2.put("name", s_tag_top[i]);
	                json2.put("value", s_salaryData[i]);
	                ja.add(json2);
	            }
	            jaResult.put("tag_top", ja);
	            System.out.println("---------------结束tag_top表数据 END-----------------");
	            System.out.println("---------------查询job_info表数据 START-----------------");
	            table = connection.getTable(TableName.valueOf(job_info_table));
	            ja=new JSONArray();
	            resultx = table.getScanner(new Scan());
	            for (Result result : resultx) {
	                byte[] row = result.getRow();
	                System.out.println("row key is:" + new String(row));
	                byte[] a = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("city"));
	                byte[] b = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("company_name"));
	                byte[] c = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("job_name"));
	                byte[] d = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("salary"));
	                byte[] e = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("job_tag"));
	                String str=new String(a);
	                String strc=new String(c);
	                String strb=new String(b);
	                String strd=new String(d);
	                String stre=new String(e);
	                if(!str.equals("未分类")&&!strc.contains("\"")&&!strb.contains("\"")&&!strd.contains("\"")&&!str.contains("\"")) {
	                JSONObject json2=new JSONObject();
	                json2.put("city", str);
	                json2.put("company_name", strb);
	                json2.put("tag",strc);
	                json2.put("salary", strd);
	                json2.put("job_tag", stre);
	                ja.add(json2);
	                }
	            }
	            System.out.println("---------------查询job_info表数据 END-----------------");
	            jaResult.put("job_info", ja);
	            
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	       return jaResult.toString();
	    } 
}
