package com.example.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.Employee;
import com.example.demo.repo.Crud;

@Service
public class MyService {
	
	
	@Autowired
	private Crud crud;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public String insertData(EmployeeDTO employeeDTO) {
		
		Employee entity = modelMapper.map(employeeDTO, Employee.class);
		entity.setUcode(employeeDTO.getId()+1000);
		crud.save(entity);
		return "SUCCESSFULLY SAVED...";
	}
	
	
//	Read
	public List<Employee> read() {
		return crud.findAll();
	}
	
	
//	Delete
	public String delete(int id) {
		
		crud.deleteById(id);
		return "DELETED...";
	}

}
