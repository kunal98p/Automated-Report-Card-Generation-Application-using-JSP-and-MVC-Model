package com.kunal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession; 
@WebServlet("/faculty")
public class Faculty extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                      throws ServletException, IOException {  
         
        PrintWriter out=response.getWriter();  
         
          
        HttpSession session=request.getSession(false);  
        if(session!=null){  
        String name=(String)session.getAttribute("username");  
          
        out.print("Hello, "+name+" Welcome to Profile");
        
        }  
        else{  
            out.print("Please login first");  
            request.getRequestDispatcher("facultyLogin.jsp").include(request, response);  
        }  
        out.close();  
    }  
}  
