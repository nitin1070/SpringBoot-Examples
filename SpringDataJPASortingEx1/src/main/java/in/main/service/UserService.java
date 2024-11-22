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
	
	/* To get data sorted on the basis of name single field */
	public List<User> getAllUsersSortedByName(){
		Sort sort = Sort.by("name");
		return repo.findAll(sort);
		
	}
	
	/* To get data sorted on the basis of  multiple fields */
		

	public List<User> getAllUsersSortedByAgeName(){
		Sort sort = Sort.by("age","name");
		return repo.findAll(sort);
		
	}
	
	 public List<User> showAllUsersSorted(){
	    	Sort sort=Sort.by(Sort.Order.asc("name"));
	    	return repo.findAll(sort);
	    	
	    }
	    public List<User> printAllUsersSorted(){
	    	Sort sort=Sort.by(Sort.Order.asc("age"),Sort.Order.asc("name"));
	    	return repo.findAll(sort);
	    	
	    }
	    public List<User> dispAllUsersSorted(){
	    	Sort sort=Sort.by(Sort.Order.desc("age"),Sort.Order.asc("name"));
	    	return repo.findAll(sort);
	    	
	    }
	    public List<User> getAllUsersDescSorted(){
	    	Sort sort=Sort.by("name").descending();
	    	return repo.findAll(sort);
	    	
	    }

	
	
	
	
	
}
