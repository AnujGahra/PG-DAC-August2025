package com.beans;

import java.util.UUID;

public class Employee {
	
	
//	Dependency
	private String eid;
	
	private Account account;
	
	
	
	
	public void setAccount(Account account) {
		this.account = account;
	}


	public void setEid(String eid) {
		System.out.println("SETTER CALLED...");
		this.eid = eid;
	}
	
	
	
	
public Employee(String eid, Account account) {
		super();
		System.out.println("EMPLOYEE BEAN INSTANTIATION PC......");

		this.eid = eid;
		this.account = account;
	}


//	public Employee(String eid) {
//		super();
//		System.out.println("EMPLOYEE BEAN INSTANTIATION PC......");
//		this.eid = eid;
//	}

	public Employee() {
		System.out.println("EMPLOYEE BEAN INSTANTIATION...");
	}
	
	public void test() {
		
		System.out.println("EMPLOYEE BEAN USING... " + eid );
	}
	
//	public static Employee getObj() {
//		Employee employee = new Employee();
//		employee.setEid(UUID.randomUUID().toString());
//		
//		return employee;
//	}

}
