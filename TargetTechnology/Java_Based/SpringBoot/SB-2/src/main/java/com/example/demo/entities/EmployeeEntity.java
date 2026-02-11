package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee1")
public class EmployeeEntity {
	
	
	@Id
	private int eid;
	private String ename;
	private String eaddress;
	private int esalary;

}
