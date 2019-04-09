<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>


<style>
body {
	height: 100vh;
	background-image:
		url("https://www.jacaranda.com.au/wp-content/uploads/2016/03/english.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	background-size: cover;
	color: white;
}

.container3 {
	width: 400px;
	height: 300px;
	padding: 20px;
	text-align: center;
	position: absolute;
	top: 20%;
	left: 25%;
}

.container {
	width: 400px;
	height: 300px;
	padding: 20px;
	text-align: center;
	position: absolute;
	top: 20%;
	left: 35%;
}

.container input {
	display: inline;
	width: 90;
	padding: 0 16px;
	height: 44px;
	text-align: center;
	box-sizing: border-box;
}

.container2 input {
	display: inline;
	width: 100;
	padding: 0 16px;
	height: 44px;
	text-align: center;
	box-sizing: border-box;
}

.txtb {
	margin: 10px 0;
	background: rgba(255, 255, 255, .15);
	border-radius: 6px;
}

.btn1 {
	display: inline;
	width: 20em;
	height: 4em;
	padding: 0 20px;
	text-align: center;
	box-sizing: border-box;
	background-color: rgba(255, 255, 255, .15);
	color: white;
}
</style>
</head>
<body>
	<h1 align="center"
		style="background-color: black; color: white; padding: 35px">REPORT
		CARD GENERATION APP</h1>
	<div class="container">
		<form action="index.html" method="post" class="myform">



			<br> <br> <br>

			<h1>CHOOSE YOUR LOGIN TYPE</h1>
			<br> <br> <br> <a href="student.jsp"><button
					type="button" class="btn1">STUDENT</button></a> <br> <br> <br>
			<br> <a href="facultyLogin.jsp"><button type="button"
					class="btn1">FACULTY</button> </a>


		</form>
	</div>
</body>
</html>
