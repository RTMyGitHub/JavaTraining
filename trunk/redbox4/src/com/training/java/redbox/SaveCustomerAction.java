package com.training.java.redbox;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.training.java.redbox.domain.Customer;
import com.training.java.redbox.domain.CustomerService;
import com.training.java.redbox.domain.ServiceException;

public class SaveCustomerAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		CustomerForm customerForm = (CustomerForm) form;

		Customer customer = new Customer(0, customerForm.getFirstName(),
				customerForm.getLastName());
		customer.setAddress(customerForm.getAddress());
		customer.setCity(customerForm.getCity());
		customer.setState(customerForm.getState());
		customer.setZipCode(customerForm.getZipCode());
		customer.setUserName(customerForm.getUserName());
		customer.setPassword(customerForm.getPassword());

		System.out.println(customerForm);
		
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServlet().getServletContext());
		CustomerService service = context.getBean(CustomerService.class);

		try {
			service.addCustomer(customer);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		return mapping.findForward("login");

	}

}
