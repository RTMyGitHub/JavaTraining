package com.training.java.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		transaction.begin();
		
		session.save(aNewBook);
		
		transaction.commit();
	}

	@Override
	public List<Book> getAllBooks() throws DAOException {
	
		Session session = sessionFactory.openSession();
		
		return (List<Book>) session.createCriteria(Book.class).list();
	}

	@Override
	public Book findByPrimaryKey(Integer id) throws DAOException {

		Session session = sessionFactory.openSession();
		return (Book) session.get(Book.class, id);
	}

	@Override
	public void update(Book bookToUpdate) throws DAOException {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();

		transaction.begin();
		session.update(bookToUpdate);
		transaction.commit();
	}

	@Override
	public void delete(int id) throws DAOException {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		
		Book bookToDelete = new Book();
		bookToDelete.setId(id);
		
		transaction.begin();
		session.delete(bookToDelete);
		transaction.commit();
	}

}
