package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/hello")
	public String getTest(){
		return "hello worsssd";
	}
	@RequestMapping("/hello2")
	public String getTes2t(){
		return "hello worsssd";
	}
	@RequestMapping("/hello5")
	public String getTes23(){
		return "hello worsssd";
	}
}
