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
@Table(name = "workplaces")
@PrimaryKeyJoinColumn(name="workplace_id",referencedColumnName = "workplace_id")
public class Workplace {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "workplace_id")
	private int workplaceId;
	
	@Column(name = "workplace_name")
	private String workplaceName;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "start_date")
	private LocalDate startDate;
	
	@Column(name = "depart_date")
	private LocalDate departDate;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "workplace")
	private List<CurriculumVitae> curriculumVitae;
	
}
