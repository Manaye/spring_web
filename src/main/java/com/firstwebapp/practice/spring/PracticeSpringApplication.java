package com.firstwebapp.practice.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;


//@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

public class PracticeSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(PracticeSpringApplication.class, args);
		System.out.println("http://localhost:8080");
	}

}
