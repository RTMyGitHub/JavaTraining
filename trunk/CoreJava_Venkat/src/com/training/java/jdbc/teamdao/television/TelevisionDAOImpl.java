package com.training.java.jdbc.teamdao.television;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class  TelevisionDAOImpl implements TelevisionDAO{
	private String jdbcUrl;
	private String userName;
	private String password;
	
	public TelevisionDAOImpl(String jdbcurl, String username,String password)
	{
		this.jdbcUrl = jdbcurl;
		this.userName = username;
		this.password = password;
	}

	@Override
	public List<Television> getAllTelevision() throws DAOException {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		List<Television> tel = new ArrayList<Television>();

		try{
			connection=getConnection();
			statement = connection.createStatement();
			resultSet= statement.executeQuery("select * from television ");
	   
			while (resultSet.next())
			{
			   int id = resultSet.getInt("tv_id");
			   String company =resultSet.getString("company");
			   String type = resultSet.getString("type");
			   
			   String enable3DStr = resultSet.getString("enable_3d");
			   String priceStr=resultSet.getString("price");
			   
			   double price=Double.parseDouble(priceStr);
			   Television television=new Television(id, company, type, "Y".equals(enable3DStr), price);
			   tel.add(television);
		   }
			
			return tel;
		}
		catch(SQLException e )
		{
			throw new DAOException(e);
		}
		finally
		{
			closeResource(resultSet,statement,connection);
		}
	}

	private Connection getConnection() throws DAOException {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			return DriverManager.getConnection(jdbcUrl, userName, password);
			
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			throw new DAOException(e);
			
		}catch(SQLException ex)
		{
			throw new DAOException(ex);
		}
		

	}
	private void closeResource(ResultSet resultSet, Statement statement, Connection connection)

	{
		if(resultSet!=null)
		{
			try
			{
				resultSet.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				
			}
			
			
		}
		if(statement!=null)
		{
			try
			{
				statement.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				
			}
			
			
		}
		if(connection!=null)
		{
			try
			{
				connection.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				
			}
			
			
		}
	}
}
