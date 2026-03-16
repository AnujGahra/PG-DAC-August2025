package com.codehunt;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@Component
public class JwtToken {
	
	private static final long JWT_VALIDITY = 6 * 60 * 60;
	
	private static final String JWT_SECRET_KEY = "ANUJGAHRHACKERANUJ001";

	public String generateMyToken(UserDetails userDetails) {
		
		
		List<String> roles = new ArrayList<>();
		
		for(GrantedAuthority grantedAuthority : userDetails.getAuthorities()) {
			roles.add(grantedAuthority.getAuthority());
		}
		
		
		Map<String, Object> claims = new HashMap<>();
		claims.put("roles", roles);
		
		Jwts.builder()
		.setClaims(claims)
		.setSubject(userDetails.getUsername())
		.setIssuedAt(new Date(System.currentTimeMillis()))
		.setExpiration(new Date(System.currentTimeMillis() + JWT_VALIDITY*1000))
		.signWith(SignatureAlgorithm.HS256, JWT_SECRET_KEY)
		.compact();
		
		return token;
		
	}

}
