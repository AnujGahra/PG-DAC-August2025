package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.service.MyService;

//@Controller

@RestController // = Controller + ResponseBody
@RequestMapping("/api/")
public class MyController {

	@Autowired
	private MyService myService;

//	@ResponseBody  // used -> we not want to render view we want to data that's why it used
	@GetMapping("readtest")
	public String test() {

		return myService.read();
	}

	@PostMapping("insert")
	public void insert(@RequestBody EmployeeDTO employeeDTO) {
		
		System.out.println(employeeDTO);

	}

}
