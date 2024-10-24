package in.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.model.Student;
import in.main.reposistory.StudentRepo;

@Service
public class StudentService {
	@Autowired
public StudentService(StudentRepo repo) {
	
		this.repo = repo;
	}

private StudentRepo repo;

  public void save(Student s) {
	  repo.save(s);
  }
public Student findById(int id) {
	
	return repo.findById(id);
}


}
