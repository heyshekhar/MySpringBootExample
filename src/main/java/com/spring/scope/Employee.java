package com.spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Employee {

	@Autowired
	private Address address;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	public void display() {
		System.out.println("employee class hash code : "+this.hashCode());
//		address.display();
		
		//by using the application context we can achieve the prototype functionality of address class
		applicationContext.getBean(Address.class).display();
	}
}
