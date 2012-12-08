package com.training.java.struts.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.java.struts.domain.Book;
import com.training.java.struts.domain.BookDAO;
import com.training.java.struts.domain.BookDAOJDBCImpl;
import com.training.java.struts.domain.DAOException;

public class ListBooksAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");

		List<Book> books = null;

		try {
			books = dao.getAllBooks();
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("books", books);
		
		return mapping.findForward("ListBooks");
	}

}
