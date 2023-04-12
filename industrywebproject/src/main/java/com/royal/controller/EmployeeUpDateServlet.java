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

public class EmployeeUpDateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			System.out.println("EMPLOYEEUPDATESERVLET---->> DOGET()");

			PrintWriter out = response.getWriter();
			
			int id  = Integer.parseInt(request.getParameter("id"));
			
			EmployeeBean ebean = EmployeeDao.getdisplay(id);
			
			
			out.print("<html>");
			out.print("<head><link href='Empstylesheet.css' rel='stylesheet'></link></head>");
			out.print("<body>");
			out.print("	<form action='EmployeeSaveUpdateServlet' method='post'>");
			out.print("<table>");
			
			out.print("	<tr><h1>EDIT RECORDS<h1></tr>");
			out.print("	<tr><td><input class='inpt'  name='id' placeholder='id' readonly='readonly'  value='"+ebean.getId()+"'></td></tr>");
			out.print("	<tr><td><input class='inpt' type='text' name='name' placeholder='name' value='"+ebean.getName()+"'></td></tr>");
			out.print("	<tr><td><input class='inpt' type='text' name='salary' placeholder='salary'   value='"+ebean.getSalary()+"'></td></tr>");
			out.print("	<tr><td><input class='inpt' type='text' name='dsgn' placeholder='dsgn'   value='"+ebean.getDsgn()+"'></td></tr>");
			out.print("	<tr><td><input class='inpt' type='text' name='orgName' placeholder='orgName'   value='"+ebean.getOrgName()+"'></td></tr>");
			out.print("	<tr><td><button class='btn'  type='submit' name='submit'>Update&Save</button></td></tr>");
			out.print("	</form>");
			out.print("	</table>");
			out.print("	</body>");
			out.print("	</html>");
					
			
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			System.out.println("EMPLOYEEUPDATESERVLET---->> DOPOST()");

			doGet(request, response);
	}

}
