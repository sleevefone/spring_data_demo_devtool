package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String getTest(){
		return "hello worsssd";
	}
	@GetMapping("/hello2")
	public String getTes2t(){
		return "hello worsssd";
	}
	@GetMapping("/hello5")
	public String getTes23(){
		return "hello worsssd";
	}
}
