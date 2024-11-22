package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.User;
import in.main.service.UserService;

@SpringBootApplication
public class SpringDataJpaRepoEx4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaRepoEx4Application.class, args);
		
		
		
		 UserService service = run.getBean(UserService.class);
		 User user = new User();
		 /* To delete The data */
			/* user.setId(106); */
		 /* service.deleteById(107); */
		
		
		
		 /* To delete all entities */
		 service.deleteAll(user);
		
	}

}
