package com.project.dvdrental.entity;

import java.io.Serializable;
import java.time.Year;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.project.dvdrental.converter.EnumTypePostgreSql;
import com.project.dvdrental.converter.RatingConvert;
import com.project.dvdrental.converter.YearConvert;


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
	
	@Column(name = "release_year", columnDefinition = "Year")
	@Convert(converter = YearConvert.class)
	private Year releaseYear;
	
	@ManyToOne
	@JoinColumn(name = "language_id", referencedColumnName = "language_id")
	private LanguageEntity languageId;
	
	@Column(name = "rental_duration")
	private Integer rentalDuration;
	
	@Column(name = "rental_rate")
	private Double rentalRate;
	
	@Column(name = "length")
	private Integer length;
	
	@Column(name = "replacement_cost")
	private Double replacementCost;
	
//	@Enumerated(EnumType.STRING)
//	@Type(type = "com.project.dvdrental.converter.EnumTypePostgreSql")
	@Column(name = "rating", columnDefinition = "mpaa_rating")
	@Convert(converter = EnumTypePostgreSql.class)
	private Rating rating;
	
	@Column(name = "last_update")
	private Date lastUpdate;
	
	@Column(name = "special_features", columnDefinition = "text[]")
    @Type(type = "com.project.dvdrental.converter.PostgreSqlStringArrayType")
	private String[] specialFeature;
	
//	@Column(name = "fulltext")
//	private String fullText;
	
	public FilmEntity() {
		super();
	}
	
	

	public FilmEntity(Integer filmId, String title, String description, Year releaseYear, LanguageEntity languageId,
			Integer rentalDuration, Double rentalRate, Integer length, Double replacementCost, Rating rating,
			Date lastUpdate, String[] specialFeature) {
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
//		this.fullText = fullText;
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

	public Double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(Double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(Double replacementCost) {
		this.replacementCost = replacementCost;
	}

	

	public Rating getRating() {
		return rating;
	}



	public void setRating(Rating rating) {
		this.rating = rating;
	}



	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}



	public String[] getSpecialFeature() {
		return specialFeature;
	}



	public void setSpecialFeature(String[] specialFeature) {
		this.specialFeature = specialFeature;
	}



//	public String getFullText() {
//		return fullText;
//	}
//
//
//
//	public void setFullText(String fullText) {
//		this.fullText = fullText;
//	}
	
	
	
	
}
