package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Singup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String name  = request.getParameter("name");
		String fname  = request.getParameter("fname");
		String lname  = request.getParameter("lname");
		String email  = request.getParameter("email");
		String cemail  = request.getParameter("cemail");
		String phno  = request.getParameter("phno");
		String pass  = request.getParameter("pass");
		String cpass  = request.getParameter("cpass");
		
		
		 PrintWriter out =  response.getWriter();
		 
		 out.print("<b>user name: </b>" +name+"<br>");
		 out.print("<b>first name: </b>" +fname+ "<br>");
		 out.print("<b>last name: </b>" +lname+ "<br>");
		 out.print("<b>email: </b>" +email+ "<br>");
		 out.print("<b>confirm email: </b>" +cemail + "<br>");
		 out.print("<b>phone no: </b>" +phno+ "<br>");
		 out.print("<b>password: </b>" +pass+ "<br>");
		 out.print("<b>confirm password: </b>" +cpass+ "<br>");
		 

	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
