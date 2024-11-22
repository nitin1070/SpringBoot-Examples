package in.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.main.model.User;
import in.main.reposistory.UserReposistory;

@Service
public class UserService {
	@Autowired
	private UserReposistory repo;
	
	  public List<User> getUsers(int age){
	    	Sort sort=Sort.by("name").descending();
	       	return repo.findByAgeGreaterThan(age, sort);
	    }

	
	
	
	
	
}
