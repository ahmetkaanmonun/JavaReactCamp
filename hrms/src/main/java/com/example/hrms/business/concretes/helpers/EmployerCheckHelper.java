package com.example.hrms.business.concretes.helpers;

import com.example.hrms.entities.concretes.Employer;
import com.example.hrms.entities.concretes.DTOs.EmployerForRegisterDto;

public class EmployerCheckHelper {
	
	public static boolean allFieldsAreRequired(EmployerForRegisterDto employer){
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
