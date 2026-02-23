package com.test.codehunt.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.codehunt.payload.JwtAuthRequest;

@RestController("/api")
public class MyController {
	
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	
	@GetMapping("/login")
	public void login(@RequestBody JwtAuthRequest jwtAuthRequest) {
		
		String username = jwtAuthRequest.getUsername();
		String password = jwtAuthRequest.getPassword();
		
		authenticate(username, password);
		
	}  
	
	
	
	private void authenticate(String username, String password) {
		
		UsernamePasswordAuthenticationToken userpass = new UsernamePasswordAuthenticationToken(username, password);
		authenticationManager.authenticate(userpass);
		
		
		
	}



	@GetMapping("/member")
	public void member() {
		
	}  
	
	
	@GetMapping("/admin")
	public void admin() {
		
	}  
	

}
