package com.test.codehunt.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.codehunt.payload.JwtAuthRequest;

@RestController("/api")
public class MyController {
	
	
	@GetMapping("/login")
	public void login(@RequestBody JwtAuthRequest jwtAuthRequest) {
		
		
		
	}  
	
	
	
	@GetMapping("/member")
	public void member() {
		
	}  
	
	
	@GetMapping("/admin")
	public void admin() {
		
	}  
	

}
