<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Faculty Login</title>
<style type="text/css">
body {
	height: 100vh;
	background-image:
		url("https://www.jacaranda.com.au/wp-content/uploads/2016/03/english.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	background-size: cover;
	color: white;
}

input {
	border-radius: 10px;
}
</style>
</head>
<body>
	<br>
	<br>
	<div class="container">
		<br>
		<h2>LOGIN TO ACCESS FACULTY PORTAL</h2>
		<br>
		<form action="FacultyLogin" method="post">
			<p><h4>
				Enter Username: <input type="text" name="username"></h4>
			</p>
			<p><h4>
				Enter Password: <input type="text" name="password">
			</p></h4>
			<input type="submit">

		</form>
		<br> <br>
		<h3>
			<a href="index.jsp">Back To Main</a>
		</h3>
	</div>
</body>
</html>