package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		String address = request.getParameter("address");
		
		System.out.println(fullname+ " " + address);
		
//		PrintWriter writer = response.getWriter();
//		writer.print("<h1>Success</h1>");
		
		
		response.sendRedirect("Home.html");
	
	}

}


