package com.example.springboot.entity;


import java.util.ArrayList;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;


@Data
@Entity
@Table(name="parents")
public class Parents {
	
	
	@Id
	@Column(name="parents_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int parentsId;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String MiddleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "other_parent_details")
	private String otherParentDetails;
	

	
		
	//relationships
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JsonBackReference
	@JoinTable(name = "student_parents",
			joinColumns = @JoinColumn(name = "parents_id"),
			inverseJoinColumns = @JoinColumn(name = "students_id") )
	//private List<Students>studentsReferences = new ArrayList<Students>();
	private Set<Students>studentsReferences;
	
	@OneToMany(mappedBy = "parentReferences",fetch = FetchType.LAZY)
	private List<FamilyMenbers> familyMenbersRefrences;
	
	@ManyToOne()
	@JoinColumn(name = "family_id")
	private Families familyReferences;

	
	/*
	public int getParentsId() {
		return parentsId;
	}

	public void setParentsId(int parentsId) {
		this.parentsId = parentsId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOtherParentDetails() {
		return otherParentDetails;
	}

	public void setOtherParentDetails(String otherParentDetails) {
		this.otherParentDetails = otherParentDetails;
	}

	public List<Students> getStudentsReferences() {
		return studentsReferences;
	}

	public void setStudentsReferences(List<Students> studentsReferences) {
		this.studentsReferences = studentsReferences;
	}

	public List<FamilyMenbers> getFamilyMenbersRefrences() {
		return familyMenbersRefrences;
	}

	public void setFamilyMenbersRefrences(List<FamilyMenbers> familyMenbersRefrences) {
		this.familyMenbersRefrences = familyMenbersRefrences;
	}

	public Families getFamilyReferences() {
		return familyReferences;
	}

	public void setFamilyReferences(Families familyReferences) {
		this.familyReferences = familyReferences;
	}
	
	
	*/
	



	

	

	
	
	
	
	
	

	
}
