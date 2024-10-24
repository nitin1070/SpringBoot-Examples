package in.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.model.Employee;
import in.main.reposistory.EmployeeReposistory;

@Service
public class EmployeeService {
	private EmployeeReposistory repo;
	@Autowired
	public EmployeeService(EmployeeReposistory repo) {
		
		this.repo = repo;
	}

	public int saveEmployee(Employee e) {
		
		return repo.saveEmployee(e);
	}
	
	public int updateEmployee(Employee e) {
		
		return repo.updateEmployee(e);
		
	}
	
	public int deleteEmployee(Integer id) {
		
		return repo.deleteEmployee(id);
		
	}
	
	public Employee findById(int id) {
		
		return repo.findById(id);
		
	}
	
	public List<Employee> findAll() {
		
		return repo.findAll();
		
	}


	
	
	


}
