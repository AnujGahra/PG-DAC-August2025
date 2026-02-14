package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;

//@Controller

@RestController // = Controller + ResponseBody
public class MyController {
	
	
	@Autowired
	private MyService myService;
	
	
//	@ResponseBody  // used -> we not want to render view we want to data that's why it used
	@GetMapping("api/readsales")
	public String read() {
		
		
		return myService.read();
	}
	
	
	@GetMapping("api/read")
	public String readView(Model model) {
		model.addAttribute("key", myService.read());
		
		return "read";
	}
	

}
