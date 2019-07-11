package com.example.springboot.service;

import java.util.List;

import com.example.springboot.entity.Parents;
import com.example.springboot.entity.Students;

public interface StudentsService {

	
	Students saveStudents(Students students);
	
	Students updateStudents(Students students);
	
	List<Students> getAllStudents();
	
	Students getStudents(int studentsId);
	
	void deleteStudents(int studentsId);
}
