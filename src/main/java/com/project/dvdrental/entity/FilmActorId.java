package com.project.dvdrental.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class FilmActorId implements Serializable{
	
	@ManyToOne
	@JoinColumn(name = "actor_id", referencedColumnName = "actor_id")
    private ActorEntity actorId;
	@ManyToOne
	@JoinColumn(name = "film_id", referencedColumnName = "film_id")
	private FilmEntity filmId;
        
    public FilmActorId() {
		super();
	}
	
    public FilmActorId(ActorEntity actorId, FilmEntity filmId) {
		super();
		this.actorId = actorId;
		this.filmId = filmId;
	}


	public ActorEntity getActorId() {
		return actorId;
	}

	public void setActorId(ActorEntity actorId) {
		this.actorId = actorId;
	}

	public FilmEntity getFilmId() {
		return filmId;
	}

	public void setFilmId(FilmEntity filmId) {
		this.filmId = filmId;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FilmActorId)) return false;
        FilmActorId that = (FilmActorId) o;
        return Objects.equals(getActorId(), that.getActorId()) &&
                Objects.equals(getFilmId(), that.getFilmId());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getActorId(), getFilmId());
    }

}
