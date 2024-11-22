package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.service.UserService;

@SpringBootApplication
public class SpringDataJpaFinderEx1Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaFinderEx1Application.class, args);
		
		  UserService serv = run.getBean(UserService.class);
			 System.out.println(serv.findByName("nitin")); 
	}

}
