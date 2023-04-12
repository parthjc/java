package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		StudentDao sDao = new StudentDao();
		
		int RowAffected = sDao.delete(id);
		
		if(RowAffected > 0) {
			
			request.getRequestDispatcher("StudentDisplayServlet").forward(request, response);
			
		}else {
			out.print("Not Delete Data");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
