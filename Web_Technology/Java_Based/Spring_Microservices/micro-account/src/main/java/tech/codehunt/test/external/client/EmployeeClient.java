package tech.codehunt.test.external.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import tech.codehunt.test.dto.external.EmployeeResponse;
import tech.codehunt.test.payload.ApiResponse;

//@FeignClient(
//		name = "micro-employee",
//		url = "http://localhost:8081/api/employees/"
//		)  

@FeignClient(name = "MICRO-EMPLOYEE")
public interface EmployeeClient {

	
	@GetMapping("/api/employee{id}")
	public ResponseEntity<ApiResponse<EmployeeResponse>> getSingleEmployee(@PathVariable String id);
}
