package com.training.struts.car.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.struts.car.domain.Car;
import com.training.struts.car.domain.CarService;
import com.training.struts.car.domain.CarServiceImpl;

public class ListCarAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		CarService service = new CarServiceImpl();
		List<Car> cars = service.getAllCars();
		
		request.setAttribute("cars", cars);
		
		return mapping.findForward("list");
	}
}
