package com.mainapp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("emp")
@Component
@Lazy
//@Scope("prototype")
public class Employee {

        public Employee() {
        	System.out.println("Bean Instantiation...");
        }
        
        
        @PostConstruct
        public void init() {
        	System.out.println("Bean Init...");
        }
        
        
        @PreDestroy
        public void destroy() {
        	System.out.println("Bean Destroy...");
        }
        
        
        public void test() {
        	System.out.println("Bean Tested...");
        }
    
}
