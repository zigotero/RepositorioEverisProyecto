package com.example.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.entity.FamilyMenbers;

@Repository
public interface FamilyMenbersDao extends JpaRepository<FamilyMenbers, Integer> {

}
