package com.example.springboot.service;

import java.util.List;

import com.example.springboot.entity.FamilyMenbers;

public interface FamilyMenbersService {
	
	FamilyMenbers saveFamilyMenbers(FamilyMenbers families);
	
	FamilyMenbers updateFamilyMenbers(FamilyMenbers families);
	
	List<FamilyMenbers> getAllFamilyMenbers();
	
	FamilyMenbers getFamilyMenbers(int familyMenberId);
	
	void deleteFamilyMenbers(int familyMenberId);

}
