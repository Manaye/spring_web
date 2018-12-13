package com.firstwebapp.practice.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;


<<<<<<< HEAD
//@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
=======
@SpringBootApplication
>>>>>>> a85237e8510777043f3e4a5fffe9316be82fb4bd
public class PracticeSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(PracticeSpringApplication.class, args);
		System.out.println("http://localhost:8080");
	}


}
