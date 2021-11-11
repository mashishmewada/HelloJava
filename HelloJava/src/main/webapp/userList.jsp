<%@page import="com.java.entities.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%
	User user = (User)session.getAttribute("currentUser");
	
%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- NavBar -->

<div class="topnav">
	<a class="active" href="home.jsp">Home</a> 
	<a href="#about">About</a> 
	<a href="#contact">Contact</a> 
	
</div>
<!-- End of NavBar -->

    
  <!-- details -->
						<div id="profile-details">
							<table class="table">

								<tbody>
									<tr>
										<th scope="row">ID :</th>
										<td><%=user.getId()%></td>

									<tr>
										<th scope="row">Password :</th>
										<td><%=user.getName()%></td>

									</tr>

									</tr>
									<tr>
										<th scope="row">Email :</th>
										<td><%=user.getEmail()%></td>

									<tr>
										<th scope="row">Password :</th>
										<td><%=user.getPassword()%></td>

									</tr>
<tr><td><a href="DeleteServlet?action=delete&userId=<c:out value="${user.userid}"/>">Delete</a></td></tr>
								</tbody>
							</table>
						</div>
</body>
</html>