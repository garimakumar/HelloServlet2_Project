package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hey
 */
@WebServlet("/hello")
public class Hey extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    	public void init(ServletConfig config) throws ServletException {
	
    		System.out.println("Init method called");
    	}
	public void destroy() {
	
		    System.out.println(" Destroy method called");
	
	    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Service method called");
	    response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1> This is H1 tag </h1>");
        out.println("<h2> This is H2 tag </h2>");
        out.println("<h3> This is H3 tag </h3>");
        out.println("<h4> This is H4 tag </h4>");
        out.flush();
        out.close();
        
	}

}
