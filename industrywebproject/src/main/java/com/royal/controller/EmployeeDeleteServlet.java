package com.royal.controller;

import java.io.IOException;

import com.royal.dao.EmployeeDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("EMPLOYEEDELTEESERVLET---->> DOGET()");

		EmployeeDao edao = new EmployeeDao();
		int id = Integer.parseInt(request.getParameter("id"))  ;
		
		int RowAffected = edao.delete(id);
		RequestDispatcher rd = null;
		
		if(RowAffected > 0) {
			rd = request.getRequestDispatcher("EmployeeDisplayServlet");
		}rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("EMPLOYEEDELETESERVLET---->> DOGPOST()");

		doGet(request, response);
		
	}

}
