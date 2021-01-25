package com.project.dvdrental.service;

import java.time.Year;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dvdrental.dto.FilmDto;
import com.project.dvdrental.entity.FilmEntity;
import com.project.dvdrental.entity.LanguageEntity;
import com.project.dvdrental.entity.Rating;
import com.project.dvdrental.repository.FilmRepository;
import com.project.dvdrental.repository.LanguageRepository;

@Service
@Transactional
public class FilmServiceImpl implements FilmService{

	
	@Autowired
	private FilmRepository repo;
	
	@Autowired
	private LanguageRepository repoLanguage;
	
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

	@Override
	public FilmEntity postFilm(FilmDto dto) {
		// TODO Auto-generated method stub
		FilmEntity filmEntity = new FilmEntity();
		filmEntity.setTitle(dto.getTitle());
		filmEntity.setDescription(dto.getDescription());
		filmEntity.setReleaseYear(Year.of(dto.getReleaseYear()));
		
		LanguageEntity languageEntity = repoLanguage.findByLanguageId(dto.getLanguageId());
		filmEntity.setLanguageId(languageEntity);
		
		filmEntity.setRentalDuration(dto.getRentalDuration());
		filmEntity.setRentalRate(dto.getRentalRate());
		filmEntity.setLength(dto.getLength());
		filmEntity.setReplacementCost(dto.getReplacementCost());
		filmEntity.setRating(Rating.valueOf(dto.getRating()));
		filmEntity.setSpecialFeature(dto.getSpecialFeature());
//		filmEntity.setFullText(dto.getFullText());
		
		repo.save(filmEntity);
		return filmEntity;
	}

	@Override
	public FilmEntity putFilm(Integer film_id, FilmDto dto) {
		// TODO Auto-generated method stub
		FilmEntity filmEntity = repo.findByFilmId(film_id);
		filmEntity.setTitle(dto.getTitle());
		filmEntity.setDescription(dto.getDescription());
		filmEntity.setReleaseYear(Year.of(dto.getReleaseYear()));
		
		LanguageEntity languageEntity = repoLanguage.findByLanguageId(dto.getLanguageId());
		filmEntity.setLanguageId(languageEntity);
		
		filmEntity.setRentalDuration(dto.getRentalDuration());
		filmEntity.setRentalRate(dto.getRentalRate());
		filmEntity.setLength(dto.getLength());
		filmEntity.setReplacementCost(dto.getReplacementCost());
		filmEntity.setRating(Rating.valueOf(dto.getRating()));
		filmEntity.setSpecialFeature(dto.getSpecialFeature());
//		filmEntity.setFullText(dto.getFullText());
		
		repo.save(filmEntity);
		return filmEntity;
	}

	@Override
	public FilmEntity deleteFilm(Integer film_id) {
		// TODO Auto-generated method stub
		FilmEntity filmEntity = repo.findByFilmId(film_id);
		repo.delete(filmEntity);
		return filmEntity;
	}
	
}
