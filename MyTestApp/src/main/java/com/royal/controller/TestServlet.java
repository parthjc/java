package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{

	
	static {
	
		System.out.println("1.Loadingclass");
	}
	
	{
		
		System.out.println("2.create Obj class");
	}
	
	@Override
	public void init() throws ServletException {
	
		System.out.println("3.InIt Method");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("5.Service method");
	}
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println("4.InIt Method with Parameter");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destory");
	}
}
