package test.mapreduce.t2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Mapper2 extends Mapper<LongWritable, Text, Text, LongWritable>{
	Text out;
	JobRinse jj=new JobRinse();
protected void map(LongWritable key, Text value,Mapper<LongWritable, Text, Text, NullWritable>.Context context)throws java.io.IOException, InterruptedException {
	out=jj.rinse1(value);
	if(out==null) return;
	context.write(out, NullWritable.get());
}
}