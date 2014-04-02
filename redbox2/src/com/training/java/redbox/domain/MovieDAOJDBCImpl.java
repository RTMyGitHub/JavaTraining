package com.training.java.redbox.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class MovieDAOJDBCImpl extends BaseDAO implements MovieDAO {

	@Override
	public List<Movie> getAllMovies() throws DAOException {

		// Create a list of movie.
		List<Movie> movies = new ArrayList<Movie>();

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {

			// Calling getConnection()

			connection = getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("Select * from Movie");

			while (resultSet.next()) {
				
				long id = resultSet.getLong("ID");
				String type = resultSet.getString("TYPE");
				String title = resultSet.getString("TITLE");
				double rentalPrice = resultSet.getDouble("RENTAL_PRICE");
				String imageLocation = resultSet.getString("image_location");

				// Instantiate Movie object
				Movie movie = new Movie(id, type, title, rentalPrice, imageLocation);

				// add movie object to list

				movies.add(movie);

			}

		} catch (SQLException ex) {

			throw new DAOException(ex,
					"Error while selecting a record from database");

		} finally {
			// calling colseResources method to close all resources.
			closeResources(connection, statement, resultSet);

		}

		return movies;
	}

	
	// adding record to movie table through DAO
		@Override
		public void addMovie(Movie movie) throws DAOException {

			Connection connection = null;
			PreparedStatement statement = null;
			ResultSet resultSet = null;

			try {
				// Calling getConnecting method to get connection
				connection = getConnection();
				
				long id = movie.getId();
				String type = movie.getType();
				String title = movie.getTitle();
				double rentalPrice = movie.getRentalPrice();

				statement = connection
						.prepareStatement("insert into Movie values(?,?,?,?,?,?,?)");
				statement.setLong(1, id);
				statement.setString(2, type);
				statement.setString(3, title);
				statement.setDouble(4,rentalPrice);

				int noOfRowsInserted = statement.executeUpdate();
				connection.commit();
				if (noOfRowsInserted != 1) {
					throw new DAOException("Inserting a Movie failed");
				}

			} catch (SQLException ex) {
				ex.printStackTrace();
				throw new DAOException(ex,
						"Error while adding a record  to the Database");

			} finally {
				// calling close Resources method to close all resources
				closeResources(connection, statement, resultSet);
			}

		}


		
		
		
		
		@Override
		public void updateMovie( Movie movie) throws DAOException {

			Connection connection = null;
			PreparedStatement statement = null;
			ResultSet resultSet = null;

			try {
				// Calling getConnecting method to get connection
				connection = getConnection();

				long id = movie.getId();
				String type = movie.getType();
				String title = movie.getTitle();
				double rentalPrice = movie.getRentalPrice();


				statement = connection
						.prepareStatement("update Movie set  type =?, title=?,director= ?,genre=?,rental_Price =?,rating=? where id = ?");

				
				statement.setString(1, type);
				statement.setString(2, title);
				statement.setDouble(5,rentalPrice);

				statement.setLong(7, id);

				int noOfRowsUpdated = statement.executeUpdate();

				if (noOfRowsUpdated != 1) {
					System.out.println("No Rows Updated");
				}

			} catch (SQLException ex) {
				// ex.printStackTrace();
				throw new DAOException(ex,
						"Error while updating a record  to the Database");

			} finally {
				// calling close Resources method to close all resources
				closeResources(connection, statement, resultSet);
			}
		}

		@Override
		public void deleteMovie(long id) throws DAOException {

			Connection connection = null;
			PreparedStatement statement = null;
			ResultSet resultSet = null;

			try {
				// Calling getConnecting method to get connection
				connection = getConnection();

				statement = connection
						.prepareStatement("delete from movie where id = ?");

				statement.setLong(1, id);

				int noOfRowsDeleted = statement.executeUpdate();

				if (noOfRowsDeleted != 1) {
					throw new DAOException("Delete  failed");
				}

			} catch (SQLException ex) {
				// ex.printStackTrace();
				throw new DAOException(ex,
						"Error while deleting a record  from the Database");
			} finally {
				// calling close Resources method to close all resources
				closeResources(connection, statement, resultSet);
			}
		}

		@Override
		public Movie findByPrimaryKey(long movieId) throws DAOException {
			Connection connection = null;
			PreparedStatement statement = null;
			ResultSet resultSet = null;
			Movie movie = null;

			try {
				// Calling getConnecting method to get connection
				connection = getConnection();

				statement = connection
						.prepareStatement("Select * from Movie where  id = ?");

				statement.setLong(1, movieId);

				resultSet = statement.executeQuery();

				if (resultSet.next()) {

					long id = resultSet.getLong("ID");
					String type = resultSet.getString("TYPE");
					String title = resultSet.getString("TITLE");
					double rentalPrice = resultSet.getDouble("RENTAL_PRICE");
					String imageLocation = resultSet.getString("image_location");
					
					return new Movie(id, type, title, rentalPrice, imageLocation);

				}

				throw new DAOException("Invalid id provided");
				

			} catch (SQLException ex) {
				// ex.printStackTrace();
				throw new DAOException(ex,
						"Error while selecting a record  from the  Database");

			} finally {
				// calling close Resources method to close all resources
				closeResources(connection, statement, resultSet);
			}
			
			
		
		}

	}
