package com.jspiders.cardekhowithservlets.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.cardekhowithservlets.jdbc.CarJDBC;

@WebServlet("/add_car")
public class AddCar extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String model = req.getParameter("model");
		String brand = req.getParameter("brand");
		String fuelType = req.getParameter("fuelType");
		double price = Double.parseDouble(req.getParameter("price"));
		String colour = req.getParameter("colour");
		int res = CarJDBC.addCar(id, name, model, brand, fuelType, price, colour);
		if (res == 1) {
			req.setAttribute("message", "Car Added");
		}
		else {
			req.setAttribute("message", "Car Not Added");
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("add_car.jsp");
		requestDispatcher.forward(req, resp);
	}

}
