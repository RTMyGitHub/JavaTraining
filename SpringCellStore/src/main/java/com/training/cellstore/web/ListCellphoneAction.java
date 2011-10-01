package com.training.cellstore.web;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.training.cellstore.domain.Cellphone;
import com.training.cellstore.service.CellPhoneService;

public class ListCellphoneAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		
		ServletContext servletContext = servlet.getServletContext();
		WebApplicationContext webAppContext = WebApplicationContextUtils
				.getWebApplicationContext(servletContext);
		CellPhoneService service = webAppContext.getBean(CellPhoneService.class);
		
		List<Cellphone> cellphones = service.getcellphones();
		
		request.setAttribute("RajCellphones", cellphones);

		return mapping.findForward("listCellphones");
	}

}
