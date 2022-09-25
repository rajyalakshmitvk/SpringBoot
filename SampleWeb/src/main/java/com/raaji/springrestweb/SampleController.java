package com.raaji.springrestweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	@RequestMapping("/courses")
	public String display()
	{
		System.out.println("Welcome to courses");
		return "courses.jsp";
	}

}
