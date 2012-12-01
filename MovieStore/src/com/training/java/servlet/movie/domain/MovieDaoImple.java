package com.training.java.servlet.movie.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MovieDaoImple implements MovieDao{
	
	private String jdbcUrl;
	private String username;
	private String password;
	
	

	public MovieDaoImple(String jdbcUrl, String username, String password) {
		super();
		this.jdbcUrl = jdbcUrl;
		this.username = username;
		this.password = password;
	}
	

	public String getJdbcUrl() {
		return jdbcUrl;
	}


	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}


	@Override
	public List<Movie> getAllMovies() {
		List< Movie> list=new ArrayList<>();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try
		{
			con=getConnection();
			ps=con.prepareStatement("select * from movie");
			rs=ps.executeQuery();
			while(rs.next())
			{
			String movieidStr=rs.getString("movieid");
			String title=rs.getString("title");
			String type=rs.getString("type");
			String director=rs.getString("director");
			Date date=rs.getDate("releaseDate");
			int movieId=Integer.parseInt(movieidStr);
			
			Movie movie=new Movie(movieId, title, type, director, date);
			list.add(movie);
			}
			return list;
		}catch(SQLException e)
		{
			throw new DAOException(e);
		}finally
		{
			closeResource(rs, ps, con);
		}
	}


	@Override
	public void addMovies(Movie m) {
		
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		//Movie movie=null;
		try
		{
			con=getConnection();
			ps=con.prepareStatement("insert into movie values(?,?,?,?,?)");
			int movieid=m.getMovieId();
			String title=m.getTitle();
			String type=m.getType();
			String director=m.getDirector();
			java.sql.Date date=new java.sql.Date(m.getDate().getTime());
			
			ps.setInt(1, movieid);
			ps.setString(2,  title);
			ps.setString(3, director);
			ps.setString(4, type);
			
			ps.setDate(5, date);
			
			int rows= ps.executeUpdate();
			if(rows!=1)
			{
				throw new DAOException("Addition Failed");
			}
		}catch(SQLException e)
		{
			throw new DAOException(e);
		}
		
	}


	@Override
	public Movie GetById(int movieId) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try
		{
			con=getConnection();
			ps=con.prepareStatement("select * from movie where movie_id=?");
			ps.setInt(1, movieId);
			rs=ps.executeQuery();
			Movie movie=null;
			if(rs.next())
			{
			String movieidStr=rs.getString("movie_id");
			String title=rs.getString("title");
			String type=rs.getString("type");
			String director=rs.getString("director");
			Date date=rs.getDate("date1");
			int movieId1=Integer.parseInt(movieidStr);
			
			 movie=new Movie(movieId1, title, type, director, date);
			 return movie;
			
			}

			throw new DAOException("Invalid Id ");

		}catch(SQLException e)
		{
			throw new DAOException(e);
		}finally
		{
			closeResource(rs, ps, con);
		}
	}


	@Override
	public void update(Movie movie) {
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		//Movie movie=null;
		try
		{
			con=getConnection();
			ps=con.prepareStatement("update movie set title=?, director=? where movie_id=?");
			int movieid=movie.getMovieId();
			String title=movie.getTitle();
			String type=movie.getType();
			String director=movie.getDirector();
			java.sql.Date date=new java.sql.Date(movie.getDate().getTime());
			
			
			ps.setString(1,  title);
			ps.setString(2, director);
			ps.setInt(3, movieid);
			
			int rows= ps.executeUpdate();
			if(rows!=1)
			{
				throw new DAOException("Addition Failed");
			}
		}catch(SQLException e)
		{
			throw new DAOException(e);
		}
		finally
		{
			closeResource(rs, ps, con);
		}
		
	}


	@Override
	public void delete(int movieid) {


		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		try
		{
			con=getConnection();
			ps=con.prepareStatement("delete from movie where movie_id=?");
			ps.setInt(1, movieid);
			int rows=ps.executeUpdate();
			if(rows!=1)
			{
				throw new DAOException("Delection Failed ");
			}
		}catch(SQLException e)
		{
			throw new DAOException(e);
		}
		
	}
	private Connection getConnection()
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(jdbcUrl, username, password);
		}catch(ClassNotFoundException ex)
		{
			throw new DAOException(ex);
		}
		catch(SQLException e)
		{
			throw new DAOException(e);
		}
	}
	private void closeResource(ResultSet rs, PreparedStatement ps, Connection con)
	{
		if(rs!=null)
		{
			try
			{
				rs.close();
			}catch(SQLException e)
			{
				throw new DAOException(e);
			}
		}
		if(ps!=null)
		{
			try
			{
				ps.close();
			}catch(SQLException e)
			{
				throw new DAOException(e);
			}
		}
		if(con!=null)
		{
			try
			{
				con.close();
			}catch(SQLException e)
			{
				throw new DAOException(e);
			}
		}
	}


}
