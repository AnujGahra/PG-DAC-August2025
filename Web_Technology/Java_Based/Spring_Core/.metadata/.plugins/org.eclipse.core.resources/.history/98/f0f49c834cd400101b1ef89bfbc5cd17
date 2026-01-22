package com.mainapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mainapp.Employee;

@Configuration
@ComponentScan(basePackages =  {"com.mainapp"})
public class MyConfiguration {
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
}
