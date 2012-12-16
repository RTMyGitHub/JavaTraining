package com.training.java.struts.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.java.struts.domain.Book;
import com.training.java.struts.domain.BookService;
import com.training.java.struts.domain.BookServiceImpl;

public class UpdateBookAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		BookForm bookForm = (BookForm) form;
		
		BookService service = new BookServiceImpl();
		Book book = service.getById(bookForm.getId());
		
		bookForm.setAuthor(book.getAuthor());
		bookForm.setIsbn(book.getIsbn());
		bookForm.setPages(book.getPages());
		bookForm.setTitle(book.getTitle());
		bookForm.setUpdateFlag(true);
		
		return mapping.findForward("UpdateBook");
		
	}

}
