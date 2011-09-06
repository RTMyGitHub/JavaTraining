package com.training.java.jdbc.movie;

import java.sql.Date;

public class Movie
{
	private int id;
	private String name;
	private String rating;
	private Date releaseDate;
	private String genre;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getRating()
	{
		return rating;
	}

	public void setRating(String rating)
	{
		this.rating = rating;
	}

	public Date getReleaseDate()
	{
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate)
	{
		this.releaseDate = releaseDate;
	}

	public String getGenre()
	{
		return genre;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}
}
