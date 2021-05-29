package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.hrms.entities.concretes.JobSeekers;

public interface JobSeekersDao  extends JpaRepository<JobSeekers, Integer>{
	
	List<JobSeekers> findByUser_EmailIs(String email);
	List<JobSeekers> findByNationalityIdIs(String nationalityId);

	
}
