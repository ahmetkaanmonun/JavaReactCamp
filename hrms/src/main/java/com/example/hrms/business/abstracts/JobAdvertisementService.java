package com.example.hrms.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	

	DataResult<List<JobAdvertisement>> getByIsActive();
	

	DataResult<List<JobAdvertisement>> getByIsActiveAndPostingDate(String postingDate,Sort sort);
	
	
	DataResult<List<JobAdvertisement>> getByIsActiveAndEmployerId(int employerId);
	
	Result add(JobAdvertisement jobAdvertisement);
	
	Result update(JobAdvertisement jobAdvertisement);
	
	Result delete(JobAdvertisement jobAdvertisement);

}
