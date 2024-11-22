package in.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.model.User;
import in.main.reposistory.CrudeRepo;

@Service
public class UserService {
	@Autowired
	private CrudeRepo repo;
	
	public User findByName(String name) {
		return repo.findByName(name);
	}
	

}
