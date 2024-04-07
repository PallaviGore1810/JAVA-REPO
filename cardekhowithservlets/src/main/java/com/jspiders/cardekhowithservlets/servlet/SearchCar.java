package com.jspiders.cardekhowithservlets.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.cardekhowithservlets.jdbc.CarJDBC;
import com.jspiders.cardekhowithservlets.object.Car;

@WebServlet("/search_car1")
public class SearchCar extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String property = req.getParameter("property");
		System.out.println(property);
		List<Car> cars= new ArrayList<Car>();
		switch (property) {
		case "name":
			String name = req.getParameter("value");
			System.out.println(name);
			cars = CarJDBC.searchCarByName(name);
			break;
		case "model":
			String model = req.getParameter("value");
			System.out.println(model);
		    cars = CarJDBC.searchCarByModel(model);
			break;
		case "brand":
			String brand = req.getParameter("value");
			System.out.println(brand);
			cars = CarJDBC.searchCarByBrand(brand);
			break;
		case "price":
			double price = Double.parseDouble(req.getParameter("value"));
			System.out.println(price);
			cars = CarJDBC.searchCarByPrice(price);
			break;
		case "fuelType":
			String fuelType = req.getParameter("value");
			System.out.println(fuelType);
			cars = CarJDBC.searchCarByFuelType(fuelType);
			break;
		case "colour":
			String colour = req.getParameter("value");
			System.out.println(colour);
			cars = CarJDBC.searchCarByColour(colour);
			break;
		default:
			break;
		}
		req.setAttribute("cars", cars);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("search_car1.jsp");
		requestDispatcher.forward(req, resp);
	}
}
