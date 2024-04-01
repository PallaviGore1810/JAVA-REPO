package com.jspiders.servlets.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sign_up")
public class SignUpPage extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String mobile = req.getParameter("mobile");
		String password = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<p>Name is : " + fname + " " + lname + "<br>" + "Email is : " + email + "<br>" + "Mobile is : "
				+ mobile + "<br>" + "DOB is : " + dob + "<br>" + "Password is : " + password + "<br>"
				+ "<h2>Sign Up Successful!</h2>" + "</p>");
	}
}
