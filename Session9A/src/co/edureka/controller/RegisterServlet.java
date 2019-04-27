package co.edureka.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {
	
	// executed when object of servlet will be created by Server (Apache Tomcat)
	public void init(ServletConfig config) throws ServletException {
		System.out.println(">> init executed");
	}

	
	// executed when object of servlet will be destroyed by Server (Apache Tomcat)
	public void destroy() {
		System.out.println(">> destroy executed");
	}

	
	// executed when request will be sent
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> service executed");
	}

}
