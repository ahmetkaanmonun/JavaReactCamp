package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employer;
import com.example.hrms.entities.concretes.JobSeekers;
import com.example.hrms.entities.concretes.DTOs.EmployerForRegisterDto;

public interface EmployerService {
	
	
	Result add(EmployerForRegisterDto employer);
	
	DataResult<List<Employer>> getAll();
	DataResult<List<Employer>> findByEmailIs(String email);
	
	

}
