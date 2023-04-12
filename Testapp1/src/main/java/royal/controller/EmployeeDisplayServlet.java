package royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import royal.bean.EmployeeBean;
import royal.dao.EmployeeDao;

 public class EmployeeDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	
		EmployeeDao edao = new EmployeeDao();
		
		ArrayList<EmployeeBean> list = edao.read(); 
		
		PrintWriter out = response.getWriter();
		
		out.print("<table border=2>");
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
			out.print("<td><a href='EmployeeUpdateServlet?id="+ebean.getId()+"'>UPDATE</a> | <a href='EmployeeDeleteServlet?id="+ebean.getId()+"'>DELETE</a></td>");
			out.print("</tr>");
			
		}
		
		out.print("</table>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
