package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import co.edureka.model.User;


@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    
	public void destroy() {
		System.out.println(">> filter destroyed");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print(">> Pre Processing");
		
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		if(user.validateLogin()){
			// pass the request along the filter chain
			chain.doFilter(request, response); //Forward Request and Response to LoginServlet
		}else{
			String htmlResponse = "<html><body><center><br/><br/><h3>Please Enter Details First !!</h3></center></body></html>";
			out.print(htmlResponse); // Sending Response
		}
		
		out.print(">> Post Porcessing");

	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println(">> filter initialized");
	}

}
