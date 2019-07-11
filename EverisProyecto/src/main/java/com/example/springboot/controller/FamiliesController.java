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

import com.example.springboot.entity.Families;
import com.example.springboot.service.FamiliesService;

@RestController
public class FamiliesController {

	@Autowired
	private FamiliesService FamiliesService;
	
	@PostMapping("/family/save")
	public Families save(@RequestBody Families families) {
		return FamiliesService.saveFamilies(families);
	}
	
	
	@PutMapping("/family/update")
	public Families update(@RequestBody Families families) {
		return FamiliesService.updateFamilies(families);
	}
	
	@GetMapping("/family/all")
	public List<Families> getFamilies(){
		return FamiliesService.getAllFamilies();
	}
	
	@GetMapping("/family/by/{familiesId}")
	public Families getFamilies(@PathVariable(name= "familiesId") int familiesId) {
		return FamiliesService.getFamilies(familiesId);
	}
	
	@DeleteMapping("/family/delete/{familiesId}")
	public void deleteFamilies(@PathVariable(name= "familiesId") int familiesId) {
		FamiliesService.deleteFamilies(familiesId);
	}
}
