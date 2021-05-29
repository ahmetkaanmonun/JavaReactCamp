package com.example.hrms.entities.concretes.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployerForRegisterDto {
	
	
	private String employerId;

	private String companyName;
	
	private String webSite;
	
	private boolean isValid;
	
	private String email;
	
	private String password;

}
