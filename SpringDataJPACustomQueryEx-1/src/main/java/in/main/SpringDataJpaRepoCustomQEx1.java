package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.service.UserService;

@SpringBootApplication
public class SpringDataJpaRepoCustomQEx1 {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaRepoCustomQEx1.class, args);
		
		
		  UserService service = run.getBean(UserService.class);
		  
		  System.out.println(service.getNameByEmail("arun@gmail.com"));
	
		   
		 
	}

}
