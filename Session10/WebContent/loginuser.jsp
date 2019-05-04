<%@ page import="co.edureka.dao.DBHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login User</title>
</head>
<body>
	
	<h3>Logging in ${param.txtEmail}</h3>  <!--  Expression Language -->

	<%
		
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password= request.getParameter("txtPassword");
		
		DBHelper db = new DBHelper();
		db.createConnection();
		boolean loginStatus = db.loginUser(user);
		db.closeConnection();
		
		if(loginStatus){
			
			String name = "Sia Flynn";
			int age = 22;
			
			//1. Session Tracking - Cookies
			//Cookie ck1 = new Cookie("keyName", name);
			//Cookie ck2 = new Cookie("keyAge", String.valueOf(age)); // Cookies work on Strings
			
			// 2. URL Re-Wrting 3. Hidden Form Fields | Try Yourself 
			
			// request and response are again references to Implicit Objects
			//response.addCookie(ck1);
			//response.addCookie(ck2);
			
			// 4. HttpSession
			session.setAttribute("keyName", name); // session is a ref var to Implicit Obejct of HttpSession
			session.setAttribute("keyAge", age); 
			
			// PageContext is another API for session tracking
			// Different Scopes
			// pageContext.setAttribute("keyName", name, PageContext.SESSION_SCOPE); | To execute yourself and try it !!
	%>
		<h3>Login Success</h3>
		<a href="welcome.jsp">Enter Home</a>
		<jsp:forward page="welcome.jsp"/>
	<%		
		
		}else{
			out.print("Login Failure");
		}
	
	%>

</body>
</html>