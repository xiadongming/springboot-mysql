package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> queryAll(String sourceid) {
		List<Student> queryList = studentDao.queryList(sourceid);
		return queryList;
	}

	@Override
	public List<Student> queryAll2(Integer sourceid) {
		
		return studentDao.queryList2(sourceid);
	}

}
