package com.briz.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {

	@RequestMapping("/hello")
	
	public String hello()
	{
		return "I am devil of my world";
	}
	
}
