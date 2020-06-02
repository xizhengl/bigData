package test.mapreduce.t2;


import org.apache.hadoop.io.Text;

public class Test {

	public static void main(String[] args) {
		String s=",互联网/移动互联网/电子商务，计算机软件，通信(设备/运营/增值),,Microsoft,,\"微软作为全球领先的软件、服务、设备和解决方案供应商，自1975年成立以来，一直致力于帮助个人和企业用户全面发挥科技潜能。三十多年来，微软始终引领技术创新与变革，其卓越的软件、设备和服务能够帮助用户提升在生活和工作的方方面面，使数以亿计的用户真正受益于科技。微软公司总部位于美国华盛顿州雷德蒙市，在全世界190个国家和地区建立分支机构，拥有超过125,000名员工。\r\n" + 
				"\r\n" + 
				"微软在中国的使命不仅是持续加大对中国市场的投入，更是与中国共创一个更具创新力、竞争力和人才培养的可持续发展未来。微软致力于利用全球领先的信息化技术，帮助中国经济实现更好的转型与发展，最终让每一个人、每一家企业真正受益于此。\r\n" + 
				"\r\n" + 
				"作为一家以创造生产力和平台而著称公司，微软“移动为先，云为先”策略的制定与执行，正在重新定义生产力，并加速推动人们在“移动为先，云为先”的世界里，创造更多、收获更多。凭借在创造平台和生产力工具方面的深厚积淀，微软让数字工作与生活中的各种设备、应用、文档、数据和社交网络和谐共处，让“人”真正成为世界的中心。\r\n" + 
				"\r\n" + 
				"自1992年在北京设立代表处至今，微软已深植中国二十余年。今天，微软已经成为在华最大的外国投资企业之一。这得益于微软不断倾听并适应中国市场的本土化需求，并深度参与到中国信息化发展中。通过与中国产业合作伙伴携手创新，微软让越来越多的技术、产品和服务得以在中国落地生根。目前，微软在中国已经拥有超过17,000家合作伙伴，微软每收入1元钱，合作伙伴的收入超过16元。\r\n" + 
				"\r\n" + 
				"今天，微软已为中国提供了一个完整、庞大的生态系统：从开发者、合作伙伴、企业客户到普通消费者；从Windows、Office、SQL Server、Cloud OS到Windows Phone、Surface和Xbox。面对移动为先，云为先的新世界，微软以安全、可靠的云计算服务为基础，基于微软大数据、移动解决方案的平台以及丰富的终端产品，切实助力中国用户、企业及政府机构，提高生产力，以创新技术推动经济发展。\r\n" + 
				"\r\n" + 
				"Microsoft Mission and Culture:\r\n" + 
				"Empower every person and organization on the planet to achieve more. That’s what inspires us, drives our work and pushes us to challenge the status quo every day. At Microsoft we also work to empower our employees so they can achieve more. We believe we should each find meaning in our work and we ensure employees have the freedom and the reach to help make a difference in the world.\r\n" + 
				"\r\n" + 
				"Growth mindset: At Microsoft, we’re insatiably curious and always learning. We ask questions, take risks and build on each other’s ideas, because we are better together. We lean in to uncertainty, take risks and move quickly when we make mistakes, because we know that failure happens along the way to innovation and breakthrough. \r\n" + 
				"\r\n" + 
				"Customer obsessed: We are passionate about helping our customers achieve more, and that means we really listen and learn from them. We bring solutions that don’t just meet the needs of customers and their businesses, they often surprise and delight them. Then we innovate further to give them even more.\r\n" + 
				"\r\n" + 
				"Diversity and inclusion: We don’t just value differences, we seek them out. We invite them in. Microsoft is a place where employees can be who they are. We value diverse perspectives. And as a result, we have better ideas, better products and happier customers.\r\n" + 
				"\r\n" + 
				"One Microsoft: We are a family of individuals at a truly global company, united by a single mission. We work together, building on each other’s ideas and collaborating across boundaries to bring the best of Microsoft to our customers and the world. \r\n" + 
				"\r\n" + 
				"Making a difference: Our employees have access to the latest technology and tools, the power to build on the company’s far-reaching momentum and the drive to change the world. We can make a difference. Together, we can help billions of people around the globe use digital technology to achieve amazing things.\r\n" + 
				"\r\n" + 
				"We know where we’re going as a company and how we’ll get there. We are committed to reinvent productivity and business processes, build the intelligent cloud platform and create more personal computing. These three goals are interconnected, they’re bold—and they’re why we are always looking to bring even more brilliant and creative people to our team.\",10000人以上,统招本科,5年以上,\"1 Title: Senior SDETeam: Business AI, Search Technology Center, MicrosoftLocation: BeijingMicrosoft AI & Research is seeking an experienced software development engineer to design and develop advanced enterprise focused AI product and solution to improve the customer’s engagement by reducing the support cost, and improve customer’s satisfaction. We are looking for a passionate, creative, analytical and experienced individual who love information retrieval, information extraction, machine learning, artificial intelligence, and shipping fast at massive scale.As a Senior Software Engineer you will design and build knowledge extraction algorithms from both Web and enterprise data, machine learning algorithms for text processing, question answering algorithms, data ingestion and serving systems, and applications to enable the advanced enterprise search experience. The person must have a strong R&D background in machine learning, Web scale knowledge extraction and natural language processing. Experience with a diversity of Microsoft architectures, tech transfer and product development processes is ideal. Experience in areas like deep learning, spoken language systems, web search technology, and personalized Web services is also a plus.Basic Qualifications: 1. 8+ years of professional software development, with at least 5 years in big data/machine learning.Preferred Qualifications: 1. A Master in Computer Science or Mathematics.2. Background in big data machine learning and natural language processing systems.3. Experience with knowledge extraction and modeling.4. Experience with cloud computing.Microsoft is an equal opportunity employer. All qualified applicants will receive consideration for employment without regard to race, color, sex, sexual orientation, gender identity or expression, religion, national origin or ancestry, age, disability, marital status, pregnancy, protected veteran status, protected genetic information, political affiliation, or any other characteristics protected by local laws, regulations, or ordinances.\",微软人工智能 AI Developer/Manager,40-70万,人工智能,";
		
		String[] ss=s.split("\n");
		JobRinse j=new JobRinse();
		for(String c:ss) {
			Text t= j.rinse1(new Text(c));
			if(t==null) continue;
			System.out.println("------------------------------------------------------");
			System.out.println(t.toString());
		}
		
	}

}
