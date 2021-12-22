package com.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {

	public void display() {
		System.out.println("address class hashcode : "+this.hashCode());
	}
	
}
