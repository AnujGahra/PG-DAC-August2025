package tech.codehunt.test.services;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.Valid;

import tech.codehunt.test.dto.EmployeeDto;
import tech.codehunt.test.dto.hybrid.EmployeeFullDto;
import tech.codehunt.test.entities.Employee;
import tech.codehunt.test.payload.ApiResponse;

public interface EmployeeService {
	
	
	ApiResponse<Employee> saveEmployee(EmployeeDto employeeDto);
	
	ApiResponse<List<Employee>> getAllEmployees( );
	
	
	ApiResponse<Employee> getSingleEmployee(String id );

	ApiResponse<Employee> geFullEmployee(@Valid EmployeeFullDto employeeFullDto);
	

}

