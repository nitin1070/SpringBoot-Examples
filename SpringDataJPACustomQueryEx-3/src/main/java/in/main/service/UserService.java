package in.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.model.UserNameAgeProjection;
import in.main.reposistory.UserReposistory;

@Service
public class UserService {
	@Autowired
	private UserReposistory repo;

	 public UserNameAgeProjection getNameAgeByEmail(String email) {
	    	return repo.getNameAgeByEmail(email);
	    }
	    public int updateUserAgeAndName(int age,String name,int id) {
	    	return repo.updateUserAgeAndName(age, name, id);
	    }

	
}
