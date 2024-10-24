package in.main.reposistory;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.main.model.Employee;

public class EmployeeRowMapper  implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	Employee e = new Employee();
	e.setId(rs.getInt("id"));
	e.setName(rs.getString("name"));
	e.setDept(rs.getString("dept"));
	e.setSal(rs.getInt("sal"));
			
		return e;
	}
	
	

}
