package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Setter
//@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Employee")
public class EmployeeEntity {
	
	@Id
	private int eid;
	
	private String ename;
	
	private String eaddress;
	
	private int esalary;
	
	
	
}
