package com.example.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	    @GetMapping("/")
	    public String hello(){
	        return "Goto Mars unless It is occupied by aliens. Then go to Jupiter.";
	    }
}
