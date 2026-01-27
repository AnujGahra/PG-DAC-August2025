 package com.codehunt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
        	.authorizeHttpRequests()
        	.antMatchers("/member").hasRole("MEMBER")
        	.antMatchers("/admin").hasRole("ADMIN")
        	.anyRequest().permitAll()
        	.and()
        	.httpBasic();
//            .authorizeRequests()
//                .antMatchers("/member", "/admin").authenticated()
//                .anyRequest().permitAll()
//            .and()
//            .httpBasic();   
    }
    
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	auth
    		.inMemoryAuthentication()
    		.withUser("admin123")
    		.password(bCryptPasswordEncoder().encode("admin333"))
    		.roles("ADMIN")
    		.and()
    		.withUser("member123")
    		.password(bCryptPasswordEncoder().encode("member333"))
    		.roles("MEMBER");
    		
    }
    
    
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
    	return new BCryptPasswordEncoder();
    }
}
