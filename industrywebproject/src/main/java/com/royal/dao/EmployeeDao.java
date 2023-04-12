package com.royal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
import com.mysql.cj.xdevapi.Result;
import com.royal.bean.EmployeeBean;
import com.royal.util.DbConnection;

public class EmployeeDao {

	public int insert(EmployeeBean ebean) {
		
		String InsertQuery = ("INSERT INTO EMP(NAME,SALARY,DSGN,ORGNAME) VALUES('"+ebean.getName()+"','"+ebean.getSalary()+"','"+ebean.getDsgn()+"','"+ebean.getOrgName()+"')");
		Connection conn = DbConnection.getconnction();
		Statement stmt = null;
		int RowAffected = 0;
		
			if(conn != null) {
				
				try {
					stmt = conn.createStatement();
					RowAffected = stmt.executeUpdate(InsertQuery);
					
				} catch (SQLException e) {

					e.printStackTrace();
				}
				
				
				
				System.out.println("INSERTQUERY DB CONNECTED");
			}else {
				System.out.println("INSERTQUERY DB NOT CONNECTED");
			}
		
		return RowAffected;
	}
	
	public int update(EmployeeBean ebean, int UpdateId) {

		String UpdateQuery = ("UPDATE EMP SET NAME = '"+ebean.getName()+"', SALARY = '"+ebean.getSalary()+"', DSGN = '"+ebean.getDsgn()+"', ORGNAME = '"+ebean.getOrgName()+"' WHERE ID = " + UpdateId);
		Connection conn = DbConnection.getconnction();
		Statement stmt = null;
		int RowAffected = 0;
		
			if(conn != null) {
				
				try {
					stmt = conn.createStatement();
					RowAffected = stmt.executeUpdate(UpdateQuery);
					
				} catch (SQLException e) {

					e.printStackTrace();
				}
				
				
				
				System.out.println("UPDATEQUERY DB CONNECTED");
			}else {
				System.out.println("UPDATEQUERY DB NOT CONNECTED");
			}
		
		return RowAffected;
	}
	
	
	
	
	
	
	
	
	public static EmployeeBean getdisplay(int id) {
		
		EmployeeBean ebean = new EmployeeBean();
		String SelectQuery = ("SELECT * FROM EMP WHERE ID = " +id);
		Connection conn = DbConnection.getconnction();
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<EmployeeBean> list = new ArrayList<>();
		
		if(conn != null) {
			
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(SelectQuery);
				
				while(rs.next()){
					 ebean = new EmployeeBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
					
					list.add(ebean);
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
			
			System.out.println("DISPLAYQUERY DB CONNECTED");
		}else {
			System.out.println("DISPLAYQUERY DB NOT CONNECTED");
		}
		
		return ebean;
		
		
	}
	
	
	public ArrayList<EmployeeBean> display() {
		
		String SelectQuery = ("SELECT * FROM EMP");
		Connection conn = DbConnection.getconnction();
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<EmployeeBean> list = new ArrayList<>();
		
			if(conn != null) {
				
				try {
					stmt = conn.createStatement();
				    rs = stmt.executeQuery(SelectQuery);
					
						while(rs.next()){
							EmployeeBean ebean = new EmployeeBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
							
							list.add(ebean);
						}
					
				} catch (SQLException e) {

					e.printStackTrace();
				}
				
				
				
				System.out.println("DISPLAYQUERY DB CONNECTED");
			}else {
				System.out.println("DISPLAYQUERY DB NOT CONNECTED");
			}
		
		return list;
		
		
	}
	
	public int delete(int DeleteId) {
		String DELETEQuery = ("DELETE FROM EMP WHERE ID = " + DeleteId);
		Connection conn = DbConnection.getconnction();
		Statement stmt = null;
		int RowAffected = 0;
		
			if(conn != null) {
				
				try {
					stmt = conn.createStatement();
					RowAffected = stmt.executeUpdate(DELETEQuery);
					
				} catch (SQLException e) {

					e.printStackTrace();
				}
				
				
				
				System.out.println("DELETEQUERY DB CONNECTED");
			}else {
				System.out.println("DELETEQUERY DB NOT CONNECTED");
			}
		
		return RowAffected;
	}


	
	public static void main(String[] args) {
		
//		String name = "SHIVA";
//		String salary = "900000";
//		String dsgn = "GOD";
//		String orgname = "UNIVERSE";
//		
//		EmployeeBean ebean = new EmployeeBean(0, name, salary, dsgn, orgname);
//		
//		EmployeeDao edao = new EmployeeDao();
//		
//	    int RowAffected = edao.insert(ebean);
//	    
//	    	if(RowAffected > 0) {
//	    		System.out.println("Data Insert Successfull");
//	    	}else {
//	    		System.out.println("Data Not Insert");
//	    	}


//			int UpdateId   =  3;
//	    	String name = "BHARMADEV";
//	    	String salary = "8000000";
//	    	String dsgn = "GOD";
//	    	String orgname = "UNIVERSE";
//	    	
//	    	EmployeeBean ebean = new EmployeeBean(UpdateId, name, salary, dsgn, orgname);
//	    	
//	    	EmployeeDao edao = new EmployeeDao();
//	    	
//	    	int RowAffected = edao.update(ebean, UpdateId);
//	    	
//	    	if(RowAffected > 0) {
//	    		System.out.println("Data Insert Successfull");
//	    	}else {
//	    		System.out.println("Data Not Insert");
//	    	}
		
		
//		EmployeeDao edao = new EmployeeDao();
//		
//		ArrayList<EmployeeBean> list = edao.display();
//		
//		for(int i=0; i<list.size(); i++) {
//			
//			EmployeeBean ebean  = list.get(i);
//			
//			System.out.println(ebean.getId()+ " " + " " +ebean.getName()+ " " + " " +ebean.getSalary()+ " " + " " +ebean.getDsgn()+ " " + " " +ebean.getOrgName());
//			
//			  
//			
//		}
		
		
		
//		EmployeeDao edao = new EmployeeDao();
//		
//		edao.delete(4);
	
		
	
	
	
	
	
	
	}








}
