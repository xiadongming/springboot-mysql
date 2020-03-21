package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.demo.dao") 
@SpringBootApplication
public class SpringbootBootrabbitmqApplication {
	
	Log log = LogFactory.getLog(SpringbootBootrabbitmqApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBootrabbitmqApplication.class, args);
	
	}

}
