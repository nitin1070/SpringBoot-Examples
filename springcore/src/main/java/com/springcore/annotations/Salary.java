package com.springcore.annotations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class Salary {


	private HashMap<String, Long> salList;
	private List<String>empList;
	
	public Map<String, Long> getSalList() {
		return salList;
	}
	
	
	
	
	public void setSalList(HashMap<String, Long> salList) {
		this.salList = salList;
		
		
	}
	
	public List<String> getEmpList() {
		return empList;
	}
	public void setEmpList(List<String> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "Salary [salList=" + salList + ", empList=" + empList + "]";
	}
	
}
