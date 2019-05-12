<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@ page import="javax.ws.rs.client.ClientBuilder"%>
<%@ page import="javax.ws.rs.client.Client"%>
<%@ page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>REST WS Demo</title>
</head>
<body>

	<center>
		<h3>Welcome to RESTFUL Web Service Demo. This is a Web Service Consumer</h3>
	


	<%
		// Lets write Code to use our WebService i.e. Greeting Service :)
		// Below is code to consume WebService
		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig); // client is used to send request to web service
		
		String uriToWebApp = "http://localhost:8080/Session15RSWS";
		
		WebTarget target = client.target(UriBuilder.fromUri(uriToWebApp).build());
		// with WebTarget we shall target the web methods :)
					// http://localhost:8080/Session15RSWS/rest/greeting
		String plainResponse = target.path("rest").path("greeting").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		String htmlResponse = target.path("rest").path("greeting").request().accept(MediaType.TEXT_HTML).get(String.class);
		String xmlResponse = target.path("rest").path("greeting").request().accept(MediaType.TEXT_XML).get(String.class);
		String jsonResponse = target.path("rest").path("greeting").request().accept(MediaType.APPLICATION_JSON).get(String.class);
	
	%>

	<b>Plain Response</b>
	<%= plainResponse %>
	<br/><br/>
	
	<b>HTML Response</b>
	<%= htmlResponse %>
	<br/><br/>
	
	<b>XML Response</b>
	<%= xmlResponse %>
	<br/><br/>
	
	<b>JSON Response</b>
	<%= jsonResponse %>
	<br/><br/>
	
	</center>
	
</body>
</html>