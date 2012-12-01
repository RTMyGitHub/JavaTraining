package com.training.java.servlet.movie.domain;

import java.util.Date;

public class Movie {

	private int movieId;
	private String title;
	private String type;
	private String director;
	private Date date;

	
	public Movie(int movieId, String title, String type, String director,
			Date date) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.type = type;
		this.director = director;
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getMovieId() {
		return movieId;
	}
	public String getTitle() {
		return title;
	}
	public String getType() {
		return type;
	}
	public String getDirector() {
		return director;
	}
	
	
}
