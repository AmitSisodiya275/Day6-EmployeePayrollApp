package com.bridgelab.employeepayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Day6EmployeePayrollApppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Day6EmployeePayrollApppApplication.class, args);
		log.info("Application Started on Environment"+context.getEnvironment().getProperty("environment"));
	}

}
