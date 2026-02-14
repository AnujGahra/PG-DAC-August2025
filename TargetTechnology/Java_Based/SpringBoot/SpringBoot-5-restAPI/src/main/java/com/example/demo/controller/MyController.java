package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.MyService;

@Controller
public class MyController {
	
	
	@Autowired
	private MyService myService;
	
	
	@ResponseBody  // used -> we not want to render view we want to data that's why it used
	@GetMapping("api/readsales")
	public Map<Integer, Integer> readSaleData() {
		
		
		return myService.salesData();
	}
	
	

}
