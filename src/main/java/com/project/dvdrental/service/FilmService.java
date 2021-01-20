package com.project.dvdrental.service;

import java.util.List;

import com.project.dvdrental.entity.FilmEntity;

public interface FilmService {
	public List<FilmEntity> getAll();
	public FilmEntity getByFilmId(Integer id);
}
