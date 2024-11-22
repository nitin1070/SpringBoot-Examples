package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.service.UserService;

@SpringBootApplication
public class SpringDataJpaRepoEx5Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaRepoEx5Application.class, args);
		
		
		
		 UserService service = run.getBean(UserService.class);
	
			/* to find An user data */
			/* System.out.println(service.FindById(105)); */
		
			/* to find all enttities */
			
		 /*
			 * Iterable<User> userList = service.findAll(); for(User u :userList) {
			 * System.out.println(u); }
			 */
		 
			/* to check Existing record Present or not */
		   System.out.println(service.existById(105)); 
		  
		   
		 
		 
		 
		 
	}

}
