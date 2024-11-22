package in.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.model.User;
import in.main.reposistory.UserReposistory;

@Service
public class UserService {
	@Autowired
	private UserReposistory repo;
	
	/* to delete single user data */
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
	/* to delete an entity records from db */
	
	public void deleteAnEntity(User user) {
		repo.delete(user);
	}
	
	
/* to delete all  entity records from db */
	
	public void deleteAll(User user) {
		repo.deleteAll();
	}
}
