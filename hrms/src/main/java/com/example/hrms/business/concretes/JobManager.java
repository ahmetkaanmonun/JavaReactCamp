package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.dataAccess.abstracts.JobDao;
import com.example.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService{
	
private final JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		this.jobDao = jobDao;
	}

	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<>(this.jobDao.findAll());
	}

	@Override
	public DataResult<List<Job>> findByJobIs(String job) {
		return new SuccessDataResult<>(this.jobDao.findByJobIs(job));
	}

	@Override
	public Result add(Job job) {
		if (this.findByJobIs(job.getJob()).getData().size() != 0){
			return new ErrorResult("This job position already exists");
		}

		this.jobDao.save(job);
		return new SuccessResult("Process succeeded");
	}

}
