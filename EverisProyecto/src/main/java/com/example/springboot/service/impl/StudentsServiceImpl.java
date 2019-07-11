package com.example.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.dao.StudentsDao;
import com.example.springboot.entity.Students;
import com.example.springboot.service.StudentsService;

@Service
public class StudentsServiceImpl implements StudentsService {
	
	@Autowired
	private  StudentsDao studentsDao;
	
	
	
	@Override
	public Students saveStudents(Students students) {
		// TODO Auto-generated method stub
		
		return studentsDao.save(students);
	}

	@Override
	public Students updateStudents(Students students) {
		// TODO Auto-generated method stub
		return studentsDao.saveAndFlush(students);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return studentsDao.findAll();
	}

	@Override
	public Students getStudents(int studentsId) {
		// TODO Auto-generated method stub
		return studentsDao.findById(studentsId).get();
	}

	@Override
	public void deleteStudents(int studentsId) {
		// TODO Auto-generated method stub
		studentsDao.deleteById(studentsId);
	}

}
