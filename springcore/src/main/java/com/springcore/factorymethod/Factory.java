package com.springcore.factorymethod;

public class Factory {
	
	public static MyInterface print() {
		
		
		return new A();
	}

}
