package in.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.reposistory.StudentReposistory;

@Service
public class StudentService {
	@Autowired
	public StudentService(StudentReposistory repo) {
	
		this.repo = repo;
	}

	private StudentReposistory repo;
	
	public int addStudent() {
		return repo.addStudent();
	
		
	}

}
