package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
	
		/*
		 * Resource r = new ClassPathResource("com/springcore/ci/studentConfig.xml");
		 * BeanFactory factory = new XmlBeanFactory(r); StudentBean s =
		 * factory.getBean("studentBean",StudentBean.class);
		 */
	       
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/studentConfig.xml");
		  
		  StudentBean b1 = (StudentBean) context.getBean("studentBean1");
		  StudentBean b2 = (StudentBean) context.getBean("studentBean2");
		  StudentBean b3 = (StudentBean) context.getBean("studentBean3");
		  
	      System.out.println(b1);
	      System.out.println(b2);
	      System.out.println(b3);
	      

	}

}
