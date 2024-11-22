package in.main.reposistory;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.main.model.User;

public interface UserReposistory  extends CrudRepository<User, Integer>{
	 @Query("Select u.name from User u where u.email=:email")
	    String getNameByEmail(String email);


}
