package com.example.demo.web;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RequestMapping("/web")
@RestController
public class JpaController {
	Log log = LogFactory.getLog(JpaController.class);
	
	@Autowired
	private StudentService studentServiceImpl;
	
	@RequestMapping("/query")
	public void getTest(@RequestParam String sourceid) {
		List<Student> queryAll = studentServiceImpl.queryAll(sourceid);
		for (Student student : queryAll) {
			System.out.println(JSONObject.toJSONString(student));
		}
		log.info("输出的日志信息是 ： "+JSONObject.toJSONString(queryAll));
	}
	@RequestMapping("/query2")
	public void getTest2(@RequestParam Integer sourceid) {
		List<Student> queryAll = studentServiceImpl.queryAll2(sourceid);
		for (Student student : queryAll) {
			System.out.println(JSONObject.toJSONString(student));
		}
		log.info("输出的日志信息是 ： "+JSONObject.toJSONString(queryAll));
	}

}
