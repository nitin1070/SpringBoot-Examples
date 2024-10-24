package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.services.StudentService;

@SpringBootApplication
public class SpringJdbcEx2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =
		
		SpringApplication.run(SpringJdbcEx2Application.class, args);
		
	StudentService service=	container.getBean(StudentService.class);
	 service.addStudent();
		
	}

}
