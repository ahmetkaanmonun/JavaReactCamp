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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class Employer{
	
	public Employer(int employerId,String companyName,String webSite,boolean isValid) {
		
		this.employerId = employerId;
		this.companyName = companyName;
		this.webSite = webSite;
		this.isValid = isValid;
	}
	
	
	@Id
	@Column(name = "employer_id")
	private int employerId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "website")
	private String webSite;
	
	@Column(name = "is_valid")
	private boolean isValid;
	
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisement;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="employer_id",referencedColumnName = "id")
	private User user;
	
	
}
