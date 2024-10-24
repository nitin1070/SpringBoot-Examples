package in.main.reposistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.main.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepo {
@Autowired
	public StudentRepo(EntityManager em) {
	
		this.em = em;
	}

	private EntityManager em;
	
	public void save(Student s) {
		 em.persist(s);
	}

	public Student findById(int id) {
		return em.find(Student.class, id);
	}
	

	
}
