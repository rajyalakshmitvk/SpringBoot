package com.raaji.springrestweb;

import java.util.List;

public interface IStudentService {

	Student findById(int sid);

	List<Student> findAll();

}
