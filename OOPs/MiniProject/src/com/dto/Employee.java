package com.dto;

public class Employee {
	
	
	private static int companyId = 12323434;
	private final int eid;
	private String name;
	private int age;
	private int salary;
	private String address;
	
	
	public Employee(int eid, String name, int age, int salary, String address) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}


	public static void setCompanyId(int companyId) {
		Employee.companyId = companyId;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
}
