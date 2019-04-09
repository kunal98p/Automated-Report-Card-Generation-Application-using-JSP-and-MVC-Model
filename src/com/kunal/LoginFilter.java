package com.kunal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@WebFilter("/faculty.jsp")
public class LoginFilter implements Filter {

 
   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	       response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	      
	        HttpServletRequest  req = (HttpServletRequest)request;
	        HttpSession session=req.getSession(false);  
	        if(session!=null){  
	        String name=(String)session.getAttribute("name");  
	          
	        request.getRequestDispatcher("faculty.jsp").forward(request, response); 
	        }  
	        else{  
	            out.print("<br><div class=\"container\" ><h3 style=color:red>ACCESS DENIED!! PLEASE LOGIN TO ACCESS THE PORTAL</h3></div><br>");  
	            request.getRequestDispatcher("facultyLogin.jsp").include(request, response);  
	        }  
	        out.close();  
		chain.doFilter(request, response);
	}



}
