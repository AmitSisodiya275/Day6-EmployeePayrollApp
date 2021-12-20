package com.bridgelab.employeepayrollapp.exceptions;

public class EmployeePayrollException extends RuntimeException {

	private String message;

	public EmployeePayrollException(String message) {
		super(message);
	}
}
