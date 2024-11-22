package in.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.User;
import in.main.service.UserService;

@SpringBootApplication
public class SpringDataJpaSortingEx1 {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaSortingEx1.class, args);
		
		
		  UserService serv = run.getBean(UserService.class);
		  
			/*
			 * List<User>usersList = serv.getAllUsersSortedByName(); for(User u :usersList)
			 * { System.out.println(u); }
			 */

			/*
			 * List<User>usersList = serv.getAllUsersSortedByAgeName(); for(User u
			 * :usersList) { System.out.println(u); }
			 */

		  
		  List<User>usersList = serv.showAllUsersSorted();
		  for(User u :usersList) {
			  System.out.println(u);
		  }

		
	}

}
