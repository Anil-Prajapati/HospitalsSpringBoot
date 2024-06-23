package com.spring.operation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.operation.model.Student;
import com.spring.operation.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Iterable<Student> getAll(){
		return studentRepository.findAll();
	}
	
	public Student getIdDetails(int id) {
		return studentRepository.findById(id).orElse(new Student());
	}
	
	public Student create(Student student) {
		return studentRepository.save(student);
	}
	
	public Student update(int id,String name,String address,String email) {
		Student student = studentRepository.findById(id).orElse(new Student());
		student.setEmail(email);
		student.setName(name);
		student.setAddress(address);
		return studentRepository.save(student);
	}
	
	public void delete(int id) {
		studentRepository.deleteById(id);
	}
	
	public Student getName(String name) {
		return studentRepository.findByName(name);
	}
}
