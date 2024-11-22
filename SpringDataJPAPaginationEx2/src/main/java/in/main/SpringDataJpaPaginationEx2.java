package in.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.User;
import in.main.service.UserService;

@SpringBootApplication
public class SpringDataJpaPaginationEx2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaPaginationEx2.class, args);
		
		  
		UserService serv = container.getBean(UserService.class);
		
		for (int i = 0;; i++) {			
		List<User> usersList = serv.getUsersPaginatedSortedFilteredByAgeEmail(i, 3, "gmail.com");
			if (usersList==null) {
				break;
			}
			for (User u : usersList) {
				System.out.println(u);
			}
		}
		
		/*List<User> usersList = serv.findByEvenAge();
		for (User u : usersList) {
			System.out.println(u);
		}
	}*/
	}


}
