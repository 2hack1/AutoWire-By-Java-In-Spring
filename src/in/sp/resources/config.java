package in.sp.resources;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Ad;
import in.sp.beans.Student;
import in.sp.beans.Sub;

@Configuration
public class config {
@Bean
public Ad std() {
	Ad std1=new Ad();
	std1.setHname("😁😁😁😁My house");
	std1.setHno("  😂 🤣😁😁 i dont know");
	return std1;
}

@Bean
public Sub create() {
	Sub ss=new Sub();
	List<String>ssub=new LinkedList<String>();
	ssub.add("kap😁😁😁");
	ssub.add("nap🤣🤣🤣");
	ssub.add("map😂😂😂");
	ss.setSub(ssub);
	return ss;
}

@Bean
public Sub create1() {
	Sub ss1=new Sub();
	List<String>ssub=new LinkedList<String>();
	ssub.add("kap1😁😁😁");
	ssub.add("nap1🤣🤣🤣");
	ssub.add("map1😂😂😂");
	ss1.setSub(ssub);
	return ss1;
}

@Bean
public Student stu() {
	Student stu1=new Student();
	stu1.setEmail("kapilagrawal");
	stu1.setRoll(1111);
//	stu1.setEee(create());
	
//	stu1.setName(std());
	return stu1;
}
}
