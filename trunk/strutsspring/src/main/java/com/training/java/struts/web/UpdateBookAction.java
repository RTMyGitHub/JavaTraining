package com.training.java.struts.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.training.java.struts.domain.Book;
import com.training.java.struts.domain.BookService;

public class UpdateBookAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		BookForm bookForm = (BookForm) form;
		
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServlet().getServletContext());
		BookService service = context.getBean(BookService.class);

		Book book = service.getById(bookForm.getId());
		
		bookForm.setAuthor(book.getAuthor());
		bookForm.setIsbn(book.getIsbn());
		bookForm.setPages(book.getPages());
		bookForm.setTitle(book.getTitle());
		bookForm.setUpdateFlag(true);
		
		return mapping.findForward("UpdateBook");
		
	}

}
