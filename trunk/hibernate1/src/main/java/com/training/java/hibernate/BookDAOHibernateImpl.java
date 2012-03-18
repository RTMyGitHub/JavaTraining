package com.training.java.hibernate;

import java.util.List;

import org.hibernate.Session;

public class BookDAOHibernateImpl implements BookDAO
{

	@Override
	public void create(Book aNewBook) throws DAOException
	{
		Session session = null;
		try
		{
			session = HibernateUtil.getSessionFactory().getCurrentSession();

			session.getTransaction().begin();
			session.save(aNewBook);
			session.getTransaction().commit();
		} finally
		{
			session.close();
		}
	}

	@Override
	public List<Book> getAllBooks() throws DAOException
	{
		Session session = null;
		try
		{
			session = HibernateUtil.getSessionFactory().getCurrentSession();

			session.getTransaction().begin();
			List<Book> books = session.createCriteria(Book.class).list();
			session.getTransaction().commit();

			return books;
		} finally
		{
			session.close();
		}
	}

	@Override
	public Book findByPrimaryKey(int id) throws DAOException
	{
		Session session = null;
		try
		{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			Book book = (Book) session.get(Book.class, id);
			session.getTransaction().commit();

			return book;
		} finally
		{
			session.close();
		}
	}

	@Override
	public void update(Book bookToUpdate) throws DAOException
	{
		Session session = null;
		try
		{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			session.update(bookToUpdate);
			session.getTransaction().commit();
		} finally
		{
			session.close();
		}
	}

	@Override
	public void delete(int id) throws DAOException
	{
		Session session = null;
		try
		{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();

			Book bookToDelete = new Book();
			bookToDelete.setId(id);

			session.delete(bookToDelete);
			session.getTransaction().commit();
		} finally
		{
			session.close();
		}
	}

}
