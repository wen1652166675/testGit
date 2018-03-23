package com.my.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.demo.Repository.StudentRepository;
import com.my.demo.bean.Student;

@RestController
public class TestController {
	
	@Autowired
	private StudentRepository sr;
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello Git";
	}
	
	@GetMapping("/save")
	public Student save() {
		Student s = new Student();
		s.setClassName("三一班");
		s.setName("lili");
		
		return sr.save(s);
		
	}
}
