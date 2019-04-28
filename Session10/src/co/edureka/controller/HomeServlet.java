package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/HomeServlet", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Date date = new Date();
		
		// Read All the Cookies for our Web Application
		/*Cookie[] ckArr = request.getCookies();
		
		StringBuffer cookieData = new StringBuffer();
		
		for(Cookie ck : ckArr){
			cookieData.append(ck.getName()+" : "+ck.getValue()+"<br/>");
		}*/
		
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
		
		//String name = request.getParameter("txtName");
		//String age = request.getParameter("txtAge");
		
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("keyName");
		int age = (int)session.getAttribute("keyAge");
		
		//3. Send Back Response to User over HTTP
		response.setContentType("text/html"); // MIME Type
		// Which we wish to send back as response
		//String htmlResponse = "<html><body><center><br/><br/><h3>Welcome to Home<br/>"+date.toString()+"</h3><br/>"+cookieData.toString()+"</center></body></html>";
		String htmlResponse = "<html><body><center><br/><br/><h3>Welcome to Home<br/>"+date.toString()+"</h3><br/>"+name+" "+age+"</center></body></html>";
		
		// Obtain Reference to PrintWriter Object which will write response to the User/Client
		PrintWriter out = response.getWriter();
		out.print(htmlResponse); // Sending Response
		
	}

}
