package com.codehunt;

import com.codehunt.controller.MyController;
import com.codehunt.dao.UserRepo;
import com.codehunt.entity.User;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Security1Application implements CommandLineRunner {

    private final MyController myController;
    
    @Autowired
    private UserRepo userRepo;
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    Security1Application(MyController myController) {
        this.myController = myController;
    }

	public static void main(String[] args) {
		SpringApplication.run(Security1Application.class, args);
		System.out.println("Hello");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hii");
		
		
//		Data Insert: User, Password, Role
		User user1 = new User("admin", bCryptPasswordEncoder.encode("admin123"), "ROLE_ADMIN");
		User user2 = new User("member", bCryptPasswordEncoder.encode("member123"), "ROLE_MEMBER");
		
		List<User> list = Arrays.asList(user1, user2);

		userRepo.saveAll(list);
		
		
	}

}
