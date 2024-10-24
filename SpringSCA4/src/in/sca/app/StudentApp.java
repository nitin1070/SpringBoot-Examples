package in.sca.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sca.beans.Student;

public class StudentApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("in/sca/resources/config.xml");

		
	}

}
