package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPocApplication {
	
	@Autowired
	private Repo repository;
	
	@PostMapping("/add")
	public Details addDetails(@RequestBody Details details)
	{
		return repository.save(details);
	}
	@GetMapping("/get")
	public List<Details> getDetails()
	{
		return repository.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringPocApplication.class, args);
	}

}
