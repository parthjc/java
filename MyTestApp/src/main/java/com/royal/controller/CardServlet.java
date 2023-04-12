package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.naming.Context;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CardServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Random rnd = new Random();
	
		String cardno = (rnd.nextFloat()+ "").substring(2,6) 
				+"-"+(rnd.nextFloat()+ "").substring(2,6)
				+"-"+(rnd.nextFloat()+ "").substring(2,6)
				+"-"+(rnd.nextFloat()+ "").substring(2,6);
		
		
		out.print("<ol>");
		for(int i =0; i<10; i++) {
			
			out.print("<li>");
			out.print("<h3>" +cardno+  "</h3>");
			out.print("</li>");
		}
		
		out.print("</ol>");
	
		ServletContext context = getServletContext();
		
		out.print("ContextName-> " +context.getInitParameter("myapp"));
	
	}
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
