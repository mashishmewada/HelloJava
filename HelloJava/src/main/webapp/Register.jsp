
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

<link href="css/Register.css" rel="stylesheet" type="text/css" />
<link href="css/index.css" rel="stylesheet" type="text/css" />

</head>
<body>
<!-- NavBar -->

<div class="topnav">
	<a class="active" href="home.jsp">Home</a> 
	<a href="#about">About</a> 
	<a href="#contact">Contact</a> 
	
</div>
<!-- End of NavBar -->

<!-- Register card -->
<div class="card">

	<form name="form" action="RegisterServlet" method="POST" onsubmit="return validate()">
		<div class="container">
			<h1>Register</h1>
			<p>Please fill in this form to create an account.</p>
			<hr>
			
			<label class="large-label" for="username"><b>Name</b></label>
			<input placeholder="Enter your full name" id="your-name" name="user_name" type="text" required>

			<label for="email"><b>Email</b></label> <input type="text"
				placeholder="Enter Email" name="user_email" id="email" required>

			<label for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="user_password" id="psw" required>

			<label for="psw-repeat"><b>Repeat Password</b></label> <input type="password" 
				placeholder="Repeat Password" name="repeat_user_password" id="psw-repeat" required> 
			<hr>

			<label for="exampleCheck1">I agree to the Terms and Conditions</label>
				<input name="check" type="checkbox" id="exampleCheck1"> 
			
			<button id="submit-btn" type="submit" class="registerbtn">Register</button>
		</div>

		<div class="container signin">
			<p>
				Already have an account? <a href="Login.jsp">Login</a>.
			</p>
		</div>
	</form>
</div>
<!-- End of Register card -->

<script>

	function validate()
{ 
     var user_name = document.form.user_name.value;
     var user_email = document.form.user_email.value;
     var user_password = document.form.user_password.value;
     var repeat_user_password= document.form.repeat_user_password.value;
     
     if (user_name==null || user_name=="")
     { 
     alert("Name can't be blank"); 
     return false; 
     }
     else if (user_email==null || user_email=="")
     { 
     alert("Email can't be blank"); 
     return false; 
     }
     else if(user_password.length<6)
     { 
     alert("Password must be at least 6 characters long."); 
     return false; 
     } 
     else if (user_password!=repeat_user_password)
     { 
     alert("Confirm Password should match with the Password"); 
     return false; 
     }
     
 } 
</script>  


</body>
</html>