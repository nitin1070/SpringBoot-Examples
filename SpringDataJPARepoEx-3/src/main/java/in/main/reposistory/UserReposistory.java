package in.main.reposistory;

import org.springframework.data.repository.CrudRepository;

import in.main.model.User;

public interface UserReposistory  extends CrudRepository<User, Integer>{
	

}
