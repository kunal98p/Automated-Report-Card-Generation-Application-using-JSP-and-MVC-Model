package com.kunal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProfServlet")
public class ProfServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String enroll = req.getParameter("enroll");
		int aj = Integer.parseInt(req.getParameter("aj"));
		int se = Integer.parseInt(req.getParameter("se"));
		int wt = Integer.parseInt(req.getParameter("wt"));
		int dcdr = Integer.parseInt(req.getParameter("dcdr"));
		Calculate c = new Calculate();
		c.setGrade(aj);
		c.setGrade(se);
		c.setGrade(wt);
		c.setGrade(dcdr);
		String gradeAJ = c.getGrade(aj);
		String gradeSE = c.getGrade(se);
		String gradeWT = c.getGrade(wt);
		String gradeDCDR = c.getGrade(dcdr);

		Float percentage = c.getPercentage(aj, se, wt, dcdr);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaoep", "root", "");
			PreparedStatement ps = con.prepareStatement("insert into record values (?,?,?,?,?,?)");
			ps.setString(1, enroll);
			ps.setString(2, gradeAJ);
			ps.setString(3, gradeSE);
			ps.setString(4, gradeWT);
			ps.setString(5, gradeDCDR);
			ps.setFloat(6, percentage);
			int rs = ps.executeUpdate();
			String mes = "<h3 style=\"color:green\">Sucess! Enter Next Details</h3>";
			RequestDispatcher rd = req.getRequestDispatcher("faculty.jsp");
			req.setAttribute("mes", mes);
			rd.include(req, res);

			con.close();
			ps.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
