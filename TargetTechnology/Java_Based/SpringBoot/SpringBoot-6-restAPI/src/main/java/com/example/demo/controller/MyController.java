package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.service.MyService;
import com.example.demo.service.MyServiceImpl;

@RestController
@RequestMapping("/api/")
public class MyController {
	
	
	@Autowired
	private MyService myService;
//	private MyServiceImpl myServiceImpl;
	
	
	@PostMapping("employees")
	public ResponseEntity<List<String>> insert(@Valid @RequestBody EmployeeDTO employeeDTO, BindingResult bindingResult) {
		
		
		if(bindingResult.hasErrors()) {
			
			
			List<String> list = new ArrayList<>();
			
			for(ObjectError objectError : bindingResult.getAllErrors()) {
				list.add( objectError.getDefaultMessage());
			}
			
			return new ResponseEntity<>(list, HttpStatus.BAD_REQUEST);
		} else {
//			Service layer
			
			return null;
		}
		
		
	}
	

}
