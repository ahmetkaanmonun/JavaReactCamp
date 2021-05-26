package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
	
	
	private final JobService jobService;

	@Autowired
	public JobController(JobService jobService) {
		this.jobService = jobService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		return this.jobService.getAll();
	}

	@PostMapping("/findbypositionis")
	public DataResult<List<Job>> findByJobIs(@RequestBody String job){
		return this.jobService.findByJobIs(job.trim());
	}

	@PostMapping("/add")
	public Result add(@RequestBody Job job){
		return this.jobService.add(job);
	}
	
	

}
