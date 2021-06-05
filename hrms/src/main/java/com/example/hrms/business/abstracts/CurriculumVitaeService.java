package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeService {
	

	DataResult<List<CurriculumVitae>> getAll();
	
	DataResult<List<CurriculumVitae>> getByJobSeekersId(int jobseeker_id);
	
	Result add(CurriculumVitae curriculumVitae);

}
