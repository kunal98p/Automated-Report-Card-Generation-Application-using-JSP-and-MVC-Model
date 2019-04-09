

package com.kunal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/StudentReport")
public class StudentReport extends HttpServlet {
	public void doPost(HttpServletRequest req ,HttpServletResponse res) throws IOException, ServletException {
		String enroll1= req.getParameter("enroll");
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/javaoep","root","");   
			PreparedStatement ps =con.prepareStatement("select aj,se,wt,dcdr,percentage from record where enroll=(?)");  
			ps.setString(1, enroll1);
			ResultSet rs= ps.executeQuery();  
			rs.next();
			String message="";
			if ((rs.getString("se").equals("FF")) || (rs.getString("aj").equals("FF")) ||(rs.getString("dcdr").equals("FF") )|| (rs.getString("wt").equals("FF"))  ) { 
				message="<br><h3 style= \"color:red;\">You have not Cleared The Exam<h3>";
			}
			else {
				message="<br><h3 style= \"color:green;\">Congratulations!!!You have Cleared The Exam<h3>";
			}

			req.setAttribute("enroll",enroll1);
			req.setAttribute("segrade",rs.getString("se") );
			req.setAttribute("wtgrade", rs.getString("wt") );
			req.setAttribute("dcdrgrade", rs.getString("dcdr") );
			req.setAttribute("ajgrade",rs.getString("aj") );
			req.setAttribute("percentage", rs.getFloat("percentage"));
			req.setAttribute("message", message);
			PrintWriter out = res.getWriter();
			RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
						rd.include(req, res);
			
			con.close();
			ps.close();
			
			}catch(Exception e){ System.out.println(e);}  
			}  
	}

