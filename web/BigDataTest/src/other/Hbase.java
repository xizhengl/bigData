package other;

import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
//import org.apache.hadoop.hbase.util.Bytes;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Hbase {

	 public static Configuration config;
	    static {
	        config = HBaseConfiguration.create();
	        // 数据库元数据操作对象
	       // Admin admin;
	 
	       // config.addResource(new Path("D:\\hbase-1.2.5\\conf\\hbase-site.xml"));
	 
	        // 取得一个数据库连接的配置参数对象
	        // 设置连接参数：HBase数据库所在的主机IP
	        config.set("hbase.zookeeper.quorum", "master,slave1,slave2");
	        // 设置连接参数：HBase数据库使用的端口
	        config.set("hbase.zookeeper.property.clientPort", "2181");
	        /*
	        config = HBaseConfiguration.create();
	        config.set("hbase.zookeeper.quorum", "127.0.0.1");
	        config.set("hbase.zookeeper.property.clientPort", "2181");
	        config.set("hbase.master", "127.0.0.1:60010");
	        */
	     }
	
	
	  public String queryAllTable(String tabName)  {
		  
	        ResultScanner resultx=null;
	        String[] str=new String[2];
	        
	        JSONArray ja=new JSONArray();
	        
	        try{
	            System.out.println("---------------查询整表数据 START-----------------");
	 
	            // 取得数据表对象
	            Connection  connection = ConnectionFactory.createConnection(config);
	            Table table = connection.getTable(TableName.valueOf(tabName));
	            // 取得表中所有数据
	            resultx = table.getScanner(new Scan());
	            // 循环输出表中的数据
	            
	            for (Result result : resultx) {
	                byte[] row = result.getRow();
	                System.out.println("row key is:" + new String(row));
	                List<Cell> listCells = result.listCells();
//	                byte[] t = result.getValue(Bytes.toBytes("info"), Bytes.toBytes("tag"));
//	                byte[] c = result.getValue(Bytes.toBytes("inf"), Bytes.toBytes("count"));
//	                System.out.println("tag--------------------------"+Bytes.toString(t));
//	                System.out.println("count--------------------------"+Bytes.toString(c));
	                int i=0;
	                for (Cell cell : listCells) {
	                    byte[] familyArray = cell.getFamilyArray();
//	                    byte[] qualifierArray = cell.getQualifierArray();
//	                    byte[] valueArray = cell.getValueArray();
	                    
	                    System.out.println("row value is:" 
	                    +"\n"+ new String(familyArray));
	                    
	                    String temp=new String(familyArray);
	                    
	                    str[i]=temp.substring(temp.lastIndexOf("")+1,temp.length());
	                    i++;
	                }
	                JSONObject json=new JSONObject();
	                json.put("name", new String(row));
	                
	                String[] tmp1=str[1].split(",");
	                String[] tmp2=str[0].split(",");
	                String[] tmp3=new String[tmp1.length];
	                int[] tmp4=new int[tmp2.length];
	                int[] tmp5=new int[10];
	                for(int j=0,n=0,count=0;j<tmp3.length;n++) {
	                	if("".equals(tmp1[n])) continue;
	                	tmp3[j]=tmp1[n];
	                	tmp4[j]=Integer.parseInt(tmp2[n]);
	                	if(tmp4[tmp5[count]]<=tmp4[j]) {

	                		for(int ii=0;ii<count;ii++) {
	                			if(tmp4[tmp5[ii]]<=tmp4[j]) {
	                				
	                				for(int jj=count;jj>ii;j--) {
	                					tmp5[jj]=tmp4[jj-1];
	                				}
	                				tmp5[ii]=j;
	                				break;
	                			}
	                		}
	                		if(count!=9) count++;
	                	}
	                	j++;
	                }
	                
	                for(i=0;i<10;i++) {
	                	json.put(tmp3[tmp5[i]], tmp4[tmp5[i]]);
	                }
	                ja.add(json);	                
	            }
	            System.out.println("---------------查询整表数据 END-----------------");
	            System.out.println("json="+ja.toString());
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        
	        return ja.toString();
	        
	    }
	
}
