package royal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import royal.bean.EmployeeBean;
import royal.util.DbConnection;

public class EmployeeDao {


	public int create(EmployeeBean ebean) {
		
		String InsertQuery = "INSERT INTO EMP(NAME,SALARY,DSGN,ORGNAME) VALUES('"+ebean.getName()+"','"+ebean.getSalary()+"','"+ebean.getDsgn()+"','"+ebean.getOrgName()+"')";
		Connection conn = DbConnection.getDbconnection();
		Statement stmt = null;
		int RowAffected = 0;
		
		if(conn != null) {
			
			try {
				stmt = conn.createStatement();
				RowAffected = stmt.executeUpdate(InsertQuery);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("INSERTQUERY DB CONNECTED--> " +conn);
		}else {

			System.out.println("INSERTQUERY DB NOT CONNECTED--> " +conn);
		}
		
		return RowAffected;
	}

	public static EmployeeBean displayall(int id) {

		String DisplayQuery = "SELECT * FROM EMP WHERE ID ="+id;
		Connection conn = DbConnection.getDbconnection();
		Statement stmt = null;
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		EmployeeBean ebean = new EmployeeBean();
		if(conn != null) {
			
			try {
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(DisplayQuery);
				
				while(rs.next()) {
				
				  ebean = new EmployeeBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				  list.add(ebean);
				
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("DISPLAYQUERY DB CONNECTED--> " +conn);
		}else {

			System.out.println("DISPLAYQUERY DB NOT CONNECTED--> " +conn);
		}
		
		return ebean;
	}


	public static ArrayList<EmployeeBean> read() {
		
		String DisplayQuery = "SELECT * FROM EMP";
		Connection conn = DbConnection.getDbconnection();
		Statement stmt = null;
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		
		if(conn != null) {
			
			try {
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(DisplayQuery);
				
				while(rs.next()) {
					
					EmployeeBean ebean = new EmployeeBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
					list.add(ebean);
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("DISPLAYQUERY DB CONNECTED--> " +conn);
		}else {
			
			System.out.println("DISPLAYQUERY DB NOT CONNECTED--> " +conn);
		}
		
		return list;
	}
	
	
	
	
	public static int update(EmployeeBean ebean, int UpdateId) {

		String UpdateQuery = "UPDATE EMP SET NAME='"+ebean.getName()+"',SALARY='"+ebean.getSalary()+"',DSGN='"+ebean.getDsgn()+"',ORGNAME='"+ebean.getOrgName()+"' WHERE ID ="+UpdateId;
		Connection conn = DbConnection.getDbconnection();
		Statement stmt = null;
		int RowAffected = 0;
		
		if(conn != null) {
			
			try {
				stmt = conn.createStatement();
				RowAffected = stmt.executeUpdate(UpdateQuery);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("UPDATEQUERY DB CONNECTED--> " +conn);
		}else {

			System.out.println("UPDATEQUERY DB NOT CONNECTED--> " +conn);
		}
		
		return RowAffected;
	}
		
	
	
	public int delete(int DeleteId) {

		String DeleteQuery = "DELETE FROM EMP WHERE ID ="+DeleteId;
		Connection conn = DbConnection.getDbconnection();
		Statement stmt = null;
		int RowAffected = 0;
		
		if(conn != null) {
			
			try {
				stmt = conn.createStatement();
				RowAffected = stmt.executeUpdate(DeleteQuery);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("DELETEQUERY DB CONNECTED--> " +conn);
		}else {

			System.out.println("DELETEQUERY DB NOT CONNECTED--> " +conn);
		}
		
		return RowAffected;
	}

	
	




	public static void main(String[] args) {
		
//		String name = "SHIVA";
//		String salary = "800000";
//		String dsgn = "MANAGER";
//		String orgName = "SBI";
//		
//		EmployeeBean ebean = new EmployeeBean(0, name, salary, dsgn, orgName);
//		
//		EmployeeDao edao = new EmployeeDao();
//		
//		int RowAffected = edao.create(ebean);
//		
//		if(RowAffected > 0) {
//			System.out.println("DATA INSERTQUERY SUCCESS");
//		}else {
//			System.out.println("DATA INSERTQUERY NOT SUCCESS");
//		}
		
	
		
//		EmployeeDao edao = new EmployeeDao(); 
//		
//		ArrayList<EmployeeBean> list = edao.read();
//		
//		for(int i=0; i<list.size(); i++) {
//			
//			EmployeeBean ebean = list.get(i);
//			System.out.println(ebean.getId()+" "+ebean.getName()+" "+ebean.getSalary()+" "+ebean.getDsgn()+" "+ebean.getOrgName()) ;
//		}
//		
		
//		int id = 18;
//		String name = "kali";
//		String salary = "50000";
//		String dsgn = "ca";
//		String orgName = "Bank";
//	
//		EmployeeBean ebean = new EmployeeBean(id, name, salary, dsgn, orgName);
//		
//		EmployeeDao edao = new EmployeeDao();
//		
//		int RowAffected = edao.update(ebean, id);
//		
//		if(RowAffected > 0) {
//			System.out.println("DATA UPDATEQUERY SUCCESS");
//		}else {
//			System.out.println("DATA UPDATEQUERY NOT SUCCESS");
//		}
//				
		
	
//		EmployeeDao edao = new EmployeeDao();
//		int RowAffected = edao.delete(21);
//	
//		if(RowAffected > 0) {
//			System.out.println("DATA DELETEQUERY SUCCESS");
//		}else {
//			System.out.println("DATA DELTEQUERY NOT SUCCESS");
//		}
//		
	
	
	
	
	}









}
