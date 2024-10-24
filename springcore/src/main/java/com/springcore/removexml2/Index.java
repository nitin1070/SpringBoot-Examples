package com.springcore.removexml2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Index {
	
	public static void main(String [] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(IndexConfig.class);
		
		NiftyBean n=context.getBean("nifty",NiftyBean.class);
		SensexBean s= context.getBean("sensex",SensexBean.class);
		FinNifty f = context.getBean("finnifty",FinNifty.class);
		
		f.showFinNifty();
	  n.showNifty();
	  s.showSensex();
		
		
	} 

}
