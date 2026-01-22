package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/registeration.do")
	public String register() {
		System.out.println("Tested......");
		
		return "registration";
	}
}
