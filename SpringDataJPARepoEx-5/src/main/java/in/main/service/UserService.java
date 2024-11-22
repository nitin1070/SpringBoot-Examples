package in.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.model.User;
import in.main.reposistory.UserReposistory;

@Service
public class UserService {
	@Autowired
	private UserReposistory repo;

	/* To find single user data */

	
	  public Optional<User> FindById(int id) { return repo.findById(id); }
	 

	/* To find all user data */

	public Iterable<User> findAll() {
		return repo.findAll();
	}

	/* To check an existing record present or not */
	public boolean existById(int id) {
		return repo.existsById(id);
	}

}
