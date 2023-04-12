package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.EmployeeBean;
import com.royal.dao.EmployeeDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


	public class EmployeeSaveUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("SAVEUPDATEEMPLOYEESERVLET---->> DOGET()");
		
		int id = Integer.parseInt(request.getParameter("id")); 
		String name    = request.getParameter("name");
		String salary  = request.getParameter("salary");
		String dsgn    = request.getParameter("dsgn");
		String orgName = request.getParameter("orgName");
		
		EmployeeBean ebean = new EmployeeBean(id, name, salary, dsgn, orgName);
		
		EmployeeDao edao = new EmployeeDao();
		
		int RowAffected = edao.update(ebean, id);
		
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		
			if(RowAffected > 0) {
				 rd = request.getRequestDispatcher("EmployeeDisplayServlet");
			}rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SAVEUPDATEEMPLOYEESERVLET---->> DOPOST()");
		doGet(request, response);
	}

}
