package com.jspiders.cardekhowithservlets.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.cardekhowithservlets.jdbc.CarJDBC;

@WebServlet("/update_car1")
public class UpdateCar extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		String property = req.getParameter("property");
		System.out.println(property);
		int res = 0;
		switch (property) {
		case "name":
			String name = req.getParameter("value");
			System.out.println(name);
			res = CarJDBC.updateCarName(id, name);
			break;
		case "model":
			String model = req.getParameter("value");
			System.out.println(model);
			res = CarJDBC.updateCarModel(id, model);
			break;
		case "brand":
			String brand = req.getParameter("value");
			System.out.println(brand);
			res = CarJDBC.updateCarBrand(id, brand);
			break;
		case "price":
			double price = Double.parseDouble(req.getParameter("value"));
			System.out.println(price);
			res = CarJDBC.updateCarPrice(id, price);
			break;
		case "fuelType":
			String fuelType = req.getParameter("value");
			System.out.println(fuelType);
			res = CarJDBC.updateCarFuelType(id, fuelType);
			break;
		case "colour":
			String colour = req.getParameter("value");
			System.out.println(colour);
			res = CarJDBC.updateCarColour(id, colour);
			break;
		default:
			break;
		}
		if (res == 1) {
			req.setAttribute("message", "Car value updated");
		} else {
			req.setAttribute("message", "Car not found!");
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("update_car1.jsp");
		requestDispatcher.forward(req, resp);
	}
}
