<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
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
<title>Result</title>
</head>
<body>

	<div class="container">
	<br>
		<br>
		
		
		<h1>${enroll} REPORT CARD</h1>

		<h3>AJ:${ajgrade}</h3>
		<h3>WT:${wtgrade}</h3>
		<h3>SE:${segrade}</h3>
		<h3>DCDR:${dcdrgrade}</h3>
		<h3>Your Percentage is: ${percentage}%</h3>

		${message}
		<br>
		<br>
		<h4>
			<a href="student.jsp">Back</a>
		</h4>
	</div>
</body>
</html>