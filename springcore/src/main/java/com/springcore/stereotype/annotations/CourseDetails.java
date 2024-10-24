package com.springcore.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class CourseDetails {
	

	@Override
	public String toString() {
		return "CourseDetails [courseName=" + courseName + ", fee=" + fee + "]";
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	@Value("B.Tech")
	private String courseName;
	
	@Value("45000")
	private int fee;

}
