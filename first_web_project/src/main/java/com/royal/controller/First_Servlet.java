package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class First_Servlet extends HttpServlet {

	@Override
	public void init() throws ServletException {

		System.out.println("INTI()");
	
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter out = response.getWriter();	
		out.print("First Servlet");
				
	}
	
	@Override
	public void destroy() {
	
	    System.out.println("Destory()");
	
	}
	
	
}
