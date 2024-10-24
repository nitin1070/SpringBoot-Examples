package sca.springbatchex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.annotations.EmpBean;

public class App {
	
	public static void main (String [] args) {
		
             ApplicationContext context = new ClassPathXmlApplicationContext("sca/springbatchex3/scaconfig.xml");
		
		  LapTopBean b = context.getBean("laptop",LapTopBean.class);
		   ProgrammerBean b2 = context.getBean("programmer",ProgrammerBean.class);
		   
		  b.start();
		  b2.writingcode();
		
		
	}

}
