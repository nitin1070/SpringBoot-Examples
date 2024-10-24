package com.springcore.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class StocksMain {
	public static void main (String [] args) {
		
	 ApplicationContext context = new AnnotationConfigApplicationContext(StocksConfig.class);
	 
	 
	  MutualFundBean mf = context.getBean("mf",MutualFundBean.class);
	  StocksBean s= context.getBean("s",StocksBean.class);
	  mf.showMutualFunds();
	  s.showStocksName();
	 
	  
	}
	


}
