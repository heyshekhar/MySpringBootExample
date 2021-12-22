package com.spring.normal.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StudentBean {
	
	@Autowired
	private StudentBeanExp student;
	
	public void display() {
		student.display();
	}
}
