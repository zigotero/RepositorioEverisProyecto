package com.example.springboot.service;

import java.util.List;

import com.example.springboot.entity.Parents;

public interface ParentsService {
	
	
	Parents saveParents(Parents parents);
	
	Parents updateParents(Parents parents);
	
	List<Parents> getAllParents();
	
	Parents getParents(int parentsId);
	
	void deleteParents(int parentsId);

	public List<Parents> getAllParentsSql();
}
