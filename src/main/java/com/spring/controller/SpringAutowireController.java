package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.common.AutowireTest;

@RestController
@RequestMapping("/api/springautowirecontroller")
public class SpringAutowireController {

	@Autowired
	private AutowireTest autowireTest;
	
	@GetMapping(value = "/welcome")
	public String welcomeMessage() {
		return "this is springexamplecontroller ms example";
	}
	
	@GetMapping(value = "/autowiredisplay")
	public String autowireDisplay() {
		
		autowireTest.displayName();
		return "scopetest completed";
	}
}
