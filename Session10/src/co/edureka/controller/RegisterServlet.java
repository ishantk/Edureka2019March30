package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.dao.DBHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {
	
	// When web server will create Object of RegisterServlet
	public void init(ServletConfig config) throws ServletException {
		System.out.println(">> init executed");
	}

	// When web server will destroy Object of RegisterServlet
	public void destroy() {
		System.out.println(">> destroy executed");
	}
	
	// Every time Client shall send a Request
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> service executed");
		
		//1. Extract Data from Client's Request Object over HTTP
		User user = new User(); // We shall load data in Object
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(">> "+user);
		
		//2. Saving User's Data in DataBase
		DBHelper db = new DBHelper();
		db.createConnection();
		int i = db.saveUser(user); // Save Object
		db.closeConnection();
	
		//3. Send Back Response to User over HTTP
		response.setContentType("text/html"); // MIME Type
		String message = "";
		
		if(i>0){
			message = user.name+" Registered Successfully !!";
		}else{
			message = user.name+" Not Registered Successfully !!";
		}
	
		// Which we wish to send back as response
		String htmlResponse = "<html><body><center><br/><br/><h3>"+message+"</h3></center></body></html>";
		
		// Obtain Reference to PrintWriter Object which will write response to the User/Client
		PrintWriter out = response.getWriter();
		out.print(htmlResponse); // Sending Response
	}
	

}
