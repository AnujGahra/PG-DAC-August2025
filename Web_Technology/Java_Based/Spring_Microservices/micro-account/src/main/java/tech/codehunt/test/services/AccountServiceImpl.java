package tech.codehunt.test.services;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import feign.FeignException;
import tech.codehunt.test.dto.AccountDto;
import tech.codehunt.test.dto.external.EmployeeResponse;
import tech.codehunt.test.entities.Account;
import tech.codehunt.test.exceptions.DuplicateResourceException;
import tech.codehunt.test.exceptions.ResourceNotFoundException;
import tech.codehunt.test.exceptions.external.EmployeeServiceException;
import tech.codehunt.test.external.client.EmployeeClient;
import tech.codehunt.test.payload.ApiResponse;
import tech.codehunt.test.repositories.AccountRepoe;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepoe accountRepoe;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private RestTemplate restTemplate;  // it is a imprative method(How to do).
	
	
	@Autowired
	private EmployeeClient employeeClient;

	@Override
	public ApiResponse<Account> saveAccount(AccountDto accountDto) {

//		check if account number is already exists
		if (accountRepoe.findByAccNo(accountDto.getAccNo()).isPresent()) {
			throw new DuplicateResourceException("Account No Already Exist: " + accountDto.getAccNo());
		}
		
//	check if employee id is not present or not
		try {
			employeeClient.getSingleEmployee(accountDto.getEmployeeId());

		} catch(FeignException e) {
			HttpStatus httpStatus = HttpStatus.resolve(e.status());
			if(httpStatus == null) {
				httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			}
			
			
			String message;
			
			if(httpStatus == httpStatus.BAD_REQUEST) {
				message = "Employee not found with id" + accountDto.getEmployeeId();
			} else {
				message = "Error while communicating with Employee Service";
			}
			
			
			throw new EmployeeServiceException(message, httpStatus, e);

		}
		
//		Stop default exception handling behaviour using RestTemplate
//		new DefaultResponseErrorHandler();
//		restTemplate.setErrorHandler(new DefaultResponseErrorHandler() {
//			@Override
//			public boolean hasError(ClientHttpResponse response) throws IOException {
//				
//				return false;
//			}
//		});
//		
//		
//
////		check if employee id is not present
//		ResponseEntity<ApiResponse<EmployeeResponse>> response = restTemplate.exchange(
//				"http://localhost:8081/api/employees/" + accountDto.getEmployeeId(), HttpMethod.GET, null, // Null
//																											// Because
//																											// This Req
//																											// is Not
//																											// present
//				new ParameterizedTypeReference<ApiResponse<EmployeeResponse>>() {
//				});
//
//		ApiResponse<EmployeeResponse> employeeApiResponse = response.getBody();
//
//		if (employeeApiResponse == null || !"SUCCESS".equalsIgnoreCase(employeeApiResponse.getStatus())
//				|| employeeApiResponse.getData() == null) {
//			throw new ResourceNotFoundException("Employee not found with this id: " + accountDto.getEmployeeId());
//		}  
		
		
		

		Account account = modelMapper.map(accountDto, Account.class);
		account.setId(UUID.randomUUID().toString());
		account.setDatetime(LocalDateTime.now().toString());
		Account savedAccount = accountRepoe.save(account);

		return new ApiResponse<>("SUCCESS", "ACCOUNT DATA CREATED", savedAccount);
	}

	@Override
	public ApiResponse<List<Account>> getAllAccount() {

		List<Account> allAccounts = accountRepoe.findAll();

		if (allAccounts.isEmpty()) {
			return new ApiResponse<List<Account>>("SUCCESS", "ACCOUNT DATA NOT FOUND", allAccounts);
		}
		return new ApiResponse<List<Account>>("SUCCESS", "ACCOUNT DATA FOUND", allAccounts);
	}

	@Override
	public ApiResponse<Account> getSingleAccount(String id) {

		Account singleAccount = accountRepoe.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("ACCOUNT NOT FOUND WITH ID: " + id));

		return new ApiResponse<>("SUCCESS", "SINGLE ACCOUNT DATA FOUND", singleAccount);
	}

}
