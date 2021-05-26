package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer> {
	
	 List<Job> findByJobIs(String job);

}
