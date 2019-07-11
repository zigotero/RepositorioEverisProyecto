package com.example.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dao.FamilyMenbersDao;
import com.example.springboot.entity.FamilyMenbers;
import com.example.springboot.service.FamilyMenbersService;

@Service
public class FamilyMenbersServiceImpl implements FamilyMenbersService {

	@Autowired
	private FamilyMenbersDao familyMenberDao;
	
	
	@Override
	public FamilyMenbers saveFamilyMenbers(FamilyMenbers families) {
		// TODO Auto-generated method stub
		return familyMenberDao.save(families);
	}

	@Override
	public FamilyMenbers updateFamilyMenbers(FamilyMenbers families) {
		// TODO Auto-generated method stub
		return familyMenberDao.saveAndFlush(families);
	}

	@Override
	public List<FamilyMenbers> getAllFamilyMenbers() {
		// TODO Auto-generated method stub
		return familyMenberDao.findAll();
	}

	@Override
	public FamilyMenbers getFamilyMenbers(int familyMenberId) {
		// TODO Auto-generated method stub
		return familyMenberDao.findById(familyMenberId).get();
	}

	@Override
	public void deleteFamilyMenbers(int familyMenberId) {
		// TODO Auto-generated method stub
		familyMenberDao.deleteById(familyMenberId);
		
	}

}
