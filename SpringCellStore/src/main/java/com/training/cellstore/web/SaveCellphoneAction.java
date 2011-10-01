package com.training.cellstore.web;

import javax.servlet.ServletContext;

import org.apache.struts.action.Action;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.training.cellstore.domain.Cellphone;
import com.training.cellstore.service.CellPhoneService;

public class SaveCellphoneAction extends Action {
	public org.apache.struts.action.ActionForward execute(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
	
	cellphoneform  acellphform = (cellphoneform) form; 
	
	System.out.println("CellId: " +acellphform.getCellid());
	System.out.println("Cell Companyname: " +acellphform.getCellCompanyname());
	System.out.println("Model: " +acellphform.getModel());
	System.out.println("Price: " +acellphform.getPrice());
	
	Cellphone bcph= new Cellphone();
	
	bcph.setCellid(acellphform.getCellid());
	bcph.setCellCompanyname(acellphform.getCellCompanyname());
	bcph.setModel(acellphform.getModel());
	bcph.setPrice(acellphform.getPrice());
	
	ServletContext servletContext = servlet.getServletContext();
	WebApplicationContext webAppContext = WebApplicationContextUtils
			.getWebApplicationContext(servletContext);
	CellPhoneService service = webAppContext.getBean(CellPhoneService.class);
	
	service.create(bcph);
		
	return mapping.findForward("acknowledgement");
	};
}
