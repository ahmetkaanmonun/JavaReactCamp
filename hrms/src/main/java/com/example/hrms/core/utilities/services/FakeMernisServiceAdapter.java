package com.example.hrms.core.utilities.services;

import org.springframework.stereotype.Service;

@Service
public class FakeMernisServiceAdapter implements UserCheckService{

	@Override
	public Boolean checkIfRealPerson(String nationalityId, String firstName, String lastName, String birthYear) {
		
		return true;
	}

}
