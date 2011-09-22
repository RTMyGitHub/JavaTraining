package com.training.java.servlet.moviestore.web;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class MovieForm extends ActionForm
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

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request)
	{
		ActionErrors errors = new ActionErrors();

		if (id == 0)
		{
			errors.add("id", new ActionMessage("id.required"));
		}
		
		if(name == null || name.trim().equals(""))
		{
			errors.add("name", new ActionMessage("name.required"));
		}
		
		if(genre == null || genre.trim().equals(""))
		{
			errors.add("genre", new ActionMessage("genre.required"));
		}
		
		if(rating == null || rating.trim().equals(""))
		{
			errors.add("rating", new ActionMessage("rating.required"));
		}
		
		return errors;
	}

}
