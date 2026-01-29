package com.codehunt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.codehunt.UserDetailsImpl;
import com.codehunt.dao.UserRepo;
import com.codehunt.entity.User;


@Service
public class MyService implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;
	


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		Optional<User> opt = userRepo.findByUsername(username);
		
		if(opt.isPresent()) {
			User user = opt.get();
			return new UserDetailsImpl(user);
		} else {
//			Throw exceptions
			throw new UsernameNotFoundException("User Not Found");
		}  
		return null;
	}

}
