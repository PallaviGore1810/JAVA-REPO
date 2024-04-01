package com.jspiders.servlets.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emp_reg")
public class EmpReg extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("ename");
		String email = req.getParameter("email");
		String dept = req.getParameter("select1");
		String add = req.getParameter("address");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<p>Employee Name :" + name + "<br>" + "Employee Email :" + email + "<br>"
				+ "Employee Department :" + dept + "<br>" + "Employee Add :" + add + "<br>"
				+ "<h2>Registration Completed!!!</h2>" + "</p>");
	}

}
