package com.kiran.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.kiran.springboot.controller",
		"com.kiran.springboot.exception",
		"com.kiran.springboot.model",
		"com.kiran.springboot.repository"})
public class SpringbootAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAPIApplication.class, args);
	}

}
