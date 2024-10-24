package com.springcore.stereotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", courseDetails=" + courseDetails + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Value("Nitin Meena")
	private String name;
	@Value("22")
	private int age;
	
	@Autowired
	private CourseDetails courseDetails;

	public CourseDetails getCourseDetails() {
		return courseDetails;
	}
	public void setCourseDetails(CourseDetails courseDetails) {
		this.courseDetails = courseDetails;
	}
	

}
