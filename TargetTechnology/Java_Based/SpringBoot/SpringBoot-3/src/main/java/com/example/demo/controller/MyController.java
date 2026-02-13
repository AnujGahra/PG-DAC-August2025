package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

	  
	@GetMapping(path= {"/", "index", "welcome"})
	public String welcomeView() {
		return "index";
	}  
	
	
	@GetMapping("/insert")
	public String insertView() {
		return "insert";
	}
	
	@PostMapping("/insert")
	public String insertData() {
		return "insert";
	}

}
