package com.spring.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.entity.Student;

public class StudentDao {
	
	HibernateTemplate hibernateTemplate;
	
	public int insert(Student student) {
		
	Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
		
		
		
		
	}

}
