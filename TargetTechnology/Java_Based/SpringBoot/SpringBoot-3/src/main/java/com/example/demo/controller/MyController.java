package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.EmployeeDTO;

@Controller
public class MyController {

	  
	@GetMapping({"/", "/index", "/welcome"})
	public String welcomeView() {
		return "index";
	}

	@GetMapping("/insert")
	public String insertView() {
		return "insert";
	}

	@PostMapping("/insert")
	public String insertData(@ModelAttribute EmployeeDTO employeeDTO, Model model) {
		System.out.println(employeeDTO);
		return "redirect:/insert";
	}

}
