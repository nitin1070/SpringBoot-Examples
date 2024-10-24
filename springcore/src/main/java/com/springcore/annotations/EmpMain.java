
package com.springcore.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/annotations/empConfig.xml");
		
		EmpBean b = context.getBean("emp",EmpBean.class);
		
		
		System.out.println(b);
		
	}

}
	