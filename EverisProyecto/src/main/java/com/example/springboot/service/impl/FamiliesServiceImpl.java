package com.example.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dao.FamiliesDao;
import com.example.springboot.entity.Families;
import com.example.springboot.service.FamiliesService;

@Service
public class FamiliesServiceImpl implements FamiliesService {

	@Autowired
	private FamiliesDao familiesDao;
	
	@Override
	public Families saveFamilies(Families families) {
		// TODO Auto-generated method stub
		return familiesDao.save(families);
	}

	@Override
	public Families updateFamilies(Families families) {
		// TODO Auto-generated method stub
		return familiesDao.saveAndFlush(families);
	}

	@Override
	public List<Families> getAllFamilies() {
		// TODO Auto-generated method stub
		return familiesDao.findAll();
	}

	@Override
	public Families getFamilies(int familiesId) {
		// TODO Auto-generated method stub
		return familiesDao.findById(familiesId).get();
	}

	@Override
	public void deleteFamilies(int familiesId) {
		// TODO Auto-generated method stub
		familiesDao.deleteById(familiesId);
	}

}
