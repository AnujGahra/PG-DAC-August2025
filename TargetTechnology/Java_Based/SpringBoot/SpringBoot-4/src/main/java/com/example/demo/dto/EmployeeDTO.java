package com.example.demo.dto;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
	
	
	@Min(value = 10, message = "Id must be greater than 0")
    @Max(value = 9999, message = "Id must be less than 10000")
    private int id;

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    @NotBlank(message = "Name Cannot Be Blank")
    @NotEmpty(message = "Name Cannto Be Empty")
    @Pattern(
    	    regexp = "^[A-Za-z]+( [A-Za-z]+)?$",
    	    message = "Name must contain only letters and one space"
    	)

    private String name;

    @NotBlank(message = "Address cannot be blank")
    private String address;

    @Min(value = 10000, message = "Salary must be at least 10000")
    private int salary;

    @PastOrPresent(message = "Date cannot be in the future")
    @NotNull(message = "Date Cannot Be Null")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate date;
    
    private String myfile;

}
