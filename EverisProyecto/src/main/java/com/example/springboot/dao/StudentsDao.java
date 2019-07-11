package com.example.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.entity.Parents;
import com.example.springboot.entity.Students;

@Repository
public interface StudentsDao  extends JpaRepository<Students, Integer>{

	

}
