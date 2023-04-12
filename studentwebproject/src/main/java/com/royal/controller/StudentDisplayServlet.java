package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		StudentDao sDao = new StudentDao();
		
		ArrayList<StudentBean> list = sDao.displayall();
		

		out.print("<link href=\"studentdisplay2.css\" rel=\"stylesheet\" ></link>");

		out.print("<table border=1>");

		out.print("<th>RollNo</th>");
		out.print("<th>Name</th>");
		out.print("<th>Standard</th>");
		out.print("<th>Percentage</th>");
		out.print("<th>Update</th>");
	
		
		
		for(int i=0; i<list.size(); i++) {
			
			StudentBean sBean = list.get(i);
			
			out.print("<tr>");
			out.print("<td>"+sBean.getRollno()+"</td>");
			out.print("<td>"+sBean.getName()+"</td>");
			out.print("<td>"+sBean.getStandard()+"</td>");
			out.print("<td>"+sBean.getPercentage()+"</td>");
			out.print("<td><a href=StudentEditServlet?id="+sBean.getRollno()+">Edit</a> | <a href=StudentDeleteServlet?id="+sBean.getRollno()+">Delete</a></td>");
		  
			
			out.print("</tr>");
		
		}
		
		out.print("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
