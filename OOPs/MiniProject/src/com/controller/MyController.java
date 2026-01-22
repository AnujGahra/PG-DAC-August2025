package com.controller;

import com.dto.Employee;
import com.service.MyService;
import com.service.MyServiceImpl;

public class MyController {
	
	private MyService myService;
	
	public MyController() {
		myService = new MyServiceImpl();
	}
	
	public void getData(Employee employee) {
//		GET DATA ----> ServiceIMPL
		
		myService.insert(employee);
	}

}
