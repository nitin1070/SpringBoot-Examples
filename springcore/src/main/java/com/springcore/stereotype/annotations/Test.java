package com.springcore.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotations/stereotypeConfig.xml");
		
		 Student s = context.getBean("student",Student.class);
		 
		 System.out.println(s);
		
		 																																												
	}

}
