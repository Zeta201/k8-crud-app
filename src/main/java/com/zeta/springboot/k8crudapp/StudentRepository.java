package com.zeta.springboot.k8crudapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zeta.springboot.k8crudapp.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
