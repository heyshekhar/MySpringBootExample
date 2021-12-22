package com.spring.scope;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	public int id;
	public String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void displayStudentDetails() {
		this.setId(10);
		this.setName("shekhar");
		
		System.out.println("student : "+this.getId());
		
		System.out.println("student hash code : "+this.hashCode());
		
	}
}
