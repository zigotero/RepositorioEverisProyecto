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

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
@Table(name="familymenbers")
public class FamilyMenbers {
	
	//camps
	@Id
	@Column(name="family_menber_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int familyMenberId;
	
	@Column(name = "parent_of_student_menber")
	private String parentOfStudentMenber;
	
	
	//relationships
	

	//is recommended not to use cascadetype.all
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="students_id")
	@JsonBackReference("familyMenbersReferencesToStudent")
	private Students familyMenbersReferencesToStudent;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="parents_id")
	@JsonBackReference("familyMenberReferencesToParents")
	private Parents familyMenberReferencesToParents;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "family_id")
	@JsonBackReference("familyMenberReferencesToFamily")
	private Families familyMenberReferencesToFamily;

	
	
	
	


	

	
	
	
	

	
	
	
}
