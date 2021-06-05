package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.CurriculumVitaeService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.CurriculumVitae;

@RestController
@RequestMapping(name = "/api/curriculum_vitaes/")
public class CurriculumVitaesController {
	
	
	private CurriculumVitaeService curriculumVitaeService;

	public CurriculumVitaesController(CurriculumVitaeService curriculumVitaeService) {
		super();
		this.curriculumVitaeService = curriculumVitaeService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<CurriculumVitae>> getAll(){
		
		
		return this.curriculumVitaeService.getAll();
		
	}
	@GetMapping("/getByJobSeekersId")
	public DataResult<List<CurriculumVitae>> getByJobSeekersId(int jobseekers_id){
		
		
		return this.curriculumVitaeService.getByJobSeekersId(jobseekers_id);
		
	}
	@PostMapping("add")
	public Result add(CurriculumVitae curriculumVitae) {
		
		return this.curriculumVitaeService.add(curriculumVitae);
		
		
	}

}
