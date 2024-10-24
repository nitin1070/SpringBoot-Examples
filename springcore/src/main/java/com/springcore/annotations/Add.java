package com.springcore.annotations;

import java.util.Map;

public class Add {
	
	private Map<String,Integer> contactList;
	private String gfName;
	
	public Add(Map<String, Integer> contactList, String gfName) {
		super();
		this.contactList = contactList;
		this.gfName = gfName;
	}
	@Override
	public String toString() {
		return "Add [contactList=" + contactList + ", gfName=" + gfName + "]";
	}
	

}
