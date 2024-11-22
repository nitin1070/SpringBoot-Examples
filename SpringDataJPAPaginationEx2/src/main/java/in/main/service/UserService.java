package in.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.main.model.User;
import in.main.reposistory.UserReposistory;

@Service
public class UserService {
	@Autowired
	private UserReposistory repo;
	
	 public List<User> getUsersPaginated(int pageNum,int pageSize){
	    	Pageable pg=PageRequest.of(pageNum,pageSize);
	    	Page <User> page=repo.findAll(pg);
	    	return page.getContent();
	    	
	    }
	    public List<User> showUsersPaginated(int pageNum,int pageSize){
	    	Pageable pg=PageRequest.of(pageNum,pageSize);
	    	Page <User> page=repo.findAll(pg);
	    	if(page.getTotalPages()==page.getNumber())
	    		   return null;
	    	return page.getContent();
	    	
	    }
	    public List<User> getUsersPaginatedSortedByAge(int pageNum,int pageSize){
	    	Pageable pg=PageRequest.of(pageNum,pageSize,Sort.by("age"));
	    	Page <User> page=repo.findAll(pg);
	    	if(page.getTotalPages()==page.getNumber())
	    		   return null;
	    	return page.getContent();
	    	
	    }
	    public List<User> getUsersPaginatedSortedFilteredByAgeEmail(int pageNum,int pageSize,String email){
	    	Pageable pg=PageRequest.of(pageNum,pageSize,Sort.by("age").descending());
	    	Page <User> page=repo.findByEmailEndingWith(email, pg);
	    	if(page.getTotalPages()==page.getNumber())
	    		   return null;
	    	return page.getContent();
	    	
	    }
	    public List<User> findByEvenAge(){
	    	Pageable pg=PageRequest.of(0,3);
	    	Page <User> page=repo.findByEvenAge(pg);
	    	return page.getContent();
	    }

	
	
}
