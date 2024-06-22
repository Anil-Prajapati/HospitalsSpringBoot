package com.spring.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.operation.model.Student;

import jakarta.transaction.Transactional;

@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
