package com.raaji.springrestweb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService{
	
	ArrayList<Student> students = new ArrayList<Student>();  
	  
	
	//creating an object of ArrayList  
				//adding Students to the List  
	@Override
	public List<Student> findAll()  
	{    
		students.add(new Student(100, "Raaji", "B. Tech", 80.01)); 
		students.add(new Student(101, "Baaji", "Ph. D", 85.01)); 
		students.add(new Student(102, "Virat", "SSC", 90.00));  
		students.add(new Student(103, "Bhuvana", "SSC", 89.00));  
		students.add(new Student(104, "Lakshmi", "M. Tech", 79.28));  
		students.add(new Student(105, "Bannu", "Ph. D",94.00));
		//returns a list of students
	
	return students;  
	}

	@Override
	public Student findById(int sid) {
		//ArrayList<Student> students = new ArrayList<Student>();  
		return (Student)students.stream().filter(e->e.getSid()==sid);
	}  
	
	

}
