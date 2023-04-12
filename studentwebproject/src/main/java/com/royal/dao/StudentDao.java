package com.royal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.royal.bean.StudentBean;
import com.royal.util.DbConnectionSql;

public class StudentDao {

	public int insert(StudentBean sBean) {
		
		//Sql Query
		String InsertQuery = "INSERT INTO STUD(NAME, ADDRESS, STANDARD, PERCENTAGE) VALUE('"+sBean.getName()+"','"+sBean.getAddress()+"','"+sBean.getStandard()+"','"+sBean.getPercentage()+"')";
		
		//Db Connection
		Connection conn = DbConnectionSql.getconnection();
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
				
				System.out.println("INSERTQUERY DB CONNECTED-> " +conn);
				
				
			}else {
				System.out.println("INSERTQUERY DB NOT CONNECTED-> " +conn);
			}
		
		return RowAffected;
		
	}
	
	
	public static StudentBean Edit(int id) {

		//Sql Query
		String DisplayALLQuery = "SELECT * FROM STUD WHERE rollno="+id;
		
		//Db Connection
		Connection conn = DbConnectionSql.getconnection();
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		StudentBean sBean = null;
		
			if(conn != null) {
				
				try {
					stmt = conn.createStatement();
					rs = stmt.executeQuery(DisplayALLQuery);
					
						while(rs.next()) {
							
							sBean = new StudentBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
							
							list.add(sBean);
							
						}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("DISPLAYALLQUERY DB CONNECTED-> " +conn);
				
				
			}else {
				System.out.println("DISPLAYALLQUERY DB NOT CONNECTED-> " +conn);
			}
		
			return sBean;
	}
	
	
	public ArrayList<StudentBean> displayall() {
		
		//Sql Query
		String DisplayALLQuery = "SELECT * FROM STUD";
		
		//Db Connection
		Connection conn = DbConnectionSql.getconnection();
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		StudentBean sBean;
		
		if(conn != null) {
			
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(DisplayALLQuery);
				
				while(rs.next()) {
					
					sBean = new StudentBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
					
					list.add(sBean);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("DISPLAYALLQUERY DB CONNECTED-> " +conn);
			
			
		}else {
			System.out.println("DISPLAYALLQUERY DB NOT CONNECTED-> " +conn);
		}
		
		return list;
	}
	
	
	
	public int update(StudentBean sBean, int UpdateRollNo) {
		
		//Sql Query
		String UpdateQuery = "UPDATE STUD SET NAME = '"+sBean.getName()+"', ADDRESS = '"+sBean.getAddress()+"', STANDARD = '"+sBean.getStandard()+"', PERCENTAGE = '"+sBean.getPercentage()+"' WHERE ROLLNO ="+UpdateRollNo;
		
		//Db Connection
		Connection conn = DbConnectionSql.getconnection();
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
				
				System.out.println("UPDATEQUERY DB CONNECTED-> " +conn);
				
				
			}else {
				System.out.println("UPDATEQUERY DB NOT CONNECTED-> " +conn);
			}
		return RowAffected; 

	}
	
	
	public int delete(int DeleteRollNo) {
 
		//Sql Query
		String DeleteQuery = "DELETE FROM STUD WHERE ROLLNO="+DeleteRollNo;
				
		//Db Connection
		Connection conn = DbConnectionSql.getconnection();
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
						
				System.out.println("DELETEQUERY DB CONNECTED-> " +conn);
						
						
			}else {
				System.out.println("DELETEQUERY DB NOT CONNECTED-> " +conn);
				}
				
			return RowAffected; 

		
	}











	public static void main(String[] args) {

//		String name = "Ganesh";
//		String address = "Bardoli";
//		String standard = "8th";
//		String percentage = "87.46%";
//	
//		StudentBean sBean = new StudentBean(0, name, address, standard, percentage);
//		
//		StudentDao sDao = new StudentDao();
//		
//		int RowAffected = sDao.insert(sBean);
//		
//		if(RowAffected > 0) {
//			System.out.println("Row Insert-> " +RowAffected);
//		}else {
//			System.out.println("Row Not Insert-> " +RowAffected);
//		}
	
	
	
	
//	StudentDao sDao = new StudentDao();
//	
//	ArrayList<StudentBean> list = sDao.displayall();
//	
//	for(int i=0; i<list.size(); i++) {
//		StudentBean sBean = list.get(i);
//		
//		System.out.println(sBean.getRollno() +" "+ sBean.getName() +" "+ sBean.getAddress() +" "+ sBean.getStandard() +" "+ sBean.getPercentage());
//	}
	
		
//		int rollno = 4;
//		String name = "Kartik";
//		String address = "Rajkot";
//		String standard = "9th";
//		String percentage = "98.76%";
//	
//		StudentBean sBean = new StudentBean(rollno, name, address, standard, percentage);
//		
//		StudentDao sDao = new StudentDao();
//		
//		int RowAffected = sDao.update(sBean, rollno);
//		
//		if(RowAffected > 0) {
//			System.out.println("Row Update-> " +RowAffected);
//		}else {
//			System.out.println("Row Not Update-> " +RowAffected);
//		}
	
		
	
//	int rollno = 6;
//	
//	StudentDao eDao = new StudentDao();
//	
//	int RowAffected = eDao.delete(rollno);
//	
//	if(RowAffected > 0) {
//	System.out.println("Row Delete-> " +RowAffected);
//   }else {
//	System.out.println("Row Not Delete-> " +RowAffected);
//   }
	
	
	
	
	
	
	}


	





























}
