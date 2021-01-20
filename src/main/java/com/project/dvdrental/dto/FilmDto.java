package com.project.dvdrental.dto;

import java.time.Year;
import java.util.Date;
import java.util.List;

public class FilmDto {
	private Integer filmId;
	private String title;
	private String description;
	private Year releaseYear;
	private Integer languageId;
	private Integer rentalDuration;
	private Float rentalRate;
	private Integer length;
	private Float replacementCost;
	private String rating;
	private Date lastUpdate;
	private List<String> specialFeatures;
	private String fullText;
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
	public Integer getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Integer languageId) {
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
	public List<String> getSpecialFeatures() {
		return specialFeatures;
	}
	public void setSpecialFeatures(List<String> specialFeatures) {
		this.specialFeatures = specialFeatures;
	}
	public String getFullText() {
		return fullText;
	}
	public void setFullText(String fullText) {
		this.fullText = fullText;
	}
	
	
	
}


