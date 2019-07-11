package com.example.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dao.ParentsDao;
import com.example.springboot.entity.Parents;
import com.example.springboot.service.ParentsService;

@Service
public class ParentsServiceImpl implements ParentsService {
	
	@Autowired
	private ParentsDao parentsDao;
	@Override
	public Parents saveParents(Parents parents) {
		// TODO Auto-generated method stub
		return parentsDao.save(parents);
	}

	@Override
	public Parents updateParents(Parents parents) {
		// TODO Auto-generated method stub
		return parentsDao.saveAndFlush(parents);
	}

	@Override
	public List<Parents> getAllParents() {
		// TODO Auto-generated method stub
		return parentsDao.findAll();
	}

	@Override
	public Parents getParents(int parentsId) {
		// TODO Auto-generated method stub
		return parentsDao.findById(parentsId).get();
	}

	@Override
	public void deleteParents(int parentsId) {
		// TODO Auto-generated method stub
		parentsDao.deleteById(parentsId);
		
	}

	@Override
	public List<Parents> getAllParentsSql() {
		// TODO Auto-generated method stub
		return parentsDao.getAllParetntsSql();
	}

}
