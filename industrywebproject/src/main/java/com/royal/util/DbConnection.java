package com.royal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DbConnection {

	private static final String URLNAME    = "jdbc:mysql://localhost:3306/industarybatch";
	private static final String DRIVERNAME = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME   = "root";
	private static final String PASSWORD   = "root";
	
	

	public static Connection getconnction() {
		
		Connection conn = null;
		
		try {
			Class.forName(DRIVERNAME);
			
			conn = DriverManager.getConnection(URLNAME,USERNAME,PASSWORD);
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return conn;
		
		
	}












	

















}
