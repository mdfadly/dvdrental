package com.project.dvdrental.controller;

import java.util.Date;
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

import com.project.dvdrental.dto.ActorDto;
import com.project.dvdrental.entity.ActorEntity;
import com.project.dvdrental.service.ActorServiceImpl;

@RestController
@RequestMapping("/api")
public class ActorController {
	
	@Autowired
	private ActorServiceImpl service;
	
	@GetMapping("/actor")
	public ResponseEntity<?> getAllActor(){
		List<ActorEntity> actorEntities = service.getAll();
		return ResponseEntity.ok(actorEntities);
	}
	
	@GetMapping("/actor/id/{id}")
	public ResponseEntity<?> getByActorId(@PathVariable Integer id){
		ActorEntity actorEntity = service.getByActorId(id);
		return ResponseEntity.ok(actorEntity);
	}
	
	
	@GetMapping("/actor/firstName/{firstName}")
	public ResponseEntity<?> getByFirstName(@PathVariable String firstName){
		List<ActorEntity> actorEntities = service.getByFirstName(firstName);
		return ResponseEntity.ok(actorEntities);
	}
	
	@GetMapping("/actor/lastName/{lastName}")
	public ResponseEntity<?> getByLastName(@PathVariable String lastName){
		List<ActorEntity> actorEntities = service.getByLastName(lastName);
		return ResponseEntity.ok(actorEntities);
	}
	
	@GetMapping("/actor/lastUpdate/{lastUpdate}")
	public ResponseEntity<?> getByLastUpdate(@PathVariable Date lastUpdate){
		List<ActorEntity> actorEntities = service.getByLastUpdate(lastUpdate);
		return ResponseEntity.ok(actorEntities);
	}
	
	
	@PostMapping("/actor")
	public ResponseEntity<?> postActor(@RequestBody ActorDto dto){
		ActorEntity actorEntity = service.postActor(dto);
		return ResponseEntity.ok(actorEntity);
	}
	
	@PutMapping("/actor/id/{id}")
	public ResponseEntity<?> putActor(@PathVariable Integer id, @RequestBody ActorDto dto){
		ActorEntity actorEntity = service.putActor(id, dto);
		return ResponseEntity.ok(actorEntity);
	}
	
	@DeleteMapping("/actor/id/{id}")
	public ResponseEntity<?> deleteActor(@PathVariable Integer id){
		ActorEntity actorEntity = service.deleteActor(id);
		return ResponseEntity.ok(actorEntity);
	}
	
}
