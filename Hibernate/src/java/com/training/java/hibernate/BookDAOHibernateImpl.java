package com.training.java.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookDAOHibernateImpl implements BookDAO {

	private SessionFactory sessionFactory;

	public BookDAOHibernateImpl() {
		// A SessionFactory is set up once for an application
		sessionFactory = new Configuration().configure() // configures settings from hibernate.cfg.xml
				.buildSessionFactory();
	}

	@Override
	public void create(Book aNewBook) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Book> getAllBooks() throws DAOException {
	
		Session session = sessionFactory.openSession();
		
		return (List<Book>) session.createCriteria(Book.class).list();
	}

	@Override
	public Book findByPrimaryKey(int id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Book bookToUpdate) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) throws DAOException {
		// TODO Auto-generated method stub

	}

}
