package com.example.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springboot.entity.Parents;

@Repository
public interface ParentsDao extends JpaRepository<Parents, Integer> {
	
	@Query("select p from Parents p")
	public List<Parents>getAllParetntsSql();

}
