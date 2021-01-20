package com.project.dvdrental.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dvdrental.entity.ActorEntity;

@Repository
public interface ActorRepository extends JpaRepository<ActorEntity, Integer> {

	ActorEntity findByActorId(Integer actor_id);
	List<ActorEntity> findByFirstName(String first_name);
	List<ActorEntity> findByLastName(String last_name);
	List<ActorEntity> findByLastUpdate(Date last_update);
	
//	public List<ActorEntity> findByFirst_name(String first_name);
//	public List<ActorEntity> findByLast_name(String last_name);
//	public List<ActorEntity> findByLast_update(Date last_update);
}
