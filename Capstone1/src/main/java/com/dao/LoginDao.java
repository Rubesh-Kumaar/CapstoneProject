package com.dao;
import java.sql.*;
public class LoginDao {
	public static boolean validate(String email,String pass){  
		boolean status=false;  
		try{  
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root"); 
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from Registration where REmail=? and Password=?");  
		ps.setString(1,email);  
		ps.setString(2,pass);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  

}
}

