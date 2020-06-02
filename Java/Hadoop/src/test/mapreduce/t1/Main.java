package test.mapreduce.t1;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import test.mapreduce.t2.Mapper1;


public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		Configuration conf=new Configuration();
		
		Job job=Job.getInstance(conf);
		
		job.setJarByClass(Mapper1.class);
		job.setMapperClass(Mapper1.class);
		
//		job.setMapOutputKeyClass(Text.class);
//		job.setMapOutputValueClass(LongWritable.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(NullWritable.class);
		
		FileInputFormat.setInputPaths(job, "F:/snacks/BigDataData/jobs3.csv");
		//FileInputFormat.setInputPaths(job, "F:/Input/Input1.txt");
		FileOutputFormat.setOutputPath(job,new Path("F:/A3/"));
		
		job.waitForCompletion(true);
	}

}
