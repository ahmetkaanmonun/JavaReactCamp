package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmailService;
import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.business.concretes.helpers.EmployeeCheckHelper;
import com.example.hrms.business.concretes.helpers.EmployerCheckHelper;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.dataAccess.abstracts.EmployerDao;
import com.example.hrms.entities.concretes.Employer;
import com.example.hrms.entities.concretes.JobSeekers;

@Service

public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	private EmailService emailService;
	
	@Autowired
    public EmployerManager(EmployerDao employerDao, EmailService emailService) {
        this.employerDao = employerDao;
        this.emailService = emailService;
    }
	

	@Override
	public Result add(Employer employer) {
		
		var checkEmail = this.findByEmailIs(employer.getEmail()).getData().size() != 0;
        var checkFields = !EmployerCheckHelper.allFieldsAreRequired(employer);
        var staffConfirm = !EmployeeCheckHelper.confirmEmployer(employer);

        if (checkEmail || checkFields || staffConfirm) {

            String errorMessage = "";

            if (checkEmail) {
                errorMessage += "Email already exists. ";
            }

            if (checkFields) {
                errorMessage += "All fields are required. ";
            }

            if (staffConfirm){
                errorMessage += "Your registration confirmation operation refused by our Employee.";
            }

            return new ErrorResult(errorMessage);
        }

        this.employerDao.save(employer);
        return new SuccessResult(this.emailService.sendEmail(employer).getMessage());
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		 return new SuccessDataResult<>(this.employerDao.findAll());
	}

	@Override
	public DataResult<List<Employer>> findByEmailIs(String email) {
		
		return new SuccessDataResult<>(this.employerDao.findByEmailIs(email));
	}

	
	
	
	
}
