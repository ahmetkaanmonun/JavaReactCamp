package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Workplace;

public interface WorkplaceDao extends JpaRepository<Workplace, Integer>{

}
