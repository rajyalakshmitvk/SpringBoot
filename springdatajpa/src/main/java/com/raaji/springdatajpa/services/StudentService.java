package com.raaji.springdatajpa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raaji.springdatajpa.entities.Student;
import com.raaji.springdatajpa.repos.StudentRepository;

@Service
public class StudentService {
	
		@Autowired
		StudentRepository repo;
		public Student save(Student student) {
			return repo.save(student);
		}
	
		public Student update(Student stu) {
			return repo.save(stu);
		}
		public String delete(Long stuId) {
			repo.deleteById(stuId);
			return "User " + stuId + " deleted..";
		}
		public Optional<Student> get(Long id) {
			return repo.findById(id);
		}

}
