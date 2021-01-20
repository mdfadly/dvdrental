package com.project.dvdrental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dvdrental.entity.FilmEntity;
import com.project.dvdrental.service.FilmServiceImpl;

@RestController
@RequestMapping("/api")
public class FilmController {
	
	@Autowired
	private FilmServiceImpl service;
	
	
	@GetMapping("/film")
	public ResponseEntity<?> getAll(){
//		List<FilmEntity> filmEntities = service
		String a = service.getTest();
		return ResponseEntity.ok(a);
	}
	
	
	@GetMapping("/film/id/{id}")
	public ResponseEntity<?> getById(@PathVariable Integer id){
		FilmEntity filmEntities = service.getByFilmId(id);
		return ResponseEntity.ok(filmEntities);
	}	
}
