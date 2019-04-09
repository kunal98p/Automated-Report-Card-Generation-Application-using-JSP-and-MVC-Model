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
<title>Student</title>
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
		<h1>Enter Student Details for Mark sheet</h1>
		<br>

		<form action="StudentReport" method="post">

			<h4>
				Enter Student Enrollment No. <input type="text" name="enroll">
			</h4>


			<input type="submit">

		</form>
		<br> <br>
		<h3>
			<a href="index.jsp">Back To Main</a>
		</h3>
	</div>
</body>
</html>