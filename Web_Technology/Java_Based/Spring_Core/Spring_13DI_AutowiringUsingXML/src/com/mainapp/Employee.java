package com.mainapp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

    private int eid;
    private Account account;
    private Car car;
    private List<String> listOfBooks;
    
    public Employee() {
    	
    }

	public Employee(Account account, Car car, List<String> listOfBooks) {
		super();
		this.account = account;
		this.car = car;
		this.listOfBooks = listOfBooks;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public List<String> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(List<String> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", account=" + account + ", car=" + car + ", listOfBooks=" + listOfBooks + "]";
	}
    
    
}
