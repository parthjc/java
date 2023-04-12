package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.text.html.HTMLEditorKit.Parser;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int Updaterollno = Integer.parseInt(request.getParameter("id"));
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		StudentBean sBean = StudentDao.Edit(Updaterollno);
		
		out.print("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset=\"UTF-8\">"
				+ "<title>Insert title here</title>"
				+ "<link href=\"studentedit.css\" rel=\"stylesheet\" ></link>"
				+ "</head>"
				+ "<body>"
				+ ""
				+ "	<form action=\"StudentSaveServlet\" method=\"post\">"
				+ "	<table>"
				+ "	 <th>Update Form</th>"
				+ "	 <tr><td>RollNo</td></tr>"
				+ "	 <tr><td><input type=\"text\" name=\"id\" placeholder=\"Rollno\" value = "+sBean.getRollno()+" readonly=\\\"readonly\\\"></td></tr>"
				+ "	 <tr><td>Name</td></tr>"
				+ " <tr><td><input type=\"text\" name=\"name\" placeholder=\"Name\" value = "+sBean.getName()+"></td></tr>"
				+ "	 <tr><td>Address</td></tr>"
				+ "	 <tr><td><input type=\"text\" name=\"address\" placeholder=\"Address\" value="+sBean.getAddress()+"></td></tr>"
				+ "	 <tr><td>Standard</td></tr>"
				+ "	 <tr><td><input type=\"text\" name=\"standard\" placeholder=\"Standard\" value="+sBean.getStandard()+"></td></tr>"
				+ "	 <tr><td>Percentage</td></tr>"
				+ "	 <tr><td><input type=\"text\" name=\"percentage\" placeholder=\"Percentage\" value="+sBean.getPercentage()+"></td></tr>"
				+ "	 <tr><td><button type=\"submit\" name=\"submit\" class=submit>Save</button></td></tr>"
				+ "	 "
				+ "	  "
				+ "	</table>"
				+ "	</form>"
				+ "	"
				+ ""
				+ "</body>"
				+ "</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
