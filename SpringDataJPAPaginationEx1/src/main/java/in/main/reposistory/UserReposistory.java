package in.main.reposistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.main.model.User;

public interface UserReposistory  extends JpaRepository<User, Integer>{
	
	
	 @Query("From User u where u.email like '%gmail.com%' order by u.name desc")
	    List <User> getAllGmailUsersSortedByName();


}
