package com.bridgelab.employeepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class EmployeeDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2}$", message = "Name is not valid.")
	@NotEmpty
	private String name;
	
	@Min(value = 500, message = "Salary must be greater than 500.")
	private double salary;

}
