package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter(); 
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String standard = request.getParameter("standard");
		String percentage = request.getParameter("percentage");
		
		StudentBean sBean = new StudentBean(0, name, address, standard, percentage);
		
		StudentDao sDao = new StudentDao();
		
		int RowAffected = sDao.insert(sBean);
		
		if(RowAffected > 0) {
			
			request.getRequestDispatcher("StudentDisplayServlet").forward(request, response);
			
		}else {
			out.print("Not Found Data");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
