package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String address;
	private int salary;
	private LocalDate date;
	private int ucode; // Application Generated

}
