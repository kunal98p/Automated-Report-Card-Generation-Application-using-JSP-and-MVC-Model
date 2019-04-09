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
<title>Faculty</title>
<style type="text/css">
body {
	height: 100vh;
	background-image:
		url("https://www.jacaranda.com.au/wp-content/uploads/2016/03/english.jpg");
	background-size : cover;
	background-repeat: no-repeat;
	background-size: cover;
		color: white;
}

input{

border-radius: 10px;
}


</style>
</head>
<body>


	<div class="container">
		<br>
		<h1>Enter Student Details for Mark sheet</h1>

		<form action="ProfServlet" method="post">
			<br>
			<h3>
				Enter Student Enrollment No : <input type="text" name="enroll">
			</h3>
			<br>
			<h3>Enter Marks(out of 100)</h3>
			<p>
				AJ: <input type="text" name="aj">
			</p>
			<p>
				SE: <input type="text" name="se">
			</p>
			<p>
				WT: <input type="text" name="wt">
			</p>
			<p>
				DCDR: <input type="text" name="dcdr">
			</p>
			<p>
				<input type="submit">
			</p>
		</form>

		${mes} <br>
		<h3>
			 <a href="FacultyLogout">Logout</a>
		</h3>
	</div>
</body>
</html>