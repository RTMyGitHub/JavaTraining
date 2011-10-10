package com.training.moviestore.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieDAOJDBCImpl implements MovieDAO
{
	private String dburl;
	private String dbuser;
	private String dbPassword;

	public MovieDAOJDBCImpl(String dburl, String dbuser, String dbPassWord)
	{
		this.dburl = dburl;
		this.dbuser = dbuser;
		this.dbPassword = dbPassWord;
	}

	@Override
	public void create(Movie movie)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(dburl, dbuser,
					dbPassword);
			PreparedStatement stmt = con
					.prepareStatement("insert into movie(id, genre, rating, release_date, name) values(?,?,?,?,?)");

			stmt.setInt(1, movie.getId());
			stmt.setString(2, movie.getGenre());
			stmt.setString(3, movie.getRating());
			stmt.setDate(4, movie.getReleaseDate());
			stmt.setString(5, movie.getName());

			stmt.executeUpdate();

		} 
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			throw new MovieDAOException(e.getMessage());
		}
	}

	@Override
	public List<Movie> getMovies()
	{
		List<Movie> movies = new ArrayList<Movie>();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(dburl, dbuser,
					dbPassword);
			PreparedStatement stmt = con
					.prepareStatement("select * from movie");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Movie aMovie = new Movie();
				
				aMovie.setId(rs.getInt("id"));
				aMovie.setName(rs.getString("name"));
				aMovie.setRating(rs.getString("rating"));
				aMovie.setReleaseDate(rs.getDate("release_date"));
				aMovie.setGenre(rs.getString("genre"));
				
				movies.add(aMovie);
			}
		} 
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		return movies;
	}

	@Override
	public Movie findByPrimaryKey(int id) {
		Movie movie = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(dburl, dbuser,
					dbPassword);
			PreparedStatement stmt = con
					.prepareStatement("select * from movie where id =  ?");
			
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next())
			{
				movie = new Movie();
				
				movie.setId(rs.getInt("id"));
				movie.setName(rs.getString("name"));
				movie.setRating(rs.getString("rating"));
				movie.setReleaseDate(rs.getDate("release_date"));
				movie.setGenre(rs.getString("genre"));
			}
		} 
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return movie;
	}
}
