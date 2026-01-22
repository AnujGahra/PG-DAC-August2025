package tech.codehunt.test.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.codehunt.test.dto.EmployeeDto;
import tech.codehunt.test.dto.hybrid.EmployeeFullDto;
import tech.codehunt.test.entities.Employee;
import tech.codehunt.test.payload.ApiResponse;
import tech.codehunt.test.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeMainController {

	@Autowired
	private EmployeeService employeeService;

//	SaveEmployee
	@PostMapping
	public ResponseEntity<ApiResponse<Employee>> saveEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
		ApiResponse<Employee> savedEmployeeResponse = employeeService.saveEmployee(employeeDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployeeResponse);
	}

//	getAllEmployee	
	@GetMapping
	public ResponseEntity<ApiResponse<List<Employee>>> getAllEmployee() {

		ApiResponse<List<Employee>> allEmployeesResponse = employeeService.getAllEmployees();
		return ResponseEntity.ok(allEmployeesResponse);
	}

//	getSingleEmployee
	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse<Employee>> getSingleEmployee(@PathVariable String id) {

		ApiResponse<Employee> singleEmployeesResponse = employeeService.getSingleEmployee(id);
		return ResponseEntity.ok(singleEmployeesResponse);
	}  
	
//	API: EmployeeFullData(EmployeeDto, AccountDto, PlotDto)
	@PostMapping("/full")
	public ResponseEntity<ApiResponse<Employee>> saveFullEmployee(@Valid @RequestBody EmployeeFullDto employeeFullDto) {

		ApiResponse<Employee> fullEmployeesResponse = employeeService.geFullEmployee(employeeFullDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(fullEmployeesResponse);
	}  
}
