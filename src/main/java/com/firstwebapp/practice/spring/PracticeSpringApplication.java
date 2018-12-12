package com.firstwebapp.practice.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class PracticeSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(PracticeSpringApplication.class, args);
		System.out.println("http://localhost:8080");
	}

}