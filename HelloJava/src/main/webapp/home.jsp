<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.java.helper.ConnectionProvider"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>


<link href="css/index.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div class="topnav">
	<a class="active" href="home.jsp">Home</a> 
	<a href="#about">About</a> 
	<a href="#contact">Contact</a> 
	<a href="Register.jsp">Register</a> 
	<a href="Login.jsp">Login</a>
	<div class="search-container">
		<form action="#">
			<input type="text" placeholder="Search.." name="search">
			<button type="submit">Submit</button>
		</form>
	</div>
</div>

<%-- <%

Connection con = ConnectionProvider.getConnection();

%>

<h1><%= con %></h1> --%>

<%-- <jsp:forward page="/DeleteServlet?action=userList" /> --%>

</body>
</html>