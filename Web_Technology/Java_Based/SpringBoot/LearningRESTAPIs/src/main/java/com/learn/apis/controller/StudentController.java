package com.learn.apis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.apis.dto.AddStudentRequestDto;
import com.learn.apis.dto.StudentDto;
import com.learn.apis.entity.Student;
import com.learn.apis.repository.StudentRepository;
import com.learn.apis.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
	
	private final StudentService studentService;
	
	
	



	@GetMapping
	public ResponseEntity<List<StudentDto>> getAllStudent() {
//		return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
		return ResponseEntity.ok(studentService.getAllStudents());
	}  
	
	
	@GetMapping("/{id}")
	public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) {
		return ResponseEntity.ok(studentService.getStudentById(id));
	}  
	
	@PostMapping
	public ResponseEntity<StudentDto> createStudent(@RequestBody AddStudentRequestDto addStudentRequestDto) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
	}

}
