package com.spring.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HondaAutowire {
	
	@Value("10")
	private int carId;
	
	private CarAutowire car;
	
	//constructor base autowire 
//	@Autowired
//	public HondaAutowire(CarAutowire car) {
//		this.car = car;
//	}
	
	//setter base autowire 
	@Autowired
	public void setCar(CarAutowire car) {
		this.car = car;
	}



	public void displayName() {
		car.displayName();
	}
}
