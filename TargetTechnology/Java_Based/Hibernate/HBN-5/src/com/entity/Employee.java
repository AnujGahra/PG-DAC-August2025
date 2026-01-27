package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "xemployee") // optional
@NamedQuery(name = "deleteJPQL", query = "delete from Employee where eid<=:id")
@NamedNativeQuery(name = "deleteSQL", query = "delete from xemployee where id<=:id")
public class Employee {
	
	@Id
	@Column(name = "Id")
	private int eid;
	
	@Column(name = "Name", length = 30)
	private String ename;
	
	@Column(name = "Address", length = 100)
	private String eaddress;
	
	@Column(name = "Salary")
	private int esalary;
	
	
	public Employee() {
		
	}
	
	
	public Employee(int eid, String ename, String eaddress, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.esalary = esalary;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEaddress() {
		return eaddress;
	}


	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}


	public int getEsalary() {
		return esalary;
	}


	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", esalary=" + esalary + "]";
	}
	
	
	
	
	

}
