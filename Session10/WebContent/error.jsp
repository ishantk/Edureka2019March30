<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>    
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Some Error</title>
</head>
<body>
	<center>
	<h3>
		OOPS!! Something Went Wrong !!
		<br/>
		Exception is: <%= exception %>
	</h3>
	</center>

	<!-- exception is ref to Exception Object. Can be used only when isErrorPage is true :) -->

</body>
</html>