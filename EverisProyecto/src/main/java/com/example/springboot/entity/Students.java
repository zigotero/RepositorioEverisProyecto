package com.example.springboot.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity()
@Table(name = "students")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="students_id")
	private int studenstId; 
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String MiddleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "other_student_deteails")
	private String otherStudentDeteails;
	
	@Column(name = "date_of_birth")
	@JsonFormat(pattern = "YYYY-MM-dd")
	private Date dateOfBirth;
	
	//relationships
	
	
	@ManyToMany(mappedBy = "studentsReferences", fetch = FetchType.LAZY)
	
	private List<Parents>parentsRefrences;
	
	@OneToMany(mappedBy = "studentIdReferences", fetch = FetchType.LAZY, orphanRemoval = true)
	private List<FamilyMenbers> familyMenbersRefrences;
	
	
	
	//getter and setter

	public int getStudenstId() {
		return studenstId;
	}

	public void setStudenstId(int studenstId) {
		this.studenstId = studenstId;
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

	public String getOtherStudentDeteails() {
		return otherStudentDeteails;
	}

	public void setOtherStudentDeteails(String otherStudentDeteails) {
		this.otherStudentDeteails = otherStudentDeteails;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Parents> getParentsRefrences() {
		return parentsRefrences;
	}

	public void setParentsRefrences(List<Parents> parentsRefrences) {
		this.parentsRefrences = parentsRefrences;
	}

	public List<FamilyMenbers> getFamilyMenbersRefrences() {
		return familyMenbersRefrences;
	}

	public void setFamilyMenbersRefrences(List<FamilyMenbers> familyMenbersRefrences) {
		this.familyMenbersRefrences = familyMenbersRefrences;
	}
	
	

	

	
	
	
	
	

}
