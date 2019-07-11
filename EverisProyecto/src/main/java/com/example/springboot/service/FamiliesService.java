package com.example.springboot.service;

import java.util.List;

import com.example.springboot.entity.Families;


public interface FamiliesService {
	
	Families saveFamilies(Families families);
	
	Families updateFamilies(Families families);
	
	List<Families> getAllFamilies();
	
	Families getFamilies(int familiesId);//obtiene un empleadao en particular por su id
	
	void deleteFamilies(int familiesId);

}
