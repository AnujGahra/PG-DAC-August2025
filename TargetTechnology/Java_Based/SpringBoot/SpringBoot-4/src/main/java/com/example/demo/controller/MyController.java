package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.service.MyService;

@Controller
public class MyController {
	
	
	
	@Autowired
	private MyService myService;
	
	
	
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
			model.addAttribute("errorList", errorList);
		} else {
//			SERVICE DTO 7:16: 18
			String result = myService.insertData(employeeDTO);
			model.addAttribute("errorList", result);
		}
		
		System.out.println(employeeDTO);
		return "insert";
	} 
	
	
	
//	ReadController
	@GetMapping("read")
	public String readView(Model model) {
		
		model.addAttribute("readData", myService.read());
		return "read";
	}
	
	
//	Delete
	@GetMapping("delete")public String deleteData(@RequestParam int id) {
		
		System.out.println(id);
		return "read";
	}
	
	
	
	
 
}
