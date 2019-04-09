package com.kunal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/ProfServlet")
public class PassFilter implements Filter {

   

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		long enroll1 = Long.parseLong(request.getParameter("enroll"));
		
		
		PrintWriter out = response.getWriter();
		if(enroll1>160010116023L && enroll1<160010116060L) {
			
			chain.doFilter(request, response);
			
		}
		else
		{
			RequestDispatcher rd= request.getRequestDispatcher("/faculty.jsp");
			out.println("<br><div class=\"container\"><h4 style=\"color:red;\">Invalid Entry! Try Again</h4></div>");
			rd.include(request,response);
		}
		
	}


}
