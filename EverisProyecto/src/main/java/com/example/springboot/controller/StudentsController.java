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

import com.example.springboot.entity.Students;
import com.example.springboot.service.StudentsService;


@RestController
public class StudentsController {
	@Autowired
	private StudentsService studentsService;
	
	@PostMapping("/students/save")
	public Students save(@RequestBody Students students) {
		return studentsService.saveStudents(students);
	}
	
	
	@PutMapping("/students/update")
	public Students update(@RequestBody Students students) {
		return studentsService.updateStudents(students);
	}
	
	//aa
	
	@GetMapping("/students/all")
	public List<Students> getStudents(){
		return studentsService.getAllStudents();
	}
	
	@GetMapping("/students/by/{studentsId}")
	public Students getStudents(@PathVariable(name= "studentsId") int studentsId) {
		return studentsService.getStudents(studentsId);
	}
	
	@DeleteMapping("/students/delete/{studentsId}")
	public void deleteStudents(@PathVariable(name= "studentsId") int studentsId) {
		studentsService.deleteStudents(studentsId);
	}
}
