<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// Expecting number in Request Object
	String number = request.getParameter("number");

	try{
		// from String we are converting to number
		int num = Integer.parseInt(number);
		
		// Sending Table of a Number as response to the client
		for(int i=1;i<=10;i++){
			out.print(num+" "+i+"'s are "+(num*i)+"<br/>");
		}
		
	}catch(Exception e){
		out.print("Enter a Valid Number"); // Sending as Response
	}

%>    
    