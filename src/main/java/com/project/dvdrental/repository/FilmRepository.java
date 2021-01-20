package com.project.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dvdrental.entity.FilmEntity;

@Repository
public interface FilmRepository extends JpaRepository<FilmEntity, Integer> {
	
	FilmEntity findByFilmId(Integer filmId);

}
