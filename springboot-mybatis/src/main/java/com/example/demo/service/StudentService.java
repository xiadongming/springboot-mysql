package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
	List<Student> queryAll(String sourceid);
	
	List<Student> queryAll2(Integer sourceid);

}
