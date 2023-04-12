package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.xml.crypto.Data;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		PrintWriter out =response.getWriter();
		
		Date date = new Date();
		
		out.print("<h1>DateServlet-> " + date + "</h1>");
		
        ServletContext context = getServletContext();
		
		out.print("ContextName-> " +context.getInitParameter("myapp"));
		out.print("<br>");
		
        ServletConfig config = getServletConfig();
		
        int rupee = Integer.parseInt(config.getInitParameter("test"));
        
		out.print("ConfigName-> " +rupee*5);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}


}
