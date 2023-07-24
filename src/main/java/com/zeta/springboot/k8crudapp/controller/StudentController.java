package com.zeta.springboot.k8crudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeta.springboot.k8crudapp.entity.Student;
import com.zeta.springboot.k8crudapp.service.StudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	
	@GetMapping({"/",""})
	public List<Student> retrieveStudents(){
		return service.retrieveStudents();
	}
	
	@PostMapping({"/",""})
	public Student createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
}
