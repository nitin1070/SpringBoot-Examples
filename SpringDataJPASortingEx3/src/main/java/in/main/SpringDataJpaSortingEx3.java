package in.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.User;
import in.main.service.UserService;

@SpringBootApplication
public class SpringDataJpaSortingEx3 {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaSortingEx3.class, args);
		
		  
		  UserService serv=run.getBean(UserService.class);
			List<User> usersList = serv.getUsers();
			for(User u:usersList) {
				System.out.println(u);
			}


		
	}

}
