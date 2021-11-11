

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>


<link href="css/Register.css" rel="stylesheet" type="text/css" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>

	<!-- navBar -->

	<div class="topnav">
		<a class="active" href="home.jsp">Home</a> <a href="#about">About</a>
		<a href="#contact">Contact</a>

	</div>
	<!-- End of navbar -->

	<!-- Login card -->

	<div class="card">

		<form action="LoginServlet" method="post">
			<div class="container">
				<h1>Login</h1>
				<hr>

				<label for="email"><b>Email</b></label> <input type="text"
					placeholder="Enter Email" name="email" id="email" required>

				<label for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="user_password" id="psw" required>

				<button type="submit" class="registerbtn">Login</button>
			</div>

			<div class="container signin">
				<p>
					Create a new account. <a href="Register.jsp">Register</a>.
				</p>
			</div>
		</form>
	</div>
	<!-- End of Login card -->

</body>
</html>