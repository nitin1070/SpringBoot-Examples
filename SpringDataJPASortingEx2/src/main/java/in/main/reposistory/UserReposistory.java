package in.main.reposistory;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.main.model.User;
import in.main.model.UserNameAgeProjection;
import jakarta.transaction.Transactional;

public interface UserReposistory  extends JpaRepository<User, Integer>{
	
	
	 List <User> findByAgeGreaterThan(int age,Sort sort);

}