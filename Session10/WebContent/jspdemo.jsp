<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>
	
	<center>
		<h3>Welcome to JSP</h3>
		
		<h3>Pi is: <% out.print(pi); %></h3>
		
		<%-- <h3>Sum is: <% out.print(c); %></h3> error --%>
		
		<!-- Scriptlet Tag -->
		<%
			int a = 10;
			int b = 20;
			int c = a + b;
			out.print("sum is: "+c+"<br/>"); // out is a reference variable to the object of PrintWriter (Implicit Object)
			
			for(int i=1;i<=10;i++){
				out.print(a+" "+i+"'s are "+(a*i)+"<br/>");
			}
			
		%>
		
		<h3>Sum is: <% out.print(c); %></h3>
		
		<!-- Declaration Tag -->
		<%!
			double pi = 3.14;
			double area(double radius){
				return pi * radius * radius;
			}
		%>
		
		<h3>Area of Circle with radius 5.6 is: <% out.print(area(5.6)); %></h3>
		
		<!-- Expression Tag -->
		<h3>Area of Circle with radius 6.7 is: <%= area(6.7) %></h3>
		
	</center>
	
</body>
</html>