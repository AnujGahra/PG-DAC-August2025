package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmployeeRepository;

@Service
public class MyServiceImpl implements MyService {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;

}
