package com.example.demo.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDTO;

@Service
public class MyService {
	
	
 
	
	public String testRead() {
		return "sucess";
	}

	public String insert(EmployeeDTO employeeDTO) {
		
		
		return "SUCCESS";
		
	}
	
	
	public List<String> read() {
		return Arrays.asList("abc", "sdjf", "sfd");
	}
	
	
//	Delete
	public void delete(int id) {
		
	}
	
	
	

}
