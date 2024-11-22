package in.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import in.main.model.User;
import in.main.reposistory.UserReposistory;

@Service
public class UserService {
	@Autowired
	private UserReposistory repo;
	
	public List<User> getUsersPaginated(){
		
    	Pageable pg=PageRequest.of(0, 3);
    	
    	Page <User> page=repo.findAll(pg);
    	
    	return page.getContent();
    	
    }

	
	
}
