package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.User;
import in.main.service.UserService;

@SpringBootApplication
public class SpringDataJpaRepoEx1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaRepoEx1Application.class, args);
		
		UserService service = run.getBean(UserService.class);
		  if(service!=null) {
			  User user = new User();
			  user.setId(104);
			  user.setName("Ajay");
			  user.setAge(25);
			  user.setEmail("ajay@gmail.com");
			    service.save(user);
			    
			    User user2 = new User();
				  user2.setId(105);
				  user2.setName("pawan");
				  user2.setAge(23);
				  user2.setEmail("pawan@gmail.com");
				    service.save(user2);
			    
		  }
		
	}

}
