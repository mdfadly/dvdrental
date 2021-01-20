package com.project.dvdrental.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dvdrental.dto.ActorDto;
import com.project.dvdrental.entity.ActorEntity;
import com.project.dvdrental.repository.ActorRepository;

@Service
@Transactional
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorRepository repo;

	@Override
	public List<ActorEntity> getAll() {
		// TODO Auto-generated method stub
		List<ActorEntity> actorEntities = repo.findAll();
		return actorEntities;
	}
	
	@Override
	public ActorEntity getByActorId(Integer actor_id) {
		// TODO Auto-generated method stub
		ActorEntity actorEntity = repo.findByActorId(actor_id);
		return actorEntity;
	}

	@Override
	public List<ActorEntity> getByFirstName(String first_name) {
		// TODO Auto-generated method stub
		List<ActorEntity> actorEntities = repo.findByFirstName(first_name);
		return actorEntities;
	}

	@Override
	public List<ActorEntity> getByLastName(String last_name) {
		// TODO Auto-generated method stub
		List<ActorEntity> actorEntities = repo.findByLastName(last_name);
		return actorEntities;
	}

	@Override
	public List<ActorEntity> getByLastUpdate(Date date) {
		// TODO Auto-generated method stub
		List<ActorEntity> actorEntities = repo.findByLastUpdate(date);
		return actorEntities;
	}

	@Override
	public ActorEntity postActor(ActorDto dto) {
		// TODO Auto-generated method stub
		ActorEntity actorEntity = new ActorEntity();
		actorEntity.setFirstName(dto.getFirstName());
		actorEntity.setLastName(dto.getLastName());
//		LocalDate myObj = LocalDate.now();
		Date date = new Date();
		actorEntity.setLastUpdate(date);
		repo.save(actorEntity);
		return actorEntity;
	}

	@Override
	public ActorEntity putActor(Integer actor_id, ActorDto dto) {
		// TODO Auto-generated method stub
		ActorEntity actorEntity = repo.findByActorId(actor_id);
		actorEntity.setFirstName(dto.getFirstName());
		actorEntity.setLastName(dto.getLastName());
		repo.save(actorEntity);
		return actorEntity;
	}

	@Override
	public ActorEntity deleteActor(Integer actor_id) {
		// TODO Auto-generated method stub
		ActorEntity actorEntity = repo.findByActorId(actor_id);
		repo.delete(actorEntity);
		return actorEntity;
	}


}
