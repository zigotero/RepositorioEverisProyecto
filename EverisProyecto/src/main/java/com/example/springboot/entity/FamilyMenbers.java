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
	@ManyToOne
	@JoinColumn(name="students_id")
	private Students studentIdReferences;
	
	@ManyToOne()
	@JoinColumn(name="parents_id")
	private Parents parentReferences;
	
	@ManyToOne
	@JoinColumn(name = "family_id")
	private Families familytReferences;

	public int getFamilyMenberId() {
		return familyMenberId;
	}

	public void setFamilyMenberId(int familyMenberId) {
		this.familyMenberId = familyMenberId;
	}

	public String getParentOfStudentMenber() {
		return parentOfStudentMenber;
	}

	public void setParentOfStudentMenber(String parentOfStudentMenber) {
		this.parentOfStudentMenber = parentOfStudentMenber;
	}

	public Students getStudentIdReferences() {
		return studentIdReferences;
	}

	public void setStudentIdReferences(Students studentIdReferences) {
		this.studentIdReferences = studentIdReferences;
	}

	public Parents getParentReferences() {
		return parentReferences;
	}

	public void setParentReferences(Parents parentReferences) {
		this.parentReferences = parentReferences;
	}

	public Families getFamilytReferences() {
		return familytReferences;
	}

	public void setFamilytReferences(Families familytReferences) {
		this.familytReferences = familytReferences;
	}

	
	
	
	


	

	
	
	
	

	
	
	
}
