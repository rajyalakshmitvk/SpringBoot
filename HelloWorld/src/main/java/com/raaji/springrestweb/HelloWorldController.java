package com.raaji.springrestweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String Hello()
	{
		System.out.println("Hi Bannu");
		return "Bannu";
	}
}
