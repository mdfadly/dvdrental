package com.project.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dvdrental.entity.FilmEntity;
import com.project.dvdrental.repository.FilmRepository;

@Service
@Transactional
public class FilmServiceImpl implements FilmService{

	
	@Autowired
	private FilmRepository repo;
	
	@Override
	public List<FilmEntity> getAll() {
		// TODO Auto-generated method stub
		List<FilmEntity> filmEntities = repo.findAll();
		return filmEntities;
	}

	@Override
	public FilmEntity getByFilmId(Integer id) {
		// TODO Auto-generated method stub
		FilmEntity filmEntity = repo.findByFilmId(id);
		return filmEntity;
	}
	
	public String getTest() {
		return "test";
	}
	
}
