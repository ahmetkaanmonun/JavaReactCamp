package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data @Entity 
@Table(name = "jobs")
public class Job {
	
	
	
	@Id @Column(name = "id") @GeneratedValue
	private int id;
	
	
	@Column(name = "job_title") 
	private String job;
	
	public Job() {
		
		
		
	}


	public Job(int id, String job) {
		super();
		this.id = id;
		this.job = job;
	}
	
	
	

}
