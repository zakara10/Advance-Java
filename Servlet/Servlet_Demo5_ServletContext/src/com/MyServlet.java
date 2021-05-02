package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.println("Hi<br>");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("Phone");
		out.print(str);
	}
}
