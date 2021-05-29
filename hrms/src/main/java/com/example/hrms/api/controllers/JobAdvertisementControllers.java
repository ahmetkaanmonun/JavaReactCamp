package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobAdvertisementService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/job_advertisements/")
public class JobAdvertisementControllers {
	
	private JobAdvertisementService JobAdvertisementService;
	
	@Autowired
	public JobAdvertisementControllers(
			com.example.hrms.business.abstracts.JobAdvertisementService jobAdvertisementService) {
		super();
		JobAdvertisementService = jobAdvertisementService;
	}
	
	
	@GetMapping("getByIsActive")
	public DataResult<List<JobAdvertisement>> getByIsActive(){
		
		
		
		return this.JobAdvertisementService.getByIsActive();
	}
	@GetMapping("getByIsActiveAndPostingDate")
	public DataResult<List<JobAdvertisement>> getByIsActiveAndPostingDate(String postingDate,Sort sort){
		
		
		
		return this.JobAdvertisementService.getByIsActiveAndPostingDate(postingDate, sort);
	}
	@GetMapping("getByIsActiveAndEmployerId")
	public DataResult<List<JobAdvertisement>> getByIsActiveAndEmployerId(int employerId){
		
		
		
		return this.JobAdvertisementService.getByIsActiveAndEmployerId(employerId);
	}

	@PostMapping("add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		
		
		
		return this.JobAdvertisementService.add(jobAdvertisement);
		
	}
	@PutMapping("update")
	public Result update(@RequestBody JobAdvertisement jobAdvertisement) {
		
		
		
		return this.JobAdvertisementService.update(jobAdvertisement);
		
	}
	@DeleteMapping("delete")
	public Result delete(@RequestBody JobAdvertisement jobAdvertisement) {
		
		
		
		return this.JobAdvertisementService.add(jobAdvertisement);
		
	}
	

}
