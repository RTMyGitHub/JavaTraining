package com.training.java.struts.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.java.struts.domain.Book;
import com.training.java.struts.domain.BookService;
import com.training.java.struts.domain.BookServiceImpl;

public class SaveBooksAction extends Action {
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		BookForm bookForm = (BookForm) form;
		
		//Convert BookForm into Book object		
		Book book = new Book(bookForm.getId(), bookForm.getTitle(), bookForm.getAuthor(), bookForm.getIsbn(), bookForm.getPages(), new Date());

		//Call BookService and save the details
		BookService service = new BookServiceImpl();

		if(bookForm.isUpdateFlag())
		{
			service.update(book);
		}
		else
		{
			service.addBook(book);
		}
		
		//Send acknowledgement
		return mapping.findForward("Acknowledgement");
		
	}

}
