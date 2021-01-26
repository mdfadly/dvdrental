package com.project.dvdrental.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "film_actor")
public class FilmActorEntity implements Serializable{
	
	@EmbeddedId
    private FilmActorId id;
	
	@Column(name = "last_update")
	private Date lastUpdate;

	public FilmActorEntity() {
		super();
	}

	public FilmActorEntity(FilmActorId id, Date lastUpdate) {
		super();
		this.id = id;
		this.lastUpdate = lastUpdate;
	}

	public FilmActorId getId() {
		return id;
	}

	public void setId(FilmActorId id) {
		this.id = id;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
}
