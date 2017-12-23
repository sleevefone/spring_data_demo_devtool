package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class DemoApplicat2 {


	@GetMapping("/hello")
	public String getTest(){
		return "hello 1234";
	}
	@GetMapping("/hello2")
	public String getTes2t(){
		return "hello fjdksafjkdsaljfad;fj;";
	}
	@GetMapping("/hello5")
	public String getTes23(){
		return "hello 123";
	}
}
