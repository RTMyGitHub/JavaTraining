package com.training.java.jdbc.dao.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookDAOJDBCImpl implements BookDAO {
	
	private String jdbcURL;
	private String username;
	private String password;

	public BookDAOJDBCImpl(String jdbcURL, String username, String password)
	{
		this.jdbcURL = jdbcURL;
		this.username = username;
		this.password = password;
	}
	
	
	@Override
	public List<Book> getAllBooks() throws DAOException {
		
		List<Book> books = new ArrayList<Book>();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try
		{
			connection = getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from book");
			
			while(resultSet.next())
			{
				int id = resultSet.getInt("book_id");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				int pages = resultSet.getInt("number_of_pages");
				String isbn = resultSet.getString("isbn");
				Date publisherDate = resultSet.getDate("pub_date");
				
				Book book = new Book(id, title, author, isbn, pages, publisherDate);
				
				books.add(book);
			}
		}
		catch(SQLException ex)
		{
			throw new DAOException(ex);
		}
		finally
		{
			closeResources(resultSet, statement, connection);
		}
		
		return books;
	}

	@Override
	public void addBook(Book book) throws DAOException {
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try
		{
			connection = getConnection();
			String author = book.getAuthor();
			String isbn = book.getIsbn();
			String title = book.getTitle();
			int pages = book.getPages();
			java.sql.Date publisherDate = new java.sql.Date(book.getPublisherDate().getTime());
			
			statement = connection.prepareStatement("insert into book values(book_id_seq.nextval, ?, ?, ?, ?, ?, ?)");
			
			statement.setString(1, title);
			statement.setString(2, author);
			statement.setInt(3, pages);
			statement.setString(4, isbn);
			statement.setDate(5, publisherDate);
			statement.setInt(6, 1);
			
			int numberOfRowsInserted = statement.executeUpdate();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
			throw new DAOException(ex);
		}
		finally
		{
			closeResources(resultSet, statement, connection);
		}
	}

	@Override
	public void updateBook(Book book) throws DAOException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try
		{
			connection = getConnection();
			int id = book.getId();
			String author = book.getAuthor();
			String isbn = book.getIsbn();
			String title = book.getTitle();
			int pages = book.getPages();
			java.sql.Date publisherDate = new java.sql.Date(book.getPublisherDate().getTime());
			
			statement = connection.prepareStatement("update book set title = ?, author = ?, number_of_pages = ?, isbn = ?, pub_date = ? where book_id = ?");
			
			statement.setString(1, title);
			statement.setString(2, author);
			statement.setInt(3, pages);
			statement.setString(4, isbn);
			statement.setDate(5, publisherDate);
			
			statement.setInt(6, id);
			
			int numberOfRowsUpdate = statement.executeUpdate();
			
			if(numberOfRowsUpdate != 1)
			{
				throw new DAOException("Update book failed!!");
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
			throw new DAOException(ex);
		}
		finally
		{
			closeResources(resultSet, statement, connection);
		}
	}

	@Override
	public void deleteBook(int bookId) throws DAOException {
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try
		{
			connection = getConnection();
			
			statement = connection.prepareStatement("delete book where book_id = ?");
			statement.setInt(1, bookId);
			
			int numberOfRowsDeleted = statement.executeUpdate();
			
			if(numberOfRowsDeleted != 1)
			{
				throw new DAOException("Delete book failed!!");
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
			throw new DAOException(ex);
		}
		finally
		{
			closeResources(resultSet, statement, connection);
		}
	}

	@Override
	public Book findByPrimaryKey(int bookId) throws DAOException {
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try
		{
			connection = getConnection();
			statement = connection.prepareStatement("select * from book where book_id = ?");
			
			statement.setInt(1, bookId);
			
			resultSet = statement.executeQuery();
			
			if(resultSet.next())
			{
				int id = resultSet.getInt("book_id");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				int pages = resultSet.getInt("number_of_pages");
				String isbn = resultSet.getString("isbn");
				Date publisherDate = resultSet.getDate("pub_date");
				
				return new Book(id, title, author, isbn, pages, publisherDate);
			}
			
			throw new DAOException("Invalid book id provided!!");
		}
		catch(SQLException ex)
		{
			throw new DAOException(ex);
		}
		finally
		{
			closeResources(resultSet, statement, connection);
		}
	}
	
	private Connection getConnection() throws DAOException
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection(jdbcURL, username, password);
		} catch (ClassNotFoundException ex) {
			throw new DAOException(ex);
		}
		catch(SQLException ex)
		{
			throw new DAOException(ex);
		}
		
	}
	
	private void closeResources(ResultSet resultSet, Statement statement, Connection connection)
	{
		if(resultSet != null)
		{
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(statement != null)
		{
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(connection != null)
		{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
