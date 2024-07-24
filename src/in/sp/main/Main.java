package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.config;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(config.class);
	Student st=(Student)context.getBean("stu");
	st.display();
	}
}
