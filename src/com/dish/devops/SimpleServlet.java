package com.dish.devops;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "this is a simple servlet", urlPatterns = { "/SimpleServletPath" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Message to console");
		String user = request.getParameter("user");
		
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		
		//System.out.println(session.getAttribute(userName));
		if(user != "" && user != null){
		session.setAttribute("saveduserinfo", user);
		}
		PrintWriter writer = response.getWriter();
		writer.println("Hello from the Get Method to "+"  "+ user );
		writer.println("Hello from the Session Object to "+"  "+ (String)session.getAttribute("saveduserinfo"));
		
	}

}
