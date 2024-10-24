package com.springcore.factorymethod;

public class AnimalBean {
	
	private static final AnimalBean A = new AnimalBean();
	
	private AnimalBean() {
		
		
		System.out.println("Private Constructor calling....");
	}
	
	public static AnimalBean getA() {
		
		  System.out.println("Factory method calling..");
		  
		  return A;
		
	}
	
	public void Show() {
		
		System.out.println("Hello Spring");
	}

}
