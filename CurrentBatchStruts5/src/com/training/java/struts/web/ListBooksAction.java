package com.training.java.struts.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.java.struts.domain.Book;
import com.training.java.struts.domain.BookService;
import com.training.java.struts.domain.BookServiceImpl;

public class ListBooksAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		BookService service = new BookServiceImpl();
		List<Book> books = service.getAllBooks();
		
		request.setAttribute("venkat", books);
		
		return mapping.findForward("ListBooks");
	}

}
