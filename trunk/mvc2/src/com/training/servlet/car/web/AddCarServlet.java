package com.training.servlet.car.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.servlet.car.domain.Car;
import com.training.servlet.car.domain.CarService;
import com.training.servlet.car.domain.CarServiceImpl;

/**
 * Servlet implementation class AddCarServlet
 */
public class AddCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCarServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idStr = request.getParameter("id");
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String yearStr = request.getParameter("year");
		String priceStr = request.getParameter("price");
		
		int id = Integer.parseInt(idStr);
		int year = Integer.parseInt(yearStr);
		double price = Double.parseDouble(priceStr);
		
		Car car = new Car(id, make, model, year, price);
		
		CarService service = new CarServiceImpl();
		service.create(car);
		
		response.sendRedirect("/carservlet/list");
	}

}
