package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.UserNameAgeProjection;
import in.main.service.UserService;

@SpringBootApplication
public class SpringDataJpaRepoCustomQEx2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaRepoCustomQEx2.class, args);
		
		
		  UserService service = run.getBean(UserService.class);
		  
		  System.out.println(service.getNameByEmail("arun@gmail.com"));
		
		    UserNameAgeProjection obj = service.getNameAgeByEmail("deepanshu@gmail.com");
			System.out.println(obj.getName());
		    System.out.println(obj.getAge());
			

		   
		 
	}

}
