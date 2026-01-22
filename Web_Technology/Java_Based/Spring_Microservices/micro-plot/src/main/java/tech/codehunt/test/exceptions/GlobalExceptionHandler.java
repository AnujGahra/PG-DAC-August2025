package tech.codehunt.test.exceptions;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import tech.codehunt.test.payload.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiResponse<Map<Object, Object>>> handleGenericException(Exception exception) {

		ApiResponse<Map<Object, Object>> apiResponse = new ApiResponse<>("ERROR", exception.getMessage(),
				Collections.emptyMap());

		return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ApiResponse<Map<String, String>>> handleValidationException(
			MethodArgumentNotValidException exception) {

		Map<String, String> errors = new HashMap<>();

		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
		for (FieldError fr : fieldErrors) {
			errors.put(fr.getField(), fr.getDefaultMessage());
		}

		ApiResponse<Map<String, String>> apiResponse = new ApiResponse<>("ERROR", "VALIDATION FAILED", errors);

		return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse<Map<Object, Object>>> handleResourceNotFoundException(
			ResourceNotFoundException exception) {

		ApiResponse<Map<Object, Object>> apiResponse = new ApiResponse<>("ERROR", exception.getMessage(),
				Collections.emptyMap());
		return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);

	}

}
