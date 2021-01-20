package com.project.dvdrental.entity;

import java.io.Serializable;
import java.time.Year;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "film")
public class FilmEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "film_id")
	private Integer filmId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "release_year")
	private Year releaseYear;
	
	@ManyToOne
	@JoinColumn(name = "language_id", referencedColumnName = "language_id")
	private LanguageEntity languageId;
	
	@Column(name = "rental_duration")
	private Integer rentalDuration;
	
	@Column(name = "rental_rate")
	private Float rentalRate;
	
	@Column(name = "length")
	private Integer length;
	
	@Column(name = "replacement_cost")
	private Float replacementCost;
	
	@Column(name = "rating")
	private String rating;
	
	@Column(name = "last_update")
	private Date lastUpdate;
	
	@Column(name = "special_features")
	private Feature<String> specialFeature;
	
	@Column(name = "fulltext")
	private String fullText;
	
	
	public FilmEntity() {
		super();
	}


	public FilmEntity(Integer filmId, String title, String description, Year releaseYear, LanguageEntity languageId,
			Integer rentalDuration, Float rentalRate, Integer length, Float replacementCost, String rating,
			Date lastUpdate, Feature specialFeature, String fullText) {
		super();
		this.filmId = filmId;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.lastUpdate = lastUpdate;
		this.specialFeature = specialFeature;
		this.fullText = fullText;
	}


	public Integer getFilmId() {
		return filmId;
	}
	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Year getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Year releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public LanguageEntity getLanguageId() {
		return languageId;
	}


	public void setLanguageId(LanguageEntity languageId) {
		this.languageId = languageId;
	}


	public Integer getRentalDuration() {
		return rentalDuration;
	}
	public void setRentalDuration(Integer rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	public Float getRentalRate() {
		return rentalRate;
	}
	public void setRentalRate(Float rentalRate) {
		this.rentalRate = rentalRate;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Float getReplacementCost() {
		return replacementCost;
	}
	public void setReplacementCost(Float replacementCost) {
		this.replacementCost = replacementCost;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}


	public Feature getSpecialFeature() {
		return specialFeature;
	}


	public void setSpecialFeature(Feature specialFeature) {
		this.specialFeature = specialFeature;
	}


	public String getFullText() {
		return fullText;
	}


	public void setFullText(String fullText) {
		this.fullText = fullText;
	}
	
}
