package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User{
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "website")
	private String webSite;
	
	@Column(name = "is_valid")
	private boolean isValid;
	
	
	

}
