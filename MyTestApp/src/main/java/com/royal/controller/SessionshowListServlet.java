package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionshowListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		HashMap<String, String> dataall = (HashMap<String, String>) session.getAttribute("data");
		
	    Set<String> names = dataall.keySet();
	    
	    PrintWriter out =  response.getWriter();
	    
	    for(String name: names ) {
	    	
	    	String number = dataall.get(name);
	    		    	
	    	out.print("Name: "+name +"<br>");
	    	out.print("Numbers: "+ number+ "<br>");
	    }
		
	}
}
