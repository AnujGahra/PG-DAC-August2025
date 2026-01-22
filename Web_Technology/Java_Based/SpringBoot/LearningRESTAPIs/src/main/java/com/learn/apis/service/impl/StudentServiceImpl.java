package com.learn.apis.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.learn.apis.dto.AddStudentRequestDto;
import com.learn.apis.dto.StudentDto;
import com.learn.apis.entity.Student;
import com.learn.apis.repository.StudentRepository;
import com.learn.apis.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;
	private final ModelMapper modelMapper;

	@Override
	public List<StudentDto> getAllStudents() {

		List<Student> students = studentRepository.findAll();

		List<StudentDto> studentDtoList = students.stream()
				.map(student -> modelMapper.map(students, Students.class)

				)).toList();
		return studentDtoList;
	}

	@Override
	public StudentDto getStudentById(Long id) {
		
		Student student =  studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with ID:  " + id));
		return modelMapper.map(student, StudentDto.class);
	}

	@Override
	public StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto) {
		Student newStudent = modelMapper.map(addStudentRequestDto, Student.class);
		Student student = studentRepository.save(newStudent);
		return modelMapper.map(student, StudentDto.class);
	}

}
