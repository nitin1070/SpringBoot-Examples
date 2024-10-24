package in.sca.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sca.beans.Student;

public class StudentApp {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("in/sca/resources/config.xml");
		
		
		System.out.println("Container started");

		  Student s1=(Student)container.getBean("stdobj");
		  Student s2=(Student)container.getBean("stdobj");
		  System.out.println("s1 values");
		  System.out.println("===========");
		  System.out.println("name:"+s1.getName());
		  System.out.println("roll no:"+s1.getRollno());
		  
		  System.out.println("\ns2 values");
		  System.out.println("===========");
		  System.out.println("name:"+s2.getName());
		  System.out.println("roll no:"+s2.getRollno());
		  s1.setRollno("103");
		  s2.setName("Nitin");
		  System.out.println("After Changing");
		  System.out.println("s1 values");
		  System.out.println("===========");
		  System.out.println("name:"+s1.getName());
		  System.out.println("roll no:"+s1.getRollno());
		  
		  System.out.println("\ns2 values");
		  System.out.println("===========");
		  System.out.println("name:"+s2.getName());
		  System.out.println("roll no:"+s2.getRollno());

		 
	    
		   

		
	}

}
