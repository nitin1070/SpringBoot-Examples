package in.main.reposistory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.main.model.User;

public interface CrudeRepo extends CrudRepository<User, Integer>{
	
	User findByName(String name);
   
		//Get number of users with email id null
		long countByEmailIsNull();
		
		//Find all the users by email or name
		List <User> findByEmailOrName(String email,String name);


}
