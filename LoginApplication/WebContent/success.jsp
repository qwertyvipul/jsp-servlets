<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.login_application.dto.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<h1>Login Successful!</h1>
	<%
		// User user = (User) session.getAttribute("user");
		// User user = (User) request.getAttribute("user");
	%>
	
	<jsp:useBean id="user" class="com.example.login_application.dto.User" scope="request">
	</jsp:useBean>
	
	Hello <%=user.getName() %>
	Hello <jsp:getProperty property="name" name="user"/>
</body>
</html>