<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<%@ page buffer="8kb" %>    
<%@ include file="header.jsp" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isThreadSafe="true" %>   <!-- Synchronized -->
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>
	
	<center>
		<h3>Welcome to JSP</h3>
		
		
		<h4>JSTL Demo</h4>
		<c:forEach var="i" begin="1" end="10">
			<c:out value="${i}"/><br/>
		</c:forEach>
		
		<c:set var="age" value="20"/>
		Age is: <c:out value="${age}"/>
		
		
		
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
		
		<jsp:include page="header.jsp"/>
		
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
		
		<%
			int[] arr = {10, 20, 30, 40, 50};
			out.print(arr[1]); // throw error at run time
			// For JSP Pages lets skip try catch block
		%>
		
		<!-- Action Tags -->
		<jsp:include page="header.jsp"/>
		
		
		<%
			User uRef1 = new User();
			uRef1.setName("Leo");
			uRef1.setEmail("leo@example.com");
		%>
		
		<b>User Name is: <%= uRef1.getName() %></b>
		<br/>
		<b>User Email is: <%= uRef1.getEmail() %> </b>
		
		<jsp:useBean id="uRef2" class="co.edureka.model.User"/>
		<jsp:setProperty property="name" name="uRef2" value="Mike"/>
		<jsp:setProperty property="email" name="uRef2" value="mike@example.com"/>
		<br/><br/>
		<b>User Name is: <jsp:getProperty property="name" name="uRef2"/>  </b>
		<br/>
		<b>User Email is: <jsp:getProperty property="email" name="uRef2"/> </b>
		
		
	</center>
	
</body>
</html>