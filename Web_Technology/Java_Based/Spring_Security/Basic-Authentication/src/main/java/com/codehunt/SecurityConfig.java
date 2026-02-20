package com.codehunt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.codehunt.service.MyService;


//@SuppressWarnings("deprecation")
@Configuration
//@EnableWebSecurity
public class SecurityConfig{
	
	@Autowired
	private MyService myService;
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http
//		.authorizeHttpRequests()
//		.antMatchers("/member").hasRole("MEMBER")
////		.authenticated()
//		.antMatchers("/admin").hasRole("ADMIN")
////		.authenticated()
//		.anyRequest().permitAll()
//		.and()
//		.httpBasic()
//		.and()
//		.exceptionHandling()
//		.accessDeniedPage("/error/403");
//		
//	}
//	
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
////		In-DataBase Authentication from Database
//		auth.userDetailsService(myService).passwordEncoder(bCryptPasswordEncoder());
//		
//		
//		
////		In-Memory Authentication 
////		auth
////			.inMemoryAuthentication()
////			.withUser("admin123")
////			.password(bCryptPasswordEncoder().encode("admin333"))
////			.roles("ADMIN")
////			.and()
////			.withUser("member123")
////			.password(bCryptPasswordEncoder().encode("member333"))
////			.roles("MEMBER");
//		
//		
//		
//	}
	
	
//	by SecurityFilterChain
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests()
		.antMatchers("/member").hasRole("MEMBER")
		.antMatchers("/admin").hasRole("ADMIN")
		.anyRequest().permitAll()
		.and()
		.httpBasic()
		.and()
		.exceptionHandling()
		.accessDeniedPage("/error/403");
		
		return http.build();
	}
	
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
		
//		In-Memory
		
		
//		Database (DEFAULT)
		
		return authConfig.getAuthenticationManager();
		
	}
	
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder () {
		return new BCryptPasswordEncoder();
	}

}
