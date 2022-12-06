package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	
	public static boolean insertStudentToDB( Student st) {
		boolean f=false;
		try
		{
			// jdbc code
			Connection con= CP.creatC(); // creating connection fn\
			String q ="insert into students(sname,sphone,scity) values(?,?,?)";
			// PreparedStatement 
			PreparedStatement pstmt =con.prepareStatement(q);
			// set the values of parameter
			pstmt.setString(1, st.getStudentname());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			
			//execute ..
			pstmt.executeUpdate();
			f=true;
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		  return f;
	}

	public static boolean  deleteStudent(int userId) {
		// TODO Auto-generated method stub
		
		boolean f=false;
		try
		{
			// jdbc code
			Connection con= CP.creatC(); // creating connection fn\
			String q ="delete from students where sid=?";
			// PreparedStatement 
			PreparedStatement pstmt =con.prepareStatement(q);
			// set the values of parameter
			pstmt.setInt(1, userId);
			
			
			
			//execute ..
			pstmt.executeUpdate();
			f=true;
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		  return f;
		
		
	}

	public static void showAllStudent() {
		
		// TODO Auto-generated method stub
		
		try
		{
			// jdbc code
			Connection con= CP.creatC(); // creating connection fn\
			String q ="select * from students";
			
			Statement stmt=con.createStatement();
			
			ResultSet set=stmt.executeQuery(q);
			
			while(set.next())
			{
				int id=set.getInt(1);
				String name=set.getString(2);
				String  phone=set.getString(3);
				String city=set.getString(4);
				
				System.out.println("ID :"+id);
				System.out.println("NAME:"+name);
				System.out.println("PHONE:"+phone);
				System.out.println("CITY :"+city);
				System.out.println("++++++++++++++++++++++++++");
			}
			
		
			
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		  
		
	}

	public static boolean updateStudent(int userId,String name) {
		boolean b=false;
		// TODO Auto-generated method stub
		
		try
		{
			Connection con= CP.creatC(); // creating connection fn\
			String q ="update students set sname= ? where sid= ?";
			PreparedStatement pstmt =con.prepareStatement(q);
			//String s=Integer.toString(userId);
		
			pstmt.setString(1, name);
			pstmt.setInt(2,userId );   // required (int , string);
			
			pstmt.executeUpdate();
			
			
			
			
			
			
			
			
			return b=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return b;
		
	}
	  
}
