package com.mainapp;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee  {
	
	
	private int eid;
	private String ename;
	private List<String> listofBooks;

	public Employee() {
		System.out.println("Emp Bean Instantiation");
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setListofBooks(List<String> listofBooks) {
		this.listofBooks = listofBooks;
	}
	
	
	
	

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public List<String> getListofBooks() {
		return listofBooks;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", listofBooks=" + listofBooks + "]";
	}
	

	
	
    
}
