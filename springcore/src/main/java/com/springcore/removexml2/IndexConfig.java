package com.springcore.removexml2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IndexConfig {
	
	@Bean(name = "nifty")
	public NiftyBean showNifty() {
		
		NiftyBean n = new NiftyBean();
		
		return n;
	}
		
	@Bean(name = "sensex")
	public SensexBean showSensex() {
		
		SensexBean s = new SensexBean();
		
		return s;
		 
	}
	
	@Bean(name="finnifty")
	public FinNifty showFinNifty() {
		
		FinNifty f = new FinNifty();
		return f;
		
		
		
	}
	
	
	



}
