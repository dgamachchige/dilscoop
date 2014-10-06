package org.dilscoop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(description = "The Hello Servlet", urlPatterns = { "/HelloServletPath" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//basic
		/*System.out.println("hello from get method.");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Hello in Dilscoop</h3>");
		
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		printWriter.println("helllo User "+ userName + " and " + userId);*/
		
		//session
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		if (userName != null && userName != "") {
			session.setAttribute("name", userName);
			
		}
		printWriter.println("helllo User "+ userName);
		printWriter.println("session User "+ session.getAttribute("name") );
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello from Post method.");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Hello in Dilscoop</h3>");
		
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		String prof = request.getParameter("prof");
//		String location = request.getParameter("location");
		String[] location = request.getParameterValues("location");
		printWriter.println("helllo User From POst"+ userName + " and " + userId);
		printWriter.println("you are "+prof+"you are in "+ location.length);
		for (int i = 0; i < location.length; i++) {
			printWriter.println(location[i]);
			
		}
		
	}

}
