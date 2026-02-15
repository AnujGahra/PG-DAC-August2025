package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.EmployeeEntity;

public interface MyService {
	
	
	// CREATE
    EmployeeEntity insert(EmployeeDTO employeeDTO);

    // READ - all
    List<EmployeeEntity> getAll();

    // READ - by id
    EmployeeEntity getById(int id);

    // UPDATE
    EmployeeEntity update(int id, EmployeeDTO employeeDTO);

    // DELETE
    void deleteById(int id);

	
	
}
