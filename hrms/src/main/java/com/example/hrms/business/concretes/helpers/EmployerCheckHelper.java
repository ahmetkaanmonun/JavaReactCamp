package com.example.hrms.business.concretes.helpers;

import com.example.hrms.entities.concretes.Employer;

public class EmployerCheckHelper {
	
	public static boolean allFieldsAreRequired(Employer employer){
        if (employer.getEmail().strip().isEmpty()
                || employer.getPassword().strip().isEmpty()
                || employer.getCompanyName().strip().isEmpty()
                || employer.getWebSite().strip().isEmpty())
        {
            return false;
        }
        return true;
    }

}
