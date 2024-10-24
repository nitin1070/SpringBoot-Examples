package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.StudentDao;
import com.spring.entity.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/myConfig.xml");
    	
    	StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    	
    	Student student = new Student(120,"Sruti","Indore");
    	
    	int res= studentDao.insert(student);
    	
    	System.out.println("result  "+res);
    	
    	
    	
    }
}
