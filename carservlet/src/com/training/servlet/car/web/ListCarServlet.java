package com.training.servlet.car.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.servlet.car.domain.Car;
import com.training.servlet.car.domain.CarService;
import com.training.servlet.car.domain.CarServiceImpl;

/**
 * Servlet implementation class ListCarServlet
 */
public class ListCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListCarServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Read context parameters
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String username = getServletContext().getInitParameter("username");
		String password = getServletContext().getInitParameter("password");
		
		System.out.println("jdbcURL = " + jdbcURL);
		System.out.println("username = " + username);
		System.out.println("password = " + password);
		
		//Get init param - max cars to display
		String maxCarsDisplyStr = getServletConfig().getInitParameter("maxCarsToDisplay");
		int maxCarsToDisplay = Integer.parseInt(maxCarsDisplyStr);
		
		CarService service = new CarServiceImpl();
		List<Car> cars = service.getAllCars();
		
		request.setAttribute("carsToDisplay", cars);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/displayList");
		dispatcher.forward(request, response);
	}

}
