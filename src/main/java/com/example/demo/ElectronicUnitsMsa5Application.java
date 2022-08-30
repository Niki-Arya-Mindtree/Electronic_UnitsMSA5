package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ElectronicUnitsMsa5Application {

	@GetMapping("/user")
	public String print() {
		return "Hello I am Connected";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ElectronicUnitsMsa5Application.class, args);
	}

}
