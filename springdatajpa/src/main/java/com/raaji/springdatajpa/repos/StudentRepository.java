package com.raaji.springdatajpa.repos;



import org.springframework.data.repository.CrudRepository;

import com.raaji.springdatajpa.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
