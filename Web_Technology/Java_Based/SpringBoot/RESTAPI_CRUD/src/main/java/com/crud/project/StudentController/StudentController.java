package com.crud.project.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.project.StudentRep.StudentRepo;
import com.crud.project.model.Student;

@RestController
public class StudentController {
	
	
	@Autowired
	StudentRepo repo;
	
	
	@GetMapping("/student")
	public List<Student> getAllStudents() {
		List<Student> list = repo.findAll();
		
		return list;
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id) {
		Student student = repo.findById(id).get();
		return student;
	}
	
	
	@PostMapping("/create")
	public void createStudent(@RequestBody Student student) {
		repo.save(student);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		repo.delete(student);
	}
	
	
	
}
