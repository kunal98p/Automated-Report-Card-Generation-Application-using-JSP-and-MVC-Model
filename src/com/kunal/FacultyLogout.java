package com.kunal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  
@WebServlet("/FacultyLogout")
public class FacultyLogout extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
        
            PrintWriter out=response.getWriter();  
              
            request.getRequestDispatcher("facultyLogin.jsp").include(request, response);  
              
            HttpSession session=request.getSession();  
            session.invalidate();  
              
            out.print("<br><div class=\"container\"><h3 style=color:green>Successfully Logged out!</h3></div>");  
              
            out.close();  
    }  
}  