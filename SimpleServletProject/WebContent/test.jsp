<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<%
		int i = 1, j = 2;
		int k = i + j;
		out.println("Value of k is = " + k);
	%>
	
	<h3>The value of k is = <%=k %></h3>
</body>
</html>