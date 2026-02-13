package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(SpringBoot1Application.class, args);
	}

}
