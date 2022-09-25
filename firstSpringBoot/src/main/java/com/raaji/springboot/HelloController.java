package com.raaji.springboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello Welcome to Springboot";
	}
    
	@GetMapping("/hello/{id}")
	public String welcome(@PathVariable(value="id") String id)
	{
		return "<h1>id</h1>";
	}
}
