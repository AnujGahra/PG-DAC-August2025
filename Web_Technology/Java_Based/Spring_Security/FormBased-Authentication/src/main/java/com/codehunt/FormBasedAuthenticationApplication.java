package com.codehunt;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.codehunt.dao.UserRepo;
import com.codehunt.entity.User;

@SpringBootApplication
public class FormBasedAuthenticationApplication implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(FormBasedAuthenticationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("HII");

//		DATA Insert: User Pass, ROLE

		User user1 = new User("admin", bCryptPasswordEncoder.encode("admin123"), "ROLE_ADMIN");
		User user2 = new User("member", bCryptPasswordEncoder.encode("member123"), "ROLE_MEMBER");

		List<User> list = Arrays.asList(user1, user2);

		userRepo.saveAll(list);

	}

}
