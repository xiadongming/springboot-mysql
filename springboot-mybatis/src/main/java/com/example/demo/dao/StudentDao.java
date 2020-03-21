package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public interface StudentDao {
	
	List<Student> queryList(@Param(value = "sourceid") String sourceid);
	
	List<Student> queryList2(@Param(value = "sourceid") Integer sourceid);

}
