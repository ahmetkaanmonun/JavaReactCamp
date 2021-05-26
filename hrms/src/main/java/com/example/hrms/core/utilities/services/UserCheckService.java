package com.example.hrms.core.utilities.services;

public interface UserCheckService {
	
	Boolean checkIfRealPerson(String nationalityId,String firstName,String lastName,String birthYear);
	
	

}
