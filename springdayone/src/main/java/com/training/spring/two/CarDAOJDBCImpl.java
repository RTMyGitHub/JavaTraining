package com.training.spring.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class CarDAOJDBCImpl implements CarDAO
{

	CarDAOJDBCImpl()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e)
		{
			throw new DAOException(e);
		}
	}

	@Override
	public List<Car> getAllCars()
	{

		List<Car> cars = new ArrayList<Car>();

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try
		{
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from car");

			while (rs.next())
			{
				int id = rs.getInt("id");

				String type = rs.getString("type");
				String make = rs.getString("make");
				String model = rs.getString("model");
				int year = rs.getInt("year");
				double price = rs.getDouble("price");

				Car car = new Car(id, type, make, model, year, price);
				cars.add(car);
			}
			return cars;
		} catch (SQLException e)
		{
			throw new DAOException(e);
		} finally
		{
			closeResources(rs, stmt, con);
		}
	}

	@Override
	public void createCar(Car car)
	{

		Connection con = null;
		PreparedStatement stmt = null;

		try
		{
			con = getConnection();
			stmt = con
					.prepareStatement("insert into car(type, make, model, year, price) values(?,?,?,?,?)");

			stmt.setString(1, car.getType());
			stmt.setString(2, car.getMake());
			stmt.setString(3, car.getModel());
			stmt.setInt(4, car.getYear());
			stmt.setDouble(5, car.getPrice());

			stmt.execute();

		} catch (SQLException e)
		{
			throw new DAOException(e);
		} finally
		{
			closeResources(null, stmt, con);
		}
	}

	@Override
	public Car getCarById(int id)
	{
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		Car car = null;
		try
		{
			con = getConnection();
			stmt = con.prepareStatement("select * from car where id = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();

			if (rs.next())
			{
				String type = rs.getString("type");
				String make = rs.getString("make");
				String model = rs.getString("model");
				int year = rs.getInt("year");
				double price = rs.getDouble("price");

				car = new Car(id, type, make, model, year, price);
			}
			return car;

		} catch (SQLException e)
		{
			throw new DAOException(e);
		} finally
		{
			closeResources(null, stmt, con);
		}
	}

	private Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection("jdbc:mysql://localhost/training",
				"root", "password");

	}

	private void closeResources(ResultSet rs, Statement stmt, Connection con)
	{
		if (rs != null)
		{
			try
			{
				rs.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		if (stmt != null)
		{
			try
			{
				stmt.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		if (con != null)
		{
			try
			{
				con.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}

	}

	@Override
	public void update(Car car)
	{
		{
			Connection con = null;
			PreparedStatement stmt = null;

			try
			{
				con = getConnection();
				stmt = con
						.prepareStatement("update car set type = ?, make = ?, model= ?, year = ?, price = ? where id = ?");
				
				stmt.setString(1, car.getType());
				stmt.setString(2, car.getMake());
				stmt.setString(3, car.getModel());
				stmt.setInt(4, car.getYear());
				stmt.setDouble(5, car.getPrice());
				stmt.setInt(6, car.getId());

				stmt.execute();

			} catch (SQLException e)
			{
				throw new DAOException(e);
			} finally
			{
				closeResources(null, stmt, con);
			}
		}
	}

	@Override
	public void delete(int id)
	{
		Connection con = null;
		PreparedStatement stmt = null;

		try
		{
			con = getConnection();
			stmt = con.prepareStatement("delete from car where id = ?");
			stmt.setInt(1, id);
			stmt.execute();

		} catch (SQLException e)
		{
			throw new DAOException(e);
		} finally
		{
			closeResources(null, stmt, con);
		}
	}
}
