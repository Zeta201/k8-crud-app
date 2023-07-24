package com.zeta.springboot.k8crudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeta.springboot.k8crudapp.StudentRepository;
import com.zeta.springboot.k8crudapp.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public List<Student> retrieveStudents(){
		return repository.findAll();
	}
	
	public Student createStudent(Student student) {
		return repository.save(student);
	}
}
