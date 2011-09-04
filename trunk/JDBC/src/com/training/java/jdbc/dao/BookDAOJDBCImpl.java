package com.training.java.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDAOJDBCImpl implements BookDAO {
	String dburl;
	String dbusername;
	String dbpassword;

	public BookDAOJDBCImpl(String dburl, String dbusername, String dbpassword) {
		this.dburl = dburl;
		this.dbusername = dbusername;
		this.dbpassword = dbpassword;
	}

	public void create(Book bookToAdd) throws DAOException {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = getConnection();
			stmt = con
					.prepareStatement("insert into book(id,title,author,isbn,pages,publisher_id) values(?, ?, ?,?,?, ?);");

			stmt.setInt(1, bookToAdd.getId());
			stmt.setString(2, bookToAdd.getTitle());
			stmt.setString(3, bookToAdd.getAuthor());
			stmt.setString(4, bookToAdd.getIsbn());
			stmt.setInt(5, bookToAdd.getPages());
			stmt.setInt(6, bookToAdd.getPublisherId());

			int numberOfRowsAffected = stmt.executeUpdate();

			if (numberOfRowsAffected != 1) {
				throw new DAOException(
						"Error occured while creating new book..");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException(e);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e);
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public List<Book> getAllBooks() throws DAOException {
		List<Book> books = new ArrayList<Book>();

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from book");

			Book aBook = null;
			while (rs.next()) {
				// Create a Book object
				aBook = new Book();

				// Retrieve all the book details from database for each record
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String isbn = rs.getString("isbn");
				int pages = rs.getInt("pages");
				int publisherId = rs.getInt("publisher_id");

				// Populate all the details into Book object
				aBook.setId(id);
				aBook.setTitle(title);
				aBook.setAuthor(author);
				aBook.setIsbn(isbn);
				aBook.setPages(pages);
				aBook.setPublisherId(publisherId);

				// Now, add each book to books List
				books.add(aBook);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException(e);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return books;
	}

	public void update(Book bookToUpdate) throws DAOException {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = getConnection();
			stmt = con.prepareStatement("update book set title = ?,"
					+ "author = ?," + "isbn = ?," + "pages = ?,"
					+ "publisher_id = ? where id = ?");

			stmt.setString(1, bookToUpdate.getTitle());
			stmt.setString(2, bookToUpdate.getAuthor());
			stmt.setString(3, bookToUpdate.getIsbn());
			stmt.setInt(4, bookToUpdate.getPages());
			stmt.setInt(5, bookToUpdate.getPublisherId());
			stmt.setInt(6, bookToUpdate.getId());

			int numberOfRowsAffected = stmt.executeUpdate();

			if (numberOfRowsAffected != 1) {
				throw new DAOException("Error occured while updating book..");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException(e);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e);
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public Book findByPrimaryKey(int id) throws DAOException {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			stmt = con.prepareStatement("select * from book where id = ?");

			stmt.setInt(1, id);
			rs = stmt.executeQuery();

			// Create a Book object
			Book aBook = null;

			while (rs.next()) {
				aBook = new Book();
				// Retrieve all the book details from database for each record
				String title = rs.getString("title");
				String author = rs.getString("author");
				String isbn = rs.getString("isbn");
				int pages = rs.getInt("pages");
				int publisherId = rs.getInt("publisher_id");

				// Populate all the details into Book object
				aBook.setId(id);
				aBook.setTitle(title);
				aBook.setAuthor(author);
				aBook.setIsbn(isbn);
				aBook.setPages(pages);
				aBook.setPublisherId(publisherId);
			}

			return aBook;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException(e);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void delete(int id) throws DAOException {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = getConnection();
			stmt = con.prepareStatement("delete from book where id = ?");

			stmt.setInt(1, id);
			int numberOfRowsAffected = stmt.executeUpdate();

			if (numberOfRowsAffected != 1) {
				throw new DAOException("Error occured while updating book..");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException(e);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e);
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dburl, dbusername,
				dbpassword);
		return con;
	}
}
