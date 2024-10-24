package in.sca.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sca.beans.Student;
import in.sca.config.myConfig;

public class UseStudent {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(in.sca.config.myConfig.class);
		
		
		Student s= (Student) context.getBean("student");
		 
		 
	}
}
