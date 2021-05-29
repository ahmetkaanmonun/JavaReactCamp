package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employer;
import com.example.hrms.entities.concretes.DTOs.EmployerForRegisterDto;

public class EmployerController {
	
@RestController
@RequestMapping("/api/employers/")

public class EmployersController {

	 private final EmployerService employerService;

	 	@Autowired
	    public EmployersController(EmployerService employerService) {
	        this.employerService = employerService;
	    }

	    @GetMapping("/getall")
	    public DataResult<List<Employer>> getAll(){
	        return this.employerService.getAll();
	    }

	    @PostMapping("/findbyemailis")
	    public DataResult<List<Employer>> findByEmailIs(@RequestBody String email){
	        return this.employerService.findByEmailIs(email.toLowerCase().trim());
	    }

	    @PostMapping("/add")
	    public Result add(@RequestBody EmployerForRegisterDto employer){
	        return this.employerService.add(employer);
	    }
	

}
}
