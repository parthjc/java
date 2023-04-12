package royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import royal.bean.EmployeeBean;
import royal.dao.EmployeeDao;

public class EmployeeUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.print("EmployeeUpdateServlet--> doGet()");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		PrintWriter out = response.getWriter();
		
		
		
		EmployeeBean ebean = EmployeeDao.displayall(id) ;

		
		out.print("<html>");
		out.print("<body>");
		out.print("<form action=\"EmployeeUpdateSaveServlet\" method=\"post\">\r\n");
		out.print("<table>");
		
		out.print("<tr><td>Id</td></tr>\r\n");
		out.print("<tr><td><input type=\"text\" name=\"id\" placeholder=\"id\" readonly=\"readonly\" value="+ebean.getId()+"><td><tr>");
		out.print("<tr><td>Name</td></tr>\r\n");
		out.print("<tr><td><input type=\"text\" name=\"name\" placeholder=\"name\" value="+ebean.getName()+"><td><tr>");
		out.print("<tr><td>Salary</td></tr>\r\n");
		out.print("<tr><td><input type=\"text\" name=\"salary\" placeholder=\"salary\" value="+ebean.getSalary()+"><td><tr>");
		out.print("<tr><td>Dsgn</td></tr>\r\n");
		out.print("<tr><td><input type=\"text\" name=\"dsgn\" placeholder=\"dsgn\" value="+ebean.getDsgn()+"><td><tr>");
		out.print("<tr><td>OrgName</td></tr>\r\n");
		out.print("<tr><td><input type=\"text\" name=\"orgName\" placeholder=\"orgName\" value="+ebean.getOrgName()+"><td><tr>");
        out.print("<tr><td><button type=\"submit\" name=\"submit\">Update&Save</button></td></tr>\r\n");		
		out.print("</table>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
