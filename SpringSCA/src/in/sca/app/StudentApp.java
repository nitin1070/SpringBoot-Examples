package in.sca.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.sca.beans.Student;

public class StudentApp {
	
	public static void main(String[] args) {
		
		Resource rs = new ClassPathResource("/in/sca/resources/config.xml");
		
		BeanFactory container = new XmlBeanFactory(rs);
		System.out.println("container calling ....");
		Student s=  container.getBean("stdobj",Student.class);
		
		  System.out.println("name :"+s.getName());
		  System.out.println("roll no :"+ s.getRollno());
		
		
		
	}

}
