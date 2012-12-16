package com.training.java.struts.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.java.struts.domain.BookService;
import com.training.java.struts.domain.BookServiceImpl;

public class DeleteBookAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);
		
		BookService service = new BookServiceImpl();
		service.delete(id);
		
		return mapping.findForward("List");
	}
}
