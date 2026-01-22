package tech.codehunt.test.dto.hybrid;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.codehunt.test.dto.EmployeeDto;
import tech.codehunt.test.dto.external.AccountDto;
import tech.codehunt.test.dto.external.PlotDto;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeFullDto {
	
	@Valid
	@NotNull
	private EmployeeDto employeeDto;
	
	@Valid
	@NotNull
	private AccountDto accountDto;
	
	@Valid
	@NotNull
	private PlotDto plotDto;
}
