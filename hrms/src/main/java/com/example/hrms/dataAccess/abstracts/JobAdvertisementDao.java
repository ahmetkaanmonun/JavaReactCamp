package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	
	@Query("From JobAdvertisement where isActive=true")
	List<JobAdvertisement> getByIsActive();
	
	@Query("From JobAdvertisement where isActive=true and postingDate=:postingDate")
	List<JobAdvertisement> getByIsActiveAndPostingDate(String postingDate,Sort sort);
	
	@Query("From JobAdvertisement where isActive=true and employerId=:employerId")
	List<JobAdvertisement> getByIsActiveAndEmployerId(int employerId);
	
	

}
