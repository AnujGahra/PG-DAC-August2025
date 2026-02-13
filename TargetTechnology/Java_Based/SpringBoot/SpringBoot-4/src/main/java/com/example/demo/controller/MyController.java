package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.EmployeeDTO;

@Controller
public class MyController {
	
	
	
	@GetMapping(path = {"/", "index", "welcome"})
	public String welcomeView() {
		return "index";
	}
	
	@GetMapping("insert")
	public String insertView() {
		return "insert";
	} 
	
	
	@PostMapping("insert")
	public String insertData(@Valid @ModelAttribute EmployeeDTO employeeDTO, BindingResult bindingResult, Model model) {
		
		List<String> errorList = new ArrayList<>();
		
		if(bindingResult.hasErrors()) {
			List<ObjectError> list = bindingResult.getAllErrors();
//			list.forEach(n->System.out.println(n));
			for(ObjectError oe : list) {
				String defaultMessage = oe.getDefaultMessage();
				System.out.println(defaultMessage);
				errorList.add(defaultMessage);
			}
		} else {
//			SERVICE DTO 7:16: 18
		}
		
		model.addAttribute("errorList", errorList);
		System.out.println(employeeDTO);
		return "insert";
	} 
	
	
	
	
 
}
