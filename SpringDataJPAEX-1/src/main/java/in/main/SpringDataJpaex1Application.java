package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.Student;
import in.main.service.StudentService;

@SpringBootApplication
public class SpringDataJpaex1Application {

	private static ConfigurableApplicationContext run;

	public static void main(String[] args) {
		
		run = SpringApplication.run(SpringDataJpaex1Application.class, args);
		
		StudentService service= run.getBean(StudentService.class);
		
		Student s = new Student(1, "nitin", 40.1);
		
		service.save(s);
		Student s2= new Student(2, "sneha", 85.2);
		service.save(s2);
		System.out.println("studetn roll no. "+service.findById(1));
		
	}

}
