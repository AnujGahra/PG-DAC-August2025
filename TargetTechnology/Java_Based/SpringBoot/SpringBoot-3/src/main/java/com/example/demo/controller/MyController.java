package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	  
	public String welcomeView() {
		return "index";
	}

}
