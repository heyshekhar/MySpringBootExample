package com.spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ScopeTest {

	@Autowired
	private ScopeExample singletonDto1;
	
	@Autowired
	private ScopeExample singletonDto2;
	
	@Autowired
	private Employee employee;
	
	@Autowired
	private ApplicationContext applicationContext;
//	@Bean
//	@Scope(value="singleton")
//	@Qualifier("student")
	public Student getStuentBean() {
//		return new Student();
		return applicationContext.getBean(Student.class);
	}
	
	
	public void display() {
		/*
		 * this example is for 
		 * What happen when you autowired protoype scope class inside singleton scope class.
		 */
		employee.display();
	}
	
	
	
	
	public void testSingleton() {
		singletonDto1.setId(10);
		singletonDto1.setName("shekhar");
		
		System.out.println("singletonDto1 : "+singletonDto1.getId());
		System.out.println("singletonDto2 : "+singletonDto2.getId());
		
		System.out.println("singletonDto1 : "+singletonDto1.hashCode());
		System.out.println("singletonDto2 : "+singletonDto2.hashCode());
		
	}
	
	
}
