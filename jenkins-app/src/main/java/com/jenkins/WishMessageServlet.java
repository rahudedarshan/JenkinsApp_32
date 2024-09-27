package com.jenkins;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Hello world!
 */

@SuppressWarnings("serial")
@WebServlet("/wishurl")
public class WishMessageServlet extends HttpServlet{
	 
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	   
	   response.setContentType("text/html");
	   PrintWriter pw = response.getWriter();
	   
	   pw.println("<h1 style=\"color: red; text-align:\">Good Morning</h1>");
	   
	   pw.println("<br><br><a href='index.jsp'>home</a>");
	   
	   pw.close();
	   
   }
   
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
	   
	   doGet(request, response);
   }
}
