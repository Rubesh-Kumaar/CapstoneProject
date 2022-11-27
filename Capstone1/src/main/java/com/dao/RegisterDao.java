package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterDao {
	static int id= 102;
		public static int registeruser(String fname,String lname,String email,int mobile,String location,String pass,String cpass)
		{
			int status = 0;
			
			try{  
				Class.forName("com.mysql.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
				
				PreparedStatement ps=con.prepareStatement(  
						"insert into Registration values(?,?,?,?,?,?,?,?)");
						
						ps.setInt(1,0);
						ps.setString(2,fname);
						ps.setString(3,lname);
						ps.setString(4,email);
						ps.setInt(5,mobile);
						ps.setString(6,location);
						ps.setString(7,pass);
						ps.setString(8,cpass);
						      
						status = ps.executeUpdate();  
						 
						          
						}catch(Exception e){System.out.println(e);}  
						return status;

		}
}
