package com.project.dvdrental.service;

import java.util.Date;
import java.util.List;

import com.project.dvdrental.dto.ActorDto;
import com.project.dvdrental.entity.ActorEntity;

public interface ActorService {
	public List<ActorEntity> getAll();
	public ActorEntity getByActorId(Integer actor_id);
	public List<ActorEntity> getByFirstName(String first_name);
	public List<ActorEntity> getByLastName(String last_name);
	public List<ActorEntity> getByLastUpdate(Date date);
	
	public ActorEntity postActor(ActorDto dto);
	public ActorEntity putActor(Integer actor_id, ActorDto dto);
	public ActorEntity deleteActor(Integer actor_id);
	
}
