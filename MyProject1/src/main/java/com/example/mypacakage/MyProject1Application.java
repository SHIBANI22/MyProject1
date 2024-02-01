package com.example.mypacakage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class MyProject1Application {
	
	@RequestMapping(value="/")
	public String index() {
		return"<h1>Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyProject1Application.class, args);
	}

}