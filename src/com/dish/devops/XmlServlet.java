package com.dish.devops;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");

		System.out.println("from a servlet xml");

		String userName = request.getParameter("userName");
		//	String userId = request.getParameter("userid");

		PrintWriter writer =	response.getWriter();
		writer.println("Hello"+"  "+ userName);
		//		/writer.println("UserId is "+ userId);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");

		System.out.println("from a servlet xml");
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		String[] location = request.getParameterValues("location");
		String prof = request.getParameter("prof");

		PrintWriter writer =	response.getWriter();
		writer.println("Hello from the Post Method to "+"  "+ userName +"!" + "Full Name is: "+ fullName );
		writer.println("Profession  is "+ prof);
		writer.println("Location  is "+ location.length + "places");
		for(int i =0; i<location.length;i++){

			writer.println(location[i]);
		}
	}



}
