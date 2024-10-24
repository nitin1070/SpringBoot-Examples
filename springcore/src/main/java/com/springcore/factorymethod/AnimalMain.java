package com.springcore.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/factorymethod/applicationConfig.xml");
		
		AnimalBean b = context.getBean("a",AnimalBean.class);
		
		   b.Show();

		   Factory f = context.getBean("p",Factory.class);
		   
		   f.print();
		   
		   
	}

}
