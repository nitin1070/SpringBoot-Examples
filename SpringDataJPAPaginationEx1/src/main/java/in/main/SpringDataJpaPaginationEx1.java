package in.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.User;
import in.main.service.UserService;

@SpringBootApplication
public class SpringDataJpaPaginationEx1 {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaPaginationEx1.class, args);
		
		  
		  UserService serv=run.getBean(UserService.class);
		  List<User>userList = serv.getUsersPaginated();
		  for(User user :userList) {
			  System.out.println(user);
			  
		  }
		
			

		
	}

}
