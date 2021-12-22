package com.commandlinerunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.dto.CommandLineRunnerDto;

@Component
public class CommonLineRunnerExp implements CommandLineRunner, ApplicationRunner {
	
	@Autowired
	private CommandLineRunnerDto commandlinerunnerdto;

	@Override	
	public void run(String... args) throws Exception {
		System.out.println("CommonLineRunnerExp: this is command line runner example......");
		commandlinerunnerdto.display();

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("CommonLineRunnerExp: this is application runner example......");
		
	}

}
