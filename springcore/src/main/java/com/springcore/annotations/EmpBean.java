package com.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpBean {
	
	

       public Salary getSal() {
		return sal;
	}

       
       @Autowired
       @Qualifier("empSal")
	public void setSal(Salary sal) {
		this.sal = sal;
		System.out.println("Setting values");
	}

	public Add getA() {
		return a;
	}

	public void setA(Add a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "EmpBean [a=" + a + "]";
	}

	
	  @Autowired  
	  @Qualifier("empSal2")
	  private Salary sal;
	
	@Autowired
	
	private Add a;


}
