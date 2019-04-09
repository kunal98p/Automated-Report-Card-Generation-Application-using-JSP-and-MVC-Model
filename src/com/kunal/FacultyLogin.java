package com.kunal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  
@WebServlet("/FacultyLogin")
public class FacultyLogin extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
        
        PrintWriter out=response.getWriter();  
        
          
        String name=request.getParameter("username");  
        String password=request.getParameter("password");  
          
        if(LoginDAO.validate(name, password)){  
        out.print("Welcome, "+name);  
        HttpSession session=request.getSession();  
        session.setAttribute("name",name);  
        request.getRequestDispatcher("faculty.jsp").forward(request, response);  
        }  
        else{  
            out.print("<br><h4><div class=\"container\" style=color:red >Sorry, username or password error! </h4></div>");  
            request.getRequestDispatcher("facultyLogin.jsp").include(request, response);  
        }  
        out.close();  
    }  
}  