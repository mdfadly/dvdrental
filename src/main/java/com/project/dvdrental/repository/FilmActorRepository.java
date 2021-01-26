package com.project.dvdrental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dvdrental.entity.ActorEntity;
import com.project.dvdrental.entity.FilmActorEntity;
import com.project.dvdrental.entity.FilmEntity;

@Repository
public interface FilmActorRepository extends JpaRepository<FilmActorEntity, Integer>{
	
	List<FilmActorEntity> findByIdActorId(ActorEntity actor_id);
	List<FilmActorEntity> findByIdFilmId(FilmEntity film_id);

}
