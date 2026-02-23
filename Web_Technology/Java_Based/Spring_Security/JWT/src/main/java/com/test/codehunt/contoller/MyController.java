package com.test.codehunt.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codehunt.JwtToken;
import com.test.codehunt.payload.JwtAuthRequest;

@RestController("/api")
public class MyController {
	
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtToken jwtToken;
	
	
	@GetMapping("/login")
	public void login(@RequestBody JwtAuthRequest jwtAuthRequest) {
		
		String username = jwtAuthRequest.getUsername();
		String password = jwtAuthRequest.getPassword();
		
		UserDetails userDetails = authenticate(username, password);
		
		
//		GENERATE TOKEN ON THE BASIC OF UserDetails OBJECT
		jwtToken.generateMyToken(userDetails);
		
	}  
	
	
	
	private UserDetails authenticate(String username, String password) {
		
		UsernamePasswordAuthenticationToken userpass = new UsernamePasswordAuthenticationToken(username, password);
		Authentication authenticate = authenticationManager.authenticate(userpass);
		 UserDetails userDetails = (UserDetails) authenticate.getPrincipal();
		 return userDetails;
		
	}



	@GetMapping("/member")
	public void member() {
		
	}  
	
	
	@GetMapping("/admin")
	public void admin() {
		
	}  
	

}
