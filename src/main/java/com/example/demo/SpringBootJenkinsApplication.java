package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;


@SpringBootApplication
public class SpringBootJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

	@PostConstruct
	public void newMethod() {
		logger.info("Applciation started");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
		logger.info("Inside main application class");
		
	}

}
