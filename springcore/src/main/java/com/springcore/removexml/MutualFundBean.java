package com.springcore.removexml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("mf")
public class MutualFundBean {
	
	public void showMutualFunds() {
		
		System.out.println("Canara robeco small cap fund");
	}

}
