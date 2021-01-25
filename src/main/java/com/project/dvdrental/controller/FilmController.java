package com.project.dvdrental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dvdrental.dto.FilmDto;
import com.project.dvdrental.entity.FilmEntity;
import com.project.dvdrental.service.FilmServiceImpl;

@RestController
@RequestMapping("/api")
public class FilmController {
	
	@Autowired
	private FilmServiceImpl service;
	
	
	@GetMapping("/film")
	public ResponseEntity<?> getAll(){
		List<FilmEntity> filmEntities = service.getAll();
		return ResponseEntity.ok(filmEntities);
	}
	
	
	@GetMapping("/film/id/{id}")
	public ResponseEntity<?> getById(@PathVariable Integer id){
		FilmEntity filmEntities = service.getByFilmId(id);
		return ResponseEntity.ok(filmEntities);
	}
	
	@PostMapping("/film")
	public ResponseEntity<?> postFilm(@RequestBody FilmDto dto){
		FilmEntity filmEntity = service.postFilm(dto);
		return ResponseEntity.ok(filmEntity);
	}
	
	@PutMapping("/film/{film_id}")
	public ResponseEntity<?> putFilm(@PathVariable Integer film_id, @RequestBody FilmDto dto){
		FilmEntity filmEntity = service.putFilm(film_id, dto);
		return ResponseEntity.ok(filmEntity);
	}
	
	@DeleteMapping("/film/{film_id}")
	public ResponseEntity<?> deleteFilm(@PathVariable Integer film_id){
		FilmEntity filmEntity = service.deleteFilm(film_id);
		return ResponseEntity.ok(filmEntity);
	}
}
