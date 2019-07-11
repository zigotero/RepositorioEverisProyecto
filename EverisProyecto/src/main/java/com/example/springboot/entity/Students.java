package com.example.springboot.entity;


import java.util.Date;
import java.util.List;
import java.util.Set;

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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity()
@Data
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
	@JsonIgnoreProperties("studentsReferences")
	private List<Parents>parentsRefrences;
	
	@OneToMany(mappedBy = "familyMenbersReferencesToStudent", fetch = FetchType.LAZY, orphanRemoval = true)
	private List<FamilyMenbers> studentRefrencesToFamilyMenbers;
	
	
	
	

	

	
	
	
	
	

}
