package com.project.dvdrental.service;

import java.util.List;

import com.project.dvdrental.dto.FilmDto;
import com.project.dvdrental.entity.FilmEntity;

public interface FilmService {
	public List<FilmEntity> getAll();
	public FilmEntity getByFilmId(Integer id);
	
	public FilmEntity postFilm(FilmDto dto);
	public FilmEntity putFilm(Integer film_id, FilmDto dto);
	public FilmEntity deleteFilm(Integer film_id);
}
