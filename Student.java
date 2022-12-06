package com.student.manage;

public class Student {
	private int studentId;
	private String studentname;
	private String studentPhone;
	private String studentCity;
	
	
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public Student(int studentId, String studentname, String studentPhone, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}

	public Student(String studentname, String studentPhone, String studentCity) {
		super();
		this.studentname = studentname;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}
	
	
	
	
	

}
