package com.example.springboot.entity;

import java.util.List;

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

@Entity
@Table(name="families")
public class Families {
	
	
	// camps
	@Id
	@Column(name="families_id",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int familiesId;
	
	@Column(name = "family_name",nullable = false)
	private String familyName;
	
	
	//relationships
	
	@OneToMany(mappedBy = "familyReferences", cascade = CascadeType.ALL , fetch = FetchType.LAZY, orphanRemoval = true)
	private List<Parents> parentsReferences;
	
	@OneToMany(mappedBy = "familytReferences", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<FamilyMenbers> familyMenbersRefrences;

	public int getFamiliesId() {
		return familiesId;
	}

	public void setFamiliesId(int familiesId) {
		this.familiesId = familiesId;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public List<Parents> getParentsReferences() {
		return parentsReferences;
	}

	public void setParentsReferences(List<Parents> parentsReferences) {
		this.parentsReferences = parentsReferences;
	}

	public List<FamilyMenbers> getFamilyMenbersRefrences() {
		return familyMenbersRefrences;
	}

	public void setFamilyMenbersRefrences(List<FamilyMenbers> familyMenbersRefrences) {
		this.familyMenbersRefrences = familyMenbersRefrences;
	}

	
	
	
	
	

	
	
	
	

}
