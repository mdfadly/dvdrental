package com.project.dvdrental.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.project.dvdrental.entity.FilmActorEntity;
import com.project.dvdrental.entity.FilmActorId;
import com.project.dvdrental.exception.APIException;
import com.project.dvdrental.exception.ResourceNotFoundException;
import com.project.dvdrental.repository.FilmActorRepository;
import com.project.dvdrental.service.ActorServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ActorController {
	
	@Autowired
	private ActorServiceImpl service;
	
	@Autowired
	private FilmActorRepository repoFilmActor;
	
	@GetMapping("/actor")
	public ResponseEntity<?> getAllActor() throws APIException{
		List<ActorEntity> actorEntities = service.getAll();
		if(actorEntities.size() > 0) {
			return ResponseEntity.ok(actorEntities);			
		}else {
			throw new APIException ("Sorry! Cannot Get Resource");
		}
	}
	
	@GetMapping("/actor/id/{actor_id}")
	public ResponseEntity<?> getByActorId(@PathVariable Integer actor_id) throws ResourceNotFoundException{
		ActorEntity actorEntity = service.getByActorId(actor_id);
		if(actorEntity != null) {
			return ResponseEntity.ok(actorEntity);
		}else {
			throw new ResourceNotFoundException("Resource With Actor Id : " + actor_id + " Not Found!");
		}
	}
	
	@GetMapping("/actor/firstName/{firstName}")
	public ResponseEntity<?> getByFirstName(@PathVariable String firstName) throws ResourceNotFoundException{
		List<ActorEntity> actorEntities = service.getByFirstName(firstName);
		if(actorEntities.size() > 0) {
			return ResponseEntity.ok(actorEntities);			
		}else {
			throw new ResourceNotFoundException("Resource With First Name : " + firstName + " Not Found!");
		}
	}
	
	@GetMapping("/actor/lastName/{lastName}")
	public ResponseEntity<?> getByLastName(@PathVariable String lastName) throws ResourceNotFoundException{
		List<ActorEntity> actorEntities = service.getByLastName(lastName);
		if(actorEntities.size() > 0) {
			return ResponseEntity.ok(actorEntities);			
		}else {
			throw new ResourceNotFoundException("Resource With Last Name : " + lastName + " Not Found!");
		}
	}
	
	@GetMapping("/actor/lastUpdate/{lastUpdate}")
	public ResponseEntity<?> getByLastUpdate(@PathVariable Date lastUpdate) throws ResourceNotFoundException{
		List<ActorEntity> actorEntities = service.getByLastUpdate(lastUpdate);
		if(actorEntities.size() > 0) {
			return ResponseEntity.ok(actorEntities);			
		}else {
			throw new ResourceNotFoundException("Resource With Last Update : " + lastUpdate + " Not Found!");
		}
	}
	
	
	@PostMapping("/actor")
	public ResponseEntity<?> postActor(@RequestBody ActorDto dto) throws APIException{
		if(dto.getFirstName().equals("")) {
			throw new APIException("First Name cannot be empty");
		} else if(dto.getLastName().equals("")){
			throw new APIException("Last Name cannot be empty");
		}else {
			ActorEntity actorEntity = service.postActor(dto);
			if(actorEntity != null) {
				return ResponseEntity.ok(actorEntity);				
			}else {
				throw new APIException("Sorry! Cannot Insert Data");
			}
		}
	}
	
	@PutMapping("/actor/id/{actor_id}")
	public ResponseEntity<?> putActor(@PathVariable Integer actor_id, @RequestBody ActorDto dto) throws ResourceNotFoundException{
		ActorEntity actorEntities = service.getByActorId(actor_id);
		if(actorEntities != null) {
			if(dto.getFirstName().equals("")) {
				throw new APIException("First Name cannot be empty");
			} else if(dto.getLastName().equals("")){
				throw new APIException("Last Name cannot be empty");
			}else {
				ActorEntity actorEntity = service.putActor(actor_id, dto);
				if(actorEntity != null) {
					return ResponseEntity.ok(actorEntity);				
				}else {
					throw new APIException("Sorry! Cannot Insert Data");
				}
			}
		}else {
			throw new ResourceNotFoundException("Resource With Actor Id : " + actor_id + " Not Found! Cannot update data!");
		}
		
	}
	
	@DeleteMapping("/actor/id/{actor_id}")
	public ResponseEntity<?> deleteActor(@PathVariable Integer actor_id) throws ResourceNotFoundException {
		ActorEntity actorEntities = service.getByActorId(actor_id);
		if(actorEntities != null) {
			List<FilmActorEntity> filmActorEntity = repoFilmActor.findByIdActorId(actorEntities);
			if(filmActorEntity != null) {
				throw new ResourceNotFoundException("Resource With Actor Id : " + actor_id + " Found in Other Tabel Relation");
			}else {
				ActorEntity actorEntity = service.deleteActor(actor_id);
				return ResponseEntity.ok(actorEntity);				
			}
		}else {
			throw new ResourceNotFoundException("Resource With Actor Id : " + actor_id + " Not Found! Cannot update data!");
		}
	}
	
}
