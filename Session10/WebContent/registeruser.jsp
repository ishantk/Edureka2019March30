<%@ page import="co.edureka.dao.DBHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register User</title>
</head>
<body>
	<center>
	<%
		// 1. Extract Data
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// 2. Save Data
		DBHelper db = new DBHelper();
		db.createConnection();
		int i = db.saveUser(user);
		db.closeConnection();
	
		if(i>0){
	%>		
		<h3>User <%= user.name %> Registered Successfully</h3>	
	<%		
		}else{
	%>
		<h3>User <%= user.name %> Not Registered Successfully</h3>	
	<%		
		}
		
	%>
	</center>

</body>
</html>