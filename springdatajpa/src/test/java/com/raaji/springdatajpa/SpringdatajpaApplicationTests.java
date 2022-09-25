package com.raaji.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.raaji.springdatajpa.entities.Student;
import com.raaji.springdatajpa.services.StudentService;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	StudentService service;
	@Test
	void curdOperations() {
		Student stu = new Student();
		stu.setName("Raaji");
		stu.setTestScore(20);
		System.out.println(service.save(stu));
		Student savedStu = service.save(stu);
		System.out.println(savedStu.getId() + " : "+ savedStu.getName()
		+ " : "+ savedStu.getTestScore());
		Student stuFromDB = service.get(1l).get();
		System.out.println(stuFromDB.getId() + " : "+
		stuFromDB.getName() + " : "+ stuFromDB.getTestScore());
		Student updateStu = stuFromDB;
		updateStu.setName("Raaji-1");
		Student save = service.save(updateStu);
		System.out.println(save.getId() + " : "+ save.getName() + " : "+
		save.getTestScore());
		}

	

}
