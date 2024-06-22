package com.spring.operation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.operation.model.Student;
import com.spring.operation.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/all")
	public Iterable<Student> getAll(){
		return studentService.getAll();
	}
	
	@GetMapping("/{id}")
	public Student getIdDetails(@PathVariable("id") int id) {
		return studentService.getIdDetails(id);
	}
	
	@PostMapping("/create")
	public Student create(@RequestBody Student student) {
		return studentService.create(student);
	}
	
	@PutMapping("/{id}/{name}/{address}")
	public Student update(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("address") String address) {
		return studentService.update(id, name, address);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		studentService.delete(id);
	}
	
}
