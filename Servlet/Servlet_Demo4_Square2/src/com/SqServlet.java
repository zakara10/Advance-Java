package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		int x = Integer.parseInt(req.getParameter("x"));
	    x = x*x;
		
		PrintWriter out = res.getWriter();
		out.print("Hello to Square :" + x);
	}
}
