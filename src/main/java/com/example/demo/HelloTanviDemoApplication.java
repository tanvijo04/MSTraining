package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloTanviDemoApplication {

	public static void main(String[] args) {
		Logger logger= LoggerFactory.getLogger(HelloTanviDemoApplication.class) ;
		SpringApplication.run(HelloTanviDemoApplication.class, args);
		logger.trace("Spring Container Running");
	}

}
