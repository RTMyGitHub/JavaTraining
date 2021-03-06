package com.training.java.struts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloWorldAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		System.out.println("HelloWorldAction is called");
		
		String name = request.getParameter("name");
		
		if(name != null && name.equalsIgnoreCase("ankita"))
		{
			return mapping.findForward("ankita");
		}
		else
		{
			return mapping.findForward("hello");
		}
	}

}
