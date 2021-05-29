package com.example.hrms.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmailService;
import com.example.hrms.business.abstracts.JobSeekersService;
import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.business.concretes.helpers.JobSeekersCheckHelper;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.ErrorDataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.core.utilities.services.UserCheckService;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.JobSeekersDao;
import com.example.hrms.entities.concretes.Employer;
import com.example.hrms.entities.concretes.JobSeekers;
import com.example.hrms.entities.concretes.User;
import com.example.hrms.entities.concretes.DTOs.JobSeekersForRegisterDto;

@Service
public class JobSeekersManager implements JobSeekersService{
	
	 private final JobSeekersDao jobSeekersDao;
	    private final UserCheckService userCheckService;
	    private final EmailService emailService;
	    private UserService userService;
	    
	    @Autowired
	    public JobSeekersManager(JobSeekersDao jobSeekersDao, UserCheckService userCheckService, EmailService emailService,UserService userService) {
	        this.jobSeekersDao = jobSeekersDao;
	        this.userCheckService = userCheckService;
	        this.emailService = emailService;
	        this.userService = userService;
	    }	    

	@Override
	public DataResult<List<JobSeekers>> getAll() {
		
		return new SuccessDataResult<>(this.jobSeekersDao.findAll());
	}

	@Override
	public DataResult<List<JobSeekers>> findByEmailIs(String email) {
		
		 return new SuccessDataResult<>(this.jobSeekersDao.findByUser_EmailIs(email));
	}

	@Override
	public DataResult<List<JobSeekers>> findByNationalityIdIs(String nationalityId) {
		
		return new SuccessDataResult<>(this.jobSeekersDao.findByNationalityIdIs(nationalityId));
	}

	@Override
	public DataResult<Boolean> checkIfRealPerson(String nationalityId, String firstName, String lastName,
			String birthYear) {
		
		 return new DataResult<>(this.userCheckService.checkIfRealPerson(nationalityId, firstName, lastName,birthYear), true);
	}

	@Override
	public Result add(JobSeekersForRegisterDto jobSeekers) {
		
		var checkEmail = this.findByEmailIs(jobSeekers.getEmail()).getData().size() != 0;
        var checkIdentityNumber = this.findByNationalityIdIs(jobSeekers.getNationalityId()).getData().size() != 0;
        var checkUserRealOrNot = !this.checkIfRealPerson(jobSeekers.getNationalityId(), jobSeekers.getFirstName(), jobSeekers.getLastName(), jobSeekers.getBirthYear()).getData();
        var checkFields = !JobSeekersCheckHelper.allFieldsAreRequired(jobSeekers);

        if (checkEmail || checkIdentityNumber || checkUserRealOrNot || checkFields) {

            String errorMessage = "";

            if (checkEmail || checkIdentityNumber){
                errorMessage += "Email or Identity Number already exists. ";
            }
            if (checkUserRealOrNot) {
                errorMessage += "Not a real person. ";
            }
            if (checkFields) {
                errorMessage += "All fields are required.";
            }

            return new ErrorResult(errorMessage);
        }

        User user = new User(jobSeekers.getEmail(),jobSeekers.getPassword());
        userService.add(user);
        JobSeekers jobSeekers1 = new JobSeekers(jobSeekers.getFirstName(),jobSeekers.getLastName(),jobSeekers.getNationalityId(),jobSeekers.getBirthYear());
        
        this.jobSeekersDao.save(jobSeekers1);
        return new SuccessResult(this.emailService.sendEmail(user).getMessage());
        
	}
	

	
	
	
	

	
	

	
	
	
	
	

}

