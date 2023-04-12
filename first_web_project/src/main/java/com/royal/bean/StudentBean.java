package com.royal.bean;

public class StudentBean {

	private int rollno;
	private String name;
	private int std;
	
	public StudentBean() {
		super();
	}

	public StudentBean(int rollno, String name, int std) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.std = std;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public void disp() {
		
		System.out.println(getRollno()+" "+getName()+" "+getStd());
	}
	


































}
