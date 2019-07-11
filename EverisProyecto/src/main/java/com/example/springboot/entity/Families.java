package com.example.springboot.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name="families")
public class Families {
	
	
	// camps
	@Id
	@Column(name="families_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int familiesId;
	
	@Column(name = "family_name")
	private String familyName;
	
	
	//relationships
	
	@OneToMany(mappedBy = "parentsRefrencesToFamily" , fetch = FetchType.LAZY, orphanRemoval = true)
	@JsonIgnoreProperties("parentsRefrencesToFamily")
	private List<Parents> familyRefrencesToParents;
	
	@OneToMany(mappedBy = "familyMenberReferencesToFamily" , fetch = FetchType.LAZY)
	@JsonIgnoreProperties("familyMenberReferencesToFamily")
	private List<FamilyMenbers> familiesRefrenecesToFamilyMenbers;

	
	
	
	
	

	
	
	
	

}
