package com.springcore.ci;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentBean {
	private String name;
	private int age;
	private double count;
	private Long add;
	private List<String> hobbies;
	
	public StudentBean(String name,double count) {
		 this.name=name;
		 this.count=count;
			
			System.out.println("String , double constructor"+ name+"\n"+count);
		} 
	
	
	public StudentBean(String name) {
		System.out.println("only String constructor:"+name);
		
	}
    
	
	
	
	
	public StudentBean(String name, int age, List<String>hobbies) {
		this(name);
		this.age=age;
		this.hobbies=hobbies;
		
	System.out.println("String , int , List Constructor"+name+"\n"+age+"\n"+hobbies);
		
	}
	

	public StudentBean(int age, String name, List<String>hobbies) {
		
		this.age=age;
		this.name=name;
		this.hobbies=hobbies;
		
	System.out.println("String , int , List Constructor"+name+"\n"+age+"\n"+hobbies);
		
	}
	
	
	
	
	
	
	
}
