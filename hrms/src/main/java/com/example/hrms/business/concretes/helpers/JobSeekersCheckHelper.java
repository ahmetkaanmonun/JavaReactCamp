package com.example.hrms.business.concretes.helpers;

import com.example.hrms.entities.concretes.JobSeekers;
import com.example.hrms.entities.concretes.DTOs.JobSeekersForRegisterDto;

public class JobSeekersCheckHelper {
	
	public static boolean allFieldsAreRequired(JobSeekersForRegisterDto jobSeekers){
        if (jobSeekers.getEmail().strip().isEmpty()
                || jobSeekers.getPassword().strip().isEmpty()
                || jobSeekers.getFirstName().strip().isEmpty()
                || jobSeekers.getLastName().strip().isEmpty()
                || jobSeekers.getNationalityId().strip().isEmpty()
                || jobSeekers.getBirthYear().toString().strip().isEmpty())
        {
            return false;
        }
        return true;
    }

}
