package com.training.cellstore.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;





public class CellphoneDAOJDBCImpl implements CellphoneDAO {

	
	private String dbUrl;
	private String dbUsername;
	private String dbPassword;
	
	//constructor
	public CellphoneDAOJDBCImpl(String dbUrl, String dbUsername,
			String dbPassword) {
		super();
		this.dbUrl = dbUrl;
		this.dbUsername = dbUsername;
		this.dbPassword = dbPassword;
	}

	private Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver is loaded");
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		return con;
	}

	@Override
	public void create(Cellphone cp) throws CellphoneDAOException {
		// TODO Auto-generated method stub
		
		Connection con=null;
		PreparedStatement stmt=null;
		try
		{
			con=getConnection();
			stmt=con.prepareStatement("insert into cellphone(cellid,cellCompanyname,model, price) values (?,?,?,?)");
			stmt.setInt(1,cp.getCellid());
			stmt.setString(2, cp.getCellCompanyname());
			stmt.setString(3, cp.getModel());
			stmt.setFloat(4,cp.getPrice());
			
			int rowsAffected=stmt.executeUpdate();
			
			if (rowsAffected !=1)
			{
				System.out.println("Error occured while updating the record");
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(CellphoneDAOException e1)
		{
			e1.printStackTrace();
		}
		finally
		{
			if(stmt != null)
			try
			{
				stmt.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			if(con !=null)
			try
			{
					con.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
	//method to getcellphones from db
	
	public List<Cellphone> getcellphones()
	{
		Connection con =null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		List<Cellphone> cellphones= new ArrayList<Cellphone>();
		try
		{
			con=getConnection();
			stmt= con.prepareStatement("select * from cellphone");
			rs= stmt.executeQuery();
			
			while (rs.next())
			{
				Cellphone acp=new Cellphone();
				acp.setCellid(rs.getInt("cellid"));
				acp.setCellCompanyname(rs.getString("cellCompanyname"));
				acp.setModel(rs.getString("model"));
				acp.setPrice(rs.getFloat("price"));
				cellphones.add(acp);
			}
		}
		catch(SQLException e)
		{	e.printStackTrace();	}
		catch(ClassNotFoundException e)
		{	e.printStackTrace();	}
		/*finally
		{
			if (stmt != null)
			try
			{	stmt.close();	}
			catch (SQLException e)
			{	e.printStackTrace();	}
		}*/
		return cellphones;
	}


	


	@Override
	public Cellphone findByPrimaryKey(int cellid) {
		// TODO Auto-generated method stub
		Cellphone a1=null;
		Connection con=null;
		PreparedStatement stmt=null;
		try
		{
			con=getConnection();
			 stmt= con.prepareStatement("Select * from cellphone where cellid =?");
			stmt.setInt(1,cellid);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next())
			{
				a1=new Cellphone();
				a1.setCellid(rs.getInt("cellid"));
				a1.setCellCompanyname(rs.getString("cellCompanyname"));
				a1.setModel(rs.getString("model"));
				a1.setPrice(rs.getFloat("price"));
							
			}
			
		}
		catch(SQLException e)
		{	e.printStackTrace();	}
		catch(ClassNotFoundException e)
		{	e.printStackTrace();	}
		/*finally
		{
			if (stmt != null)
			try
			{	stmt.close();	}
			catch (SQLException e)
			{	e.printStackTrace();	}
		}*/
				return a1;
	}
	
	@Override
	public void Update(Cellphone cp) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement stmt = null;
		ResultSet rs= null;
		try
		{
			con=getConnection();
			stmt=con.prepareStatement("update cellphone set cellCompanyname=?," +"model=?," +"price=?"+ "where cellid=?" );

			stmt.setString(1,cp.getCellCompanyname());
			stmt.setString(2,cp.getModel());
			stmt.setFloat(3,cp.getPrice());
			stmt.setInt(4, cp.getCellid());
			
			int noOfRowsAffected=stmt.executeUpdate();
			
			if (noOfRowsAffected !=1)
			{
				throw new CellphoneDAOException("Error has occured while updating record.");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (stmt !=null)
			try 
			{	stmt.close();	}
			catch(SQLException e)
			{	e.printStackTrace();	}
			if (con !=null)
			try
			{	con.close();	}
			catch(SQLException e)
			{	e.printStackTrace();	}
		}
		
	}//end of update method.
	
	
	//Method to delete record from 
	
	public void delete(int cellid)
	{
		Connection con=null;
		PreparedStatement stmt=null;
		
		try
		{
			con=getConnection();
			stmt=con.prepareStatement("delete from cellphone where cellid= ?");
			stmt.setInt(1, cellid);
			
			int noOfRowsAffected=stmt.executeUpdate();
			if (noOfRowsAffected != 1)			{
				throw new CellphoneDAOException("Error has occured while deleting the record");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (stmt !=null)
			try 
			{	stmt.close();	}
			catch(SQLException e)
			{	e.printStackTrace();	}
			if (con !=null)
			try
			{	con.close();	}
			catch(SQLException e)
			{	e.printStackTrace();	}
		}
		
	}//end of delete method.
		
}		
			
			
		
		
	
	
			
	
				
				
		
			
	
	

	


