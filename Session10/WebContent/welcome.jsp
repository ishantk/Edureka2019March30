<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>

	<%
		Date date1 = new Date();
	%>

	<center>
		<h3>Welcome User, <%= session.getAttribute("keyName") %> | <%= session.getAttribute("keyAge") %>  </h3>
		
		Logged In at <%= date1 %>
	
	
		<br>
	<%
		// Reading Cookies for our web application
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" : "+ck.getValue()+"<br/>");
		}*/
		
		String name = (String)session.getAttribute("keyName");
		int age = (int)session.getAttribute("keyAge");
		
		//String name = (String)pageContext.getAttribute("keyName"); // Try Yourself
	%>
	
	</center>

</body>
</html>