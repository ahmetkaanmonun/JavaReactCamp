package com.example.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "schools")
@PrimaryKeyJoinColumn(name="school_id",referencedColumnName = "school_id")
public class School {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "school_id")
	private int schoolId;
	
	
	@Column(name = "school_name")
	private String schoolName;
	
	
	@Column(name = "start_date")
	private LocalDate startDate;
	
	
	@Column(name = "graduate_date")
	private LocalDate graduateDate;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "school")
	private List<CurriculumVitae> curriculumVitae;

}
