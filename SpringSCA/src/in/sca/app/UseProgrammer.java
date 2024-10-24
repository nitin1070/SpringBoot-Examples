package in.sca.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sca.beans.Programmer;

public class UseProgrammer {
	
public static void main(String[] args) {
       ApplicationContext container = new ClassPathXmlApplicationContext("/in/sca/resources/computerConfig.xml");
	
	Programmer p1 = container.getBean("prog1",Programmer.class);
	
	Programmer p2 = container.getBean("prog2",Programmer.class);
	 p1.writeCode();
	 System.out.println("==============================");
	 p2.writeCode();
	
}
    


}
