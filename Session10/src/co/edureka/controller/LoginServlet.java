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

import co.edureka.dao.DBHelper;
import co.edureka.model.User;


@WebServlet({ "/LoginServlet", "/Login" }) // Annotation (MetData which can be substituted somewhere in the code)
public class LoginServlet extends HttpServlet {
	
	// doPost is just like service method
	// doPost will only be executed if client sends a post request
	// whereas service method is executed for any type of request which can be get or post !!
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1. Extract Data from Client's Request Object over HTTP
		User user = new User(); // We shall load data in Object
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");

		// 2. Check User in DataBase i.e. Authenticate User in DB
		DBHelper db = new DBHelper();
		db.createConnection();
		boolean auth = db.loginUser(user); 
		db.closeConnection();
		
		//3. Send Back Response to User over HTTP
		response.setContentType("text/html"); // MIME Type
		
		String message = "";
		String url = "";
		String form = "";
		
		if(auth){
			Date date = new Date();
			message = user.email+" Logged In Successfully !!<br/>Login TimeStamp: "+date.toString();
			
			// If authenticated we shall fetch data from Table
			String name = "Mike Watson";
			int age = 23;
			//url = "<a href='Welcome'>Enter Home</a>";
			
			// 1. Session Tracking - Cookies
			// A piece of Information which shall be saved on User's/Client's machine
			/*Cookie ck1 = new Cookie("keyName", name);
			Cookie ck2 = new Cookie("keyAge", String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			*/
			
			// 2. Session Tracking - URL ReWriting
			//url = "<a href='Welcome?name="+name+"&age="+age+"'>Enter Home</a>";
			
			// 3. Session Tracking - Hidden Form Field
			/*form =  "<form action='Welcome' method='post'>"
					+ "<input type='hidden' name='txtName' value='"+name+"'/>"
					+ "<input type='hidden' name='txtAge' value='"+age+"'/>"
					+ "<input type='submit' value='Enter Home'/>"
					+ "</form>";*/
			
			// 4. Session Tracking - HttpSession API
			url = "<a href='Welcome'>Enter Home</a>";
			HttpSession session = request.getSession();
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", age);
			
		}else{
			message = user.email+" Not Logged In Successfully !!";
			response.sendRedirect("https://www.google.co.in");
		}
	
		// Which we wish to send back as response
		String htmlResponse = "<html><body><center><br/><br/><h3>"+message+"</h3><br/><br/>"+url+"</center></body></html>";
		//String htmlResponse = "<html><body><center><br/><br/><h3>"+message+"</h3><br/><br/>"+form+"</center></body></html>";
		
		// Obtain Reference to PrintWriter Object which will write response to the User/Client
		PrintWriter out = response.getWriter();
		out.print(htmlResponse); // Sending Response
	}

}
