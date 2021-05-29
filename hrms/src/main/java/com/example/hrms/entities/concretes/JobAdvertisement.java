package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_advertisements")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_advertisements"})
public class JobAdvertisement {
	
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job job;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "min_wage")
	private int minWage;
	
	@Column(name = "max_wage")
	private int maxWage;
	
	@Column(name = "deadline_date")
	private String deadlineDate;
	
	@Column(name = "position_number")
	private int positionNumber;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "posting_date")
	private String postingDate;
	
	
	
	
	

}
