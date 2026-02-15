package com.example.demo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EmployeeDTO {
	
	
//    @NotBlank(message = "Name must not be blank")
    @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters")
    @Pattern(
        regexp = "^[A-Za-z]+(\\s[A-Za-z]+)?$",
        message = "Name must contain only alphabets and only one space allowed"
    )
    private String name;

//    @NotBlank(message = "Address must not be blank")
    @Size(min = 5, max = 100, message = "Address must be between 5 and 100 characters")
    private String address;

//    @NotBlank(message = "Salary is required")
    @Positive(message = "Salary must be greater than zero")
    private Integer salary;


}
