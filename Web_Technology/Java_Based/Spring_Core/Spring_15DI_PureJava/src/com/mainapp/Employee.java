package com.mainapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	

	private Account account;
	
	public Employee() {
		System.out.println("EMP Bean Instantiation...");

	}

	public Employee(Account account) {
		super();
		System.out.println("EMP Bean Instantiation...");

		this.account = account;
	}

	public Account getAccount() {
		return account;
	}
	
	@Autowired
	public void setAccount(Account account) {
		System.out.println("Employee Setter Called...");
		this.account = account;
	}

	@Override
	public String toString() {
		return "Employee [account=" + account + "]";
	}
	
	
	
    
}
