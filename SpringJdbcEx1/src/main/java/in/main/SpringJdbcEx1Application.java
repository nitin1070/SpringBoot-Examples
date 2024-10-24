package in.main;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.Student;
import in.main.services.StudentService;

@SpringBootApplication
public class SpringJdbcEx1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container=SpringApplication.run(SpringJdbcEx1Application.class, args);
		
			Scanner kb = new Scanner(System.in);
				
		String choice;
		StudentService serv=container.getBean(StudentService.class);
		do {
			System.out.println("Enter roll");
			int r=kb.nextInt();
		
			System.out.println("Enter name");
			String str=kb.next();
		
			System.out.println("Enter per");
			double p=kb.nextDouble();
		
			Student s=container.getBean(Student.class);
			s.setRoll(r);
			s.setName(str);
			s.setPer(p);
			serv.addStudent(s);
			System.out.println("Any more (yes/no) ?");
			choice=kb.next();
		
	 	}
		while(choice.equalsIgnoreCase("yes"));
		
	    System.out.println("Total records saved:"+serv.getCount());
	    
	    System.out.println("Enter roll no to search");
	    
	    int roll=kb.nextInt();
	    
	    String name=serv.findById(roll);
	    if(name==null) {
	    	System.out.println("Roll no not found!");
	    }else {
	    	System.out.println("Roll no "+roll+" is of "+name);
	    }
	   

	}

}
