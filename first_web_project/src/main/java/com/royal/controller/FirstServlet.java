package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("START :: FIRSTSERVLET");
//		
//		    RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//		
//		    rd.forward(request, response);
		    
	    response.sendRedirect("ThirdServlet");

		
		    System.out.println("Exit :: FIRSTSERVLET");
		    
		    
		    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
