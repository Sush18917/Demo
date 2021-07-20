package Perform;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EOCheck")
public class EOCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=null;
		try{
			out=response.getWriter();
			int n=Integer.parseInt(request.getParameter("t1"));
			out.println("<center>");
			if(n%2==0)
				out.println("<font color=blue>"+n+"is even Number</font>");
			else
				out.println("<font color=Green>"+n+"is odd Number</font>");
		   }
		catch(Exception e){
			out.println("Error:"+e.getMessage());
		}
		finally {
			out.println("<br><br>");
			out.println("To go main page<a href=NewFile.html>Click Here</a>");
			out.println("</center>");
		}
	}
}
