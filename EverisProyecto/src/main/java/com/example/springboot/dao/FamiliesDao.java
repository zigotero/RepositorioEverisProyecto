package com.example.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.entity.Families;


@Repository
public interface FamiliesDao extends JpaRepository<Families, Integer>{

}
