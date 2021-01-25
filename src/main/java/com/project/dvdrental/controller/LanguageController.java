package com.project.dvdrental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dvdrental.entity.LanguageEntity;
import com.project.dvdrental.repository.LanguageRepository;

@RestController
@RequestMapping("/api")
public class LanguageController {
	
	@Autowired
	LanguageRepository repo;
	
	@GetMapping("/language")
	public ResponseEntity<?> getAll(){
		List<LanguageEntity> languageEntities = repo.findAll();
//		String a = service.getTest();
		return ResponseEntity.ok(languageEntities);
	}

}
