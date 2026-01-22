package tech.codehunt.test.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlotDto {
	
	
	
	@NotBlank(message = "Area cannot be empty or blank")
	@Size(min = 2, max = 30, message = "Area must be between 2 to 30 chars")
	private String area;

	@NotBlank(message = "coloney Name cannot be empty or blank")
	@Size(min = 2, max = 100, message = "Coloney Name must be between 2 to 100 chars")
	private String coloneyName;

	@NotBlank(message = "City Name cannot be empty or blank")
	@Size(min = 2, max = 100, message = "City Name must be between 2 to 100 chars")
	private String cityName;

	@Min(value = 100000, message = "Pincode must be at exactly 6 digit")
	@Max(value = 999999, message = "Pincode must be at exactly 6 digit")
	private int pincode;

	@NotBlank(message = "Employee ID cannot be empty or blank")
	private String employeeId;


}
