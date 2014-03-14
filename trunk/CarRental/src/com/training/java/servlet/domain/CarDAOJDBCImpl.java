package com.training.java.servlet.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarDAOJDBCImpl extends BaseDAO implements CarDAO {

	@Override
	public List<Car> getAllCars() throws DAOException {

		// Create a list of Cars.
		List<Car> cars = new ArrayList<Car>();

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {

			// Calling getConnection()

			connection = getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("Select * from Car");

			while (resultSet.next()) {

				String vinNumber = resultSet.getString("VIN_NUMBER");
				String make = resultSet.getString("MAKE");
				String model = resultSet.getString("MODEL");
				int year = resultSet.getInt("YEAR");
				double price = resultSet.getDouble("PRICE");

				// Instantiate Car

				Car car = new Car(vinNumber, make, model, year, price);

				// add the car to list

				cars.add(car);

			}

		} catch (SQLException ex) {

			throw new DAOException(ex,
					"Error while adding a record to database");

		} finally {
			// calling colseResources method to close all resources.
			closeResources(connection, statement, resultSet);

		}

		return cars;
	}

	// adding record to car table through DAO
	@Override
	public void addCar(Car car) throws DAOException {

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			// Calling getConnecting method to get connection
			connection = getConnection();

			String vinNumber = car.getVinNumber();
			String make = car.getMake();
			String model = car.getModel();
			int year = car.getYear();
			double price = car.getPrice();

			statement = connection
					.prepareStatement("insert into Car values(?,?,?,?,?)");
			statement.setString(1, vinNumber);
			statement.setString(2, make);
			statement.setString(3, model);
			statement.setInt(4, year);
			statement.setDouble(5, price);

			int noOfRowsInserted = statement.executeUpdate();

			if (noOfRowsInserted != 1) {
				throw new DAOException("Inserting Car failed");
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
	public void updateCar(Car car) throws DAOException {

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			// Calling getConnecting method to get connection
			connection = getConnection();

			String vinNumber = car.getVinNumber();
			String make = car.getMake();
			String model = car.getModel();
			int year = car.getYear();
			double price = car.getPrice();
			statement = connection
					.prepareStatement("update car set vin_Number=?,make =?,model=?,year=?, price=? where Vin_Number = ?");

			statement.setString(1, vinNumber);
			statement.setString(2, make);
			statement.setString(3, model);
			statement.setInt(4, year);
			statement.setDouble(5, price);

			int noOfRowsUpdated = statement.executeUpdate();

			if (noOfRowsUpdated != 1) {
				throw new DAOException("Update  failed");
			}

		} catch (SQLException ex) {
			// ex.printStackTrace();
			throw new DAOException(ex,
					"Error while adding a record  to the Database");

		} finally {
			// calling close Resources method to close all resources
			closeResources(connection, statement, resultSet);
		}
	}

	@Override
	public void deleteCar(String vinNumber) throws DAOException {

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			// Calling getConnecting method to get connection
			connection = getConnection();

			statement = connection
					.prepareStatement("Delete car where Vin_Number = ?");

			statement.setString(1, vinNumber);

			int noOfRowsDeleted = statement.executeUpdate();

			if (noOfRowsDeleted != 1) {
				throw new DAOException("Update  failed");
			}

		} catch (SQLException ex) {
			// ex.printStackTrace();
			throw new DAOException(ex,
					"Error while adding a record  to the Database");
		} finally {
			// calling close Resources method to close all resources
			closeResources(connection, statement, resultSet);
		}
	}

	@Override
	public Car findByPrimaryKey(String vinNumber) throws DAOException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			// Calling getConnecting method to get connection
			connection = getConnection();
			statement = connection
					.prepareStatement("Select * from Car where  Vin_Number = ?");

			statement.setString(1, vinNumber);

			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				String vinnumber = resultSet.getString("VIN_NUMBER");
				String make = resultSet.getString("MAKE");
				String model = resultSet.getString("MODEL");
				int year = resultSet.getInt("YEAR");
				double price = resultSet.getDouble("PRICE");
			}

			int noOfRowsUpdated = statement.executeUpdate();

			if (noOfRowsUpdated != 1) {
				throw new DAOException("Update  failed");
			}

		} catch (SQLException ex) {
			// ex.printStackTrace();
			throw new DAOException(ex,
					"Error while selecting a record  from the  Database");

		} finally {
			// calling close Resources method to close all resources
			closeResources(connection, statement, resultSet);
		}
		return null;
	}

}
