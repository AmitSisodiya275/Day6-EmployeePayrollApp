package com.bridgelab.employeepayrollapp.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
		List<ObjectError> allErrors = e.getBindingResult().getAllErrors();
		List<String> errorList = allErrors.stream().map(obj -> obj.getDefaultMessage()).collect(Collectors.toList());
		return new ResponseEntity<List<String>>(errorList, HttpStatus.BAD_REQUEST);
	}
}
