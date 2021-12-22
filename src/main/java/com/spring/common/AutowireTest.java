package com.spring.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowireTest {

	@Autowired
	private HondaAutowire hondaAutowire;
	
	public void displayName() {
		hondaAutowire.displayName();
	}
	
}
