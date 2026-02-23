package com.test.codehunt.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class MyController {
	
	
	@GetMapping("/login")
	public void login() {
		
	}  
	
	
	
	@GetMapping("/member")
	public void member() {
		
	}  
	
	
	@GetMapping("/admin")
	public void admin() {
		
	}  
	

}
