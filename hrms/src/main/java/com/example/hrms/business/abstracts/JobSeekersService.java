package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.JobSeekers;

public interface JobSeekersService {
	
	DataResult<List<JobSeekers>> getAll();
	DataResult<List<JobSeekers>> findByEmailIs(String email);
	DataResult<List<JobSeekers>> findByNationalityIdIs(String nationalityId);
	
	DataResult<Boolean> checkIfRealPerson(String nationalityId,String firstName,String lastName,String birthYear);
	
	
	Result add(JobSeekers jobSeekers);

}
