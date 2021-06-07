package com.example.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "jobseekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekers{
	
	public JobSeekers(String firstName,String lastName,String nationalityId,String birthYear) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.birthYear = birthYear;
		
		
	}
	
	
	@Id
	@Column(name = "seekers_id")
	private int seekersId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "nationality_id")
	private String nationalityId;
	
	@Column(name = "birth_year")
	private String birthYear;
	
	
	
	@OneToOne(cascade=CascadeType.ALL)     
	@JoinColumn(name="seekers_id",referencedColumnName = "id")     
	private User user;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "jobSeekers")
	private List<CurriculumVitae> curriculumVitae;

}
