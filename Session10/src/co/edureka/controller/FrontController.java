package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/FrontController", "/Front" })
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//3. Send Back Response to User over HTTP
		response.setContentType("text/html"); // MIME Type

		// Which we wish to send back as response
		String htmlResponse = "<html><body><center><br/><br/><h3>Front Controller in Action</h3></center></body></html>";
		
		// Obtain Reference to PrintWriter Object which will write response to the User/Client
		PrintWriter out = response.getWriter();
		out.print(htmlResponse); // Sending Response 
		
		// 1. Extract Data from Request
		String type = request.getParameter("txtType"); // Extract data from Hidden Field
		
		if(type.equals("register")){ // register case
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Register");
			dispatcher.forward(request, response); // Response from FrontController will not be shown as request and response is forwarded
			
		}else{ // login case
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login");
			dispatcher.forward(request, response);
			//dispatcher.include(request, response);  // Response from FrontController will be shown as request and response is included
		}
		
	}

}
