package com.example.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

@RestController
public class MyController {

    @GetMapping(path="/")
    public String hello(){
        return "Goto Mars unless It is occupied by aliens. Then go to Jupiter.";
    }

}
