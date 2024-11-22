package in.main.reposistory;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.main.model.User;
import in.main.model.UserNameAgeProjection;
import jakarta.transaction.Transactional;

public interface UserReposistory  extends CrudRepository<User, Integer>{
	
	 @Query("Select u.name as name,u.age as age from User u where u.email=:email")
	    UserNameAgeProjection getNameAgeByEmail(String email);
	    
	    @Modifying
	    @Transactional
	    @Query("Update User u set u.age=:age,u.name=:name where u.id=:id")
	    int updateUserAgeAndName(int age,String name,int id);


}
