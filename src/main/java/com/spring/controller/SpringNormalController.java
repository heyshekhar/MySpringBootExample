package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.normal.example.StudentBeanExp;
import com.spring.normal.example.StudentBean;

@RestController
@RequestMapping("/api/springnormalcontroller")
public class SpringNormalController {

	@Autowired
	private StudentBean studentBean;
	
	@GetMapping(value = "/welcome")
	public String welcomeMessage() {
		return "this is springexamplecontroller ms example";
	}
	
	@GetMapping(value = "/studentbeantest")
	public String scopeTestMethod() {
		
//		Student student = studentBean.student();
		studentBean.display();
		return "scopetest completed";
	}
	
	
	
}
