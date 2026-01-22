package com.mainapp;

import java.util.UUID;

import com.beans.Account;
import com.beans.Employee;

public class ObjectFactory {
	
	private Account account;
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Employee getObj() {
		Employee employee = new Employee();
		employee.setEid(UUID.randomUUID().toString());
		employee.setAccount(account);
		
		
		return employee;
		
	}
	

}
