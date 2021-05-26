package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.hrms.business.abstracts.EmployeeService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.Employee;

public class EmployeesController {
	
	
	 private final EmployeeService employeeService;

	    @Autowired
	    public EmployeesController (EmployeeService employeeService) {
	        this.employeeService = employeeService;
	    }

	    @GetMapping("/getall")
	    public DataResult<List<Employee>> getAll(){
	        return this.employeeService.getAll();
	    }

}
