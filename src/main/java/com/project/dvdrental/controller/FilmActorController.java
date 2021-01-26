package com.project.dvdrental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dvdrental.entity.FilmActorEntity;
import com.project.dvdrental.repository.ActorRepository;
import com.project.dvdrental.repository.FilmActorRepository;

@RestController
@RequestMapping("/api")
public class FilmActorController {
	
	@Autowired
	FilmActorRepository repo;
	
	@Autowired
	ActorRepository actorRepo;
	
	@GetMapping("/filmactor")
	public ResponseEntity<?> getAll() {
		List<FilmActorEntity> filmActorEntity = repo.findAll();
		return ResponseEntity.ok(filmActorEntity);
	}
	
	@GetMapping("/filmactor/id")
	public ResponseEntity<?> getById() {
		List<FilmActorEntity> filmActorEntity = repo.findByIdActorId(actorRepo.findByActorId(1));
		return ResponseEntity.ok(filmActorEntity);
	}
}
