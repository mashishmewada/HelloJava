<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
<link href="css/Register.css" rel="stylesheet" type="text/css" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
</head>
<body>

<!-- navBar -->

	<div class="topnav">
		<a class="active" href="home.jsp">Home</a> <a href="#about">About</a>
		<a href="#contact">Contact</a>

	</div>
	<!-- End of navbar -->

<h1><b>Hi, I am User</b></h1>


<%-- <jsp:useBean id="RegisterDetails" class="com.java.entities.User" scope="session"/>
    <jsp:setProperty name="RegisterDetails" property="*"/>
    <h1>
    UserId: <%=RegisterDetails.getId()%><br>
    Name: <%=RegisterDetails.getName()%><br>
    Email: <%=RegisterDetails.getEmail()%><br>
    Password: <%=RegisterDetails.getPassword()%><br>
    
    </h1>
 --%>

</body>
</html>