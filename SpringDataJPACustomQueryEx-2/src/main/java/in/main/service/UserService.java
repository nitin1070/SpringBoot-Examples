package in.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.model.UserNameAgeProjection;
import in.main.reposistory.UserReposistory;

@Service
public class UserService {
	@Autowired
	private UserReposistory repo;

	public String getNameByEmail(String email) {
		return repo.getNameByEmail(email);
	}

	 public UserNameAgeProjection getNameAgeByEmail(String email) {
	    	return repo.getNameAgeByEmail(email);
	    }

	
}
