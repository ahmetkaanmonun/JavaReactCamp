package com.example.hrms.business.concretes.helpers;

import com.example.hrms.entities.concretes.JobSeekers;

public class JobSeekersCheckHelper {
	
	public static boolean allFieldsAreRequired(JobSeekers jobSeekers){
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
