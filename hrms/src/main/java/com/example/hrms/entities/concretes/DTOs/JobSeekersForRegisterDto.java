package com.example.hrms.entities.concretes.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekersForRegisterDto {
	
	private String firstName;
	private String lastName;
	private String nationalityId;
	private String birthYear;
	private String email;
	private String password;

}
