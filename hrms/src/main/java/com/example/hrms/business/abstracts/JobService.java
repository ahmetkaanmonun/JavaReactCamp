package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Job;

public interface JobService {
	
	
	DataResult<List<Job>> getAll();
	DataResult<List<Job>>  findByJobIs(String job);

	Result add(Job job);
	

}
