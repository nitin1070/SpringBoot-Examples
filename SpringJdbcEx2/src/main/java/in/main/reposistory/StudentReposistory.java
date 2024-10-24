package in.main.reposistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentReposistory {
	@Autowired
	public StudentReposistory(JdbcTemplate jdbcTemplate) {

		this.jdbcTemplate = jdbcTemplate;
	}

	private  JdbcTemplate jdbcTemplate;
	
	public int  addStudent() {
		String sql1= "INSERT INTO students values(101,'Sneha',21)";
		String sql2= "INSERT INTO students values(102,'Nitin',23)";
		String sql3= "INSERT INTO students values(103,'Heeya',19)";
		int[] count=jdbcTemplate.batchUpdate(sql1,sql2,sql3);
		for(int n:count) {
			
			System.out.println("Rec inserted :"+n);
		}
		return count.length;
		
	}

}
