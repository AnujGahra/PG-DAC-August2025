package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.service.MyService;

@Controller
public class MyController {
	
	
	@Autowired
	private MyService myService;
	
	
	@GetMapping(path = {"index", "home"})
	public String WelcomeHome() {
		
		return "index";
	}
	
	
	@GetMapping("registration")
	public String registrationView() {
		
		return "registration";
	}
	
	
	
	@PostMapping("save")
	public String save(@ModelAttribute EmployeeDTO employeeDTO, RedirectAttributes model) {
		
		System.out.println(employeeDTO);
		myService.save(employeeDTO);
//		model.addAttribute("msg", "Data saved SuccessFully");
		model.addFlashAttribute("msg", "Data saved SuccessFully");

		return "redirect:/registration";
		
	}

}
