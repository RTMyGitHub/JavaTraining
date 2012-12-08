package com.training.java.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloAction extends Action {
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		request.setAttribute("Message", "How are you doing?");
		
		//TODO we should call our DAO or service class
		
		return mapping.findForward("hello");
	}
	
	
	
}
