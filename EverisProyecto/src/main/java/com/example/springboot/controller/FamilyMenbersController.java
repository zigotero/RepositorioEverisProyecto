package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.FamilyMenbers;
import com.example.springboot.service.FamilyMenbersService;


@RestController
public class FamilyMenbersController {
	
	
	@Autowired
	private FamilyMenbersService familyMenbersService;
	
	@PostMapping("/familymenber/save")
	public FamilyMenbers save(@RequestBody FamilyMenbers familyMenbers) {
		return familyMenbersService.saveFamilyMenbers(familyMenbers);
	}
	
	
	@PutMapping("/familymenber/update")
	public FamilyMenbers update(@RequestBody FamilyMenbers employee) {
		return familyMenbersService.updateFamilyMenbers(employee);
	}
	
	@GetMapping("/familymenber/all")
	public List<FamilyMenbers> getFamilyMenbers(){
		return familyMenbersService.getAllFamilyMenbers();
	}
	
	@GetMapping("/familymenber/by/{familymenber}")
	public FamilyMenbers getFamilyMenbers(@PathVariable(name= "familymenberId") int familyMenbersId) {
		return familyMenbersService.getFamilyMenbers(familyMenbersId);
	}
	
	@DeleteMapping("/familymenber/delete/{employeeId}")
	public void deleteFamilyMenbers(@PathVariable(name= "familymenberId") int familyMenbersId) {
		familyMenbersService.deleteFamilyMenbers(familyMenbersId);
	}

}
