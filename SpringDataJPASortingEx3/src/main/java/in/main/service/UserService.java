package in.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.model.User;
import in.main.reposistory.UserReposistory;

@Service
public class UserService {
	@Autowired
	private UserReposistory repo;
	
	  public List<User> getUsers(){
	    	
	       	return repo.getAllGmailUsersSortedByName();
	    }

	
	
	
	
}
