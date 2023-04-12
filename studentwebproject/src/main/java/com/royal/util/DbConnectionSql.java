package com.royal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionSql {

	
	private static final String URLNAME = "jdbc:mysql://localhost:3306/industarybatch";
	private static final String DRIVERNAME = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	
	public static Connection getconnection() {
		
		Connection conn = null;
		
		try {
			Class.forName(DRIVERNAME);
			conn = DriverManager.getConnection(URLNAME,USERNAME,PASSWORD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(getconnection());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
