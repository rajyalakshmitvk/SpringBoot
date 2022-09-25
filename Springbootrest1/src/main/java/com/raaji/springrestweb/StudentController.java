package com.raaji.springrestweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private IStudentService stuservice;
	
	
	//mapping the url to get students data
		
	@GetMapping(value="/student")
	public List<Student> getStudent()
	{
		//finds all the students
		List<Student> students = stuservice.findAll();
		return students;
		
	}
	
	@RequestMapping(value="/student/{sid}",method=RequestMethod.GET,headers="Accept=application/json")
	public Student getStudent(@RequestParam int sid)
	{
		//finds required student
		Student student = stuservice.findById(sid);
		return student;
		
	}

}
