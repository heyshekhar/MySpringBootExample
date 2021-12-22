package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.spring.normal.example.StudentBeanExp;

@SpringBootApplication
//@ComponentScan({"com.commandlineRunner","com.spring"})
//@Configuration
//@EnableAutoConfiguration
@ComponentScan("com.commandlineRunner")
@ComponentScan
public class MySpringBootExampleApplication {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public WebClient.Builder getBuilder(){
		return WebClient.builder();
	}
	
	@Bean
	public StudentBeanExp getStudenBean() {
		return new StudentBeanExp();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootExampleApplication.class, args);
	}
	
	@Bean(initMethod="runAfterObjectCreated")
    public MySpringBootExampleApplication getFunnyBean() {
        return new MySpringBootExampleApplication();
    }

	public void runAfterObjectCreated() {
        System.out.println("yooooooooo......... someone called me");
    }


}
