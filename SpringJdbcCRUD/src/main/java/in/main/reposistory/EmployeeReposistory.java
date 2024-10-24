package in.main.reposistory;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.main.model.Employee;

@Repository
public class EmployeeReposistory {
	private JdbcTemplate jdbcTemplate;
	public EmployeeReposistory(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e) {
		String sql = "INSERT INTO employee values(?,?,?,?)";
		return jdbcTemplate.update(sql,e.getId(),e.getName(),e.getDept(),e.getSal());
			
	}
	public int updateEmployee(Employee e) {
		String sql = "UPDATE employee SET name=?,dept=?,sal=? WHERE id=?";
		return jdbcTemplate.update(sql,e.getName(),e.getDept(),e.getSal(),e.getId());		
	}
	
	public int deleteEmployee(int id) {
		String sql = "DELETE FROM employee WHERE id=?";
		return jdbcTemplate.update(sql,id);		
	}
	
	public Employee findById(int id) {
		Employee e =null;
		String sql ="SELECT * FROM employee WHERE id =?";
		try {	
	     	e=jdbcTemplate.queryForObject(sql,new EmployeeRowMapper(),id);	
		}
		
		catch (DataAccessException ex) {
			System.out.println("Error "+ex);
			ex.printStackTrace();
		}
		
		
		finally {
			return e;
		}
			
	}
	public List<Employee>findAll(){
		
		String sql ="SELECT * FROM employee";
		
		return jdbcTemplate.query(sql,new EmployeeRowMapper());	
	}
	
	
	
	
	

}
