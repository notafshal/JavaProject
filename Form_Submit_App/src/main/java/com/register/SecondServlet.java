package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("em");
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		
		out.print("Your Email: "+ email +"<h1> Welcome to Home Page <h1>");
	}

}
