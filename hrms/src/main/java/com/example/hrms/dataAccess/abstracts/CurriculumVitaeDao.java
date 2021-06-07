package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae,Integer>{
	
	
	
	List<CurriculumVitae>getByJobSeekersCurriculumVitae(int jobseeker_id);

}
