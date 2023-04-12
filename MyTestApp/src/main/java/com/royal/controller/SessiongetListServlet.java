package com.royal.controller;

import java.io.IOException;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessiongetListServlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String phno = request.getParameter("number");
		
		HttpSession session = request.getSession();
		
		HashMap<String, String> dataall =  (HashMap<String, String>) session.getAttribute("data");
				
		if(dataall == null) {
			
			dataall = new HashMap<>();
		}
		
		dataall.put(name, phno);
		
	  
	
	    session.setAttribute("data",dataall);
	    
	    request.getRequestDispatcher("Loginlist.jsp").forward(request, response);
	}
	
}
