package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.royal.bean.EmployeeBean;
import com.royal.dao.EmployeeDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("DISPLAYEMPLOYEESERVLET---->> DOGET()");
		
		EmployeeDao edao = new EmployeeDao();
		
		PrintWriter out = response.getWriter();
		
		ArrayList<EmployeeBean> list = edao.display();
		
		
		if(list.size() > 0) {
		
			
		 out.print("<style>"
		 		+ "body{background-color: #F0F2F5;}"
		 		+ ""
		 		+ "table{"
		 		+ "	position: absolute;"
		 		+ "	left:370px  ;"
		 		+ "	top: 100px ;"
		 		+ "	background-color: MediumSeaGreen;"
		 		+ " "
		 		+ "	padding: 20px;"
		 		+ "}"
		 		+ ""
		 		+ "h1{"
		 		+ "	text-align: center;"
		 		+ " border-style: solid;"
		 		+ " position: absolute;"
		 		+ "	left:370px  ;"
		 		+ "	top: 10px ;"
		 		+ " padding: 5px;"
		 		+ " width:640px;;"
		 		+ " background-color:grey;"
		 		+ " color:white;"
		 		+ "}"
		 		+ ""
		 		+ ""
		 		+ "th{"
		 		+ "padding: 10px;"
		 		+ "}"
		 		+ ""
		 		+ ""
		 		+ "tr{"
		 		+ "text-align: center;"
		 		+ "}"
		 		+ ""
		 		+ "a{"
		 		+ "text-decoration: none;"
		 		+ ""
		 		+ "}"
		 		+ ""
		 		+ ""
		 		+ "td{"
		 		+ "padding: 10px;"
		 		+ "}"
		 		+ ""
		 		+ ""
		 		+ "</style>");	
			
		 out.print("<table border=1>");
		
		 out.print("<h1>Employee Records</h1>");
		
		 out.print("<tr>");		

			out.print("<th>ID</th>");
			out.print("<th>NAME</th>");
			out.print("<th>SALARY</th>");
			out.print("<th>DSGN</th>");
			out.print("<th>ORGNAME</th>");
			out.print("<th>ACTION</th>");

		 out.print("</tr>");
		
		
		 for(int i=0; i<list.size(); i++) {
			
			EmployeeBean ebean = list.get(i);
			 out.print("<tr>");
			
				out.print("<td>"+ebean.getId()+"</td>");
				out.print("<td>"+ebean.getName()+"</td>");
				out.print("<td>"+ebean.getSalary()+"</td>");			
				out.print("<td>"+ebean.getDsgn()+"</td>");
				out.print("<td>"+ebean.getOrgName()+"</td>");
				out.print("<td><a href=EmployeeDeleteServlet?id="+ebean.getId()+">DELETE</a> | <a href=EmployeeUpDateServlet?id="+ebean.getId()+">UPDATE</a></td>");
			

			 out.print("</tr>");
			 
			
			
		
		}
		
			out.print("</table>");

		}else {
			
			out.println("<h1>Data Not Found!!!</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("DISPLAYEMPLOYEESERVLET---->> DOPOST()");
		doGet(request, response);
	}

}
