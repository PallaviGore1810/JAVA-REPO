package com.jspiders.servlets.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student_info")
public class StudentInfo extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long mobile = Long.parseLong(req.getParameter("mobile"));
		int age = Integer.parseInt(req.getParameter("age"));
		String[] gender = req.getParameterValues("gender");
		String[] courses = req.getParameterValues("course");

//		for (int i=0;i<courses.length;i++) {
//			String course1=courses[i];
//		}
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<p>Id :" + id + "<br>" + "Name :" + name + "<br>" + "Email :" + email + "<br>" + "Mobile :"
				+ mobile + "<br>" + "Age :" + age + "<br>" + "Gender :" + gender + "<br>" + "Courses :" + courses
				+ "<br>" + "</p>");
	}
}
