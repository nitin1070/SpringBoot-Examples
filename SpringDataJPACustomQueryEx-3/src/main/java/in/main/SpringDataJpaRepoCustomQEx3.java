package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.UserNameAgeProjection;
import in.main.service.UserService;

@SpringBootApplication
public class SpringDataJpaRepoCustomQEx3 {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaRepoCustomQEx3.class, args);
		
		
		  UserService serv = run.getBean(UserService.class);
		  
		  System.out.println(serv.updateUserAgeAndName(55,"Deepnashu", 101));
			UserNameAgeProjection obj = serv.getNameAgeByEmail("arun@gmail.com");
			System.out.println(obj.getName());
		    System.out.println(obj.getAge());
			

		   
		 
	}

}
