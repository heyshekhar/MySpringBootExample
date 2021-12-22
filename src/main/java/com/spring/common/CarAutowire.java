package com.spring.common;

import org.springframework.stereotype.Component;

@Component
public class CarAutowire {

	private String name;
	
	public void displayName() {
		System.out.println("car class");
	}
}
