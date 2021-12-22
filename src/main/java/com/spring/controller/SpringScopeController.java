package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.scope.ScopeTest;
import com.spring.scope.Student;

@RestController
@RequestMapping("/api/springScopeController")
public class SpringScopeController {

	@Autowired
	private ScopeTest scopeTest;
	
	@GetMapping(value = "/welcome")
	public String welcomeMessage() {
		return "this is springexamplecontroller ms example";
	}
	
	@GetMapping(value = "/scopetest")
	public String scopeTestMethod() {
		
		scopeTest.testSingleton();
		return "scopetest completed";
	}
	
	@GetMapping(value = "/studentscope")
	public String studentScopeTest() {
		
		Student st = scopeTest.getStuentBean();
		Student st1 = scopeTest.getStuentBean();
		
		st.displayStudentDetails();
		st1.displayStudentDetails();
		return "studentscope test completed";
	}
	
	@GetMapping(value = "/employeescope")
	public String employeeScopeTest() {
		
		scopeTest.display();
		scopeTest.display();
		
		return "employeescope test completed";
	}
	
}
