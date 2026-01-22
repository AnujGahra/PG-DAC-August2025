package tech.codehunt.test.exceptions.external;

import org.springframework.http.HttpStatus;

import feign.FeignException;

public class EmployeeServiceException extends RuntimeException {
	
	
	private final HttpStatus httpStatus;

	public EmployeeServiceException(String message, HttpStatus httpStatus, FeignException e) {
		super(message, e);
		this.httpStatus = httpStatus;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
	
	
	
	

}
