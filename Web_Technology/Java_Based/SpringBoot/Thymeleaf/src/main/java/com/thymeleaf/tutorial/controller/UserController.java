package com.thymeleaf.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	
	@GetMapping("/show")
	public String show(Model model) {
		
		String channel = "Admin";
		model.addAttribute("name", channel);
		return "show";
	}
}
