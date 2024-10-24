package in.sca.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sca.beans.Student;

public class StudentApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("in/sca/resources/config.xml");
		System.out.println("Container started...");
		Student s1 = (Student) context.getBean("stdobj");
		Student s2 = (Student) context.getBean("stdobj");
		
		 System.out.println("S1 values ");
		 System.out.println("name : "+s1.getName());
		 System.out.println("roll : "+s1.getRollno());
		 System.out.println("================================ ");
		 System.out.println("S2 values ");
		 System.out.println("name : "+s2.getName());
		 System.out.println("roll : "+s2.getRollno());
		 
		 System.out.println("Are s1 and s2 same ? "+(s1==s2));
		 
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
		 
	    
		   

		
	}

}
