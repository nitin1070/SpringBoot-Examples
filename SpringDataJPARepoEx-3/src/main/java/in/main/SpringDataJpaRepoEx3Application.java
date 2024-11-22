package in.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.User;
import in.main.service.UserService;

@SpringBootApplication
public class SpringDataJpaRepoEx3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaRepoEx3Application.class, args);
		
		/* To update The data */
		
		UserService service = run.getBean(UserService.class);
		  if(service!=null) {
			  User user = new User();
			  user.setId(101);
			  user.setName("arun");
			  user.setAge(45);
			  user.setEmail("arun@gmail.com");
			   
			    
			    User user2 = new User();
				  user2.setId(102);
				  user2.setName("deepanshu");
				  user2.setAge(50);
				  user2.setEmail("deepanshu@gmail.com");
				  
				   User user3 = new User();
				   user3.setId(103);
				   user3.setName("Nitin");
				   user3.setAge(50);
				   user3.setEmail("ntin@gmail.com");
				  
				  List<User>userList = List.of(user,user2,user3);
				   service.saveAll(userList);
			    
		  }
		
	}

}
