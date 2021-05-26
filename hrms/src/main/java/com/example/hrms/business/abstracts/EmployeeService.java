package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.Employee;
import com.example.hrms.entities.concretes.Employer;

public interface EmployeeService {
	
	DataResult<List<Employee>> getAll();
	
	DataResult<Boolean> confirmEmployer(Employee employee,Employer employer);

}
