package com.training.java.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.java.jdbc.dao.Book;
import com.training.java.jdbc.dao.BookDAO;
import com.training.java.jdbc.dao.BookDAOJDBCImpl;

public class SaveBookAction extends Action
{
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{

		BookForm bookForm = (BookForm) form;
		System.out.println("bookForm ID " + bookForm.getId());
		System.out.println("bookForm Title " + bookForm.getTitle());
		System.out.println("bookForm Author " + bookForm.getAuthor());
		System.out.println("bookForm ISBN " + bookForm.getIsbn());
		System.out.println("bookForm Pages " + bookForm.getPages());
		System.out
				.println("bookForm Publisher Id " + bookForm.getPublisherId());

		Book book = new Book();
		book.setAuthor(bookForm.getAuthor());
		book.setId(bookForm.getId());
		book.setIsbn(bookForm.getIsbn());
		book.setPages(bookForm.getPages());
		book.setPublisherId(bookForm.getPublisherId());
		book.setTitle(bookForm.getTitle());

		BookDAO bookDAO = new BookDAOJDBCImpl(
				"jdbc:mysql://localhost/training", "root", "password");
		bookDAO.create(book);
		
		return mapping.findForward("success");
	}
}
