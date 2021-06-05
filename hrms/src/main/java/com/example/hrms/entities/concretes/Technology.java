package com.example.hrms.entities.concretes;

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
@Table(name = "technologies")
@PrimaryKeyJoinColumn(name="technology_id",referencedColumnName = "technology_id")
public class Technology {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "technology_id")
	private int technologyId;
	
	@Column(name = "technology_name")
	private String technologyName;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "technology")
	private List<CurriculumVitae> curriculumVitae;
}
