package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDao;
import com.dao.RegisterDao;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		int mobile=Integer.valueOf(request.getParameter("mobile"));
		String location=request.getParameter("location");
		String pass=request.getParameter("pass");
		String cpass=request.getParameter("cpass");
		
		int status = RegisterDao.registeruser(fname, lname, email, mobile, location, pass, cpass);
		if(status>0){  
	        RequestDispatcher rd=request.getRequestDispatcher("login.html");  
	        rd.forward(request,response);  
	    }  
	    else{  
	        out.print("Registration failed");
	        //RequestDispatcher rd=request.getRequestDispatcher("signup.html");  
	        //rd.include(request,response);  
	    }
	}

}
