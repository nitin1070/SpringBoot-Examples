package in.main.reposistory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.main.model.User;

public interface UserReposistory  extends JpaRepository<User, Integer>{
	
	
	  Page<User> findByEmailEndingWith(String email,Pageable pageable);
      
      @Query("Select u From User u where mod(u.age,2)=0")
      Page<User>findByEvenAge(Pageable pageable);


}
