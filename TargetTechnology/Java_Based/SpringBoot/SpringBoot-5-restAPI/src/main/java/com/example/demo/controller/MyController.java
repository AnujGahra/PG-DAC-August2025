package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

		return myService.testRead();
	}

	@PostMapping("insert")
	public ResponseEntity<String> insert(@RequestBody EmployeeDTO employeeDTO) {
		
		String result = myService.insert(employeeDTO);
		
		if(result.equals("SUCCESS")) {
			
			return new ResponseEntity<>(result, HttpStatus.CREATED);
			
		} else {
			return new ResponseEntity<>(result, HttpStatus.CONFLICT);
		}

	}
	
	
	@GetMapping("read")
	public ResponseEntity<List<String>> read() {
		
		return new ResponseEntity<>(myService.read(), HttpStatus.OK);

	}

}
