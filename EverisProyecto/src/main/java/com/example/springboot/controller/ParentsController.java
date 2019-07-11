package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.Parents;
import com.example.springboot.service.ParentsService;
import com.example.springboot.service.StudentsService;

@RestController
public class ParentsController {
	
	@Autowired
	private ParentsService parentsService;
	
	
	@PostMapping("/parents/save")
	public Parents save(@RequestBody Parents parents) {
		return parentsService.saveParents(parents);
	}
	
	
	@PutMapping("/parents/update")
	public Parents update(@RequestBody Parents parents) {
		return parentsService.updateParents(parents);
	}
	
	@GetMapping("/parents/all")
	public List<Parents> getParentss(){
		//return parentsService.getAllParents();
		return parentsService.getAllParentsSql();
	}
	
	@GetMapping("/parents/by/{parentsId}")
	public Parents getFamilies(@PathVariable(name= "parentsId") int parentsId) {
		return parentsService.getParents(parentsId);
	}
	
	@DeleteMapping("/parents/delete/{parentsId}")
	public void deleteParents(@PathVariable(name= "parentsId") int parentsId) {
		parentsService.deleteParents(parentsId);
	}

}
