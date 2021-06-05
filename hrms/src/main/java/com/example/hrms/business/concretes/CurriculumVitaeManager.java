package com.example.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.hrms.business.abstracts.CurriculumVitaeService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.CurriculumVitaeDao;
import com.example.hrms.entities.concretes.CurriculumVitae;

public class CurriculumVitaeManager implements CurriculumVitaeService{

	private CurriculumVitaeDao curriculumVitaeDao;
	
	@Autowired
	public CurriculumVitaeManager(CurriculumVitaeDao curriculumVitaeDao) {
		super();
		this.curriculumVitaeDao = curriculumVitaeDao;
	}

	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		
		
		return new SuccessDataResult<List<CurriculumVitae>>(this.curriculumVitaeDao.findAll());
	}

	@Override
	public DataResult<List<CurriculumVitae>> getByJobSeekersId(int jobseeker_id) {
		
		return new SuccessDataResult<List<CurriculumVitae>>(this.curriculumVitaeDao.getByJobSeekersId(jobseeker_id));
	}

	@Override
	public Result add(CurriculumVitae curriculumVitae) {
		
		this.curriculumVitaeDao.save(curriculumVitae);
		return new SuccessResult("Cv eklendi");
	}

}
