package com.training.java.redbox;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.training.java.redbox.domain.Customer;
import com.training.java.redbox.domain.CustomerDAO;
import com.training.java.redbox.domain.CustomerDaoJdbcImpl;
import com.training.java.redbox.domain.CustomerService;
import com.training.java.redbox.domain.DAOException;
import com.training.java.redbox.domain.ServiceException;

public class SaveCustomerAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		
		CustomerForm customerForm = (CustomerForm) form;
		
		System.out.println(customerForm);

		Customer customer = new Customer(0, customerForm.getFirstName(), customerForm.getLastName());
		customer.setAddress(customerForm.getAddress());
		customer.setCity(customerForm.getCity());
		customer.setState(customerForm.getState());
		customer.setZipCode(customerForm.getZipCode());
		customer.setUserName(customerForm.getUserName());
		customer.setPassword(customerForm.getPassword());
		
		
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServlet().getServletContext());
		CustomerService service = context.getBean(CustomerService.class);
		

		try {
			service.addCustomer(customer);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		return mapping.findForward("login");


	}

}
