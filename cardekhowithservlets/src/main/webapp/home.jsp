<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
* {
	padding: 0px;
	margin: 0px;
	box-sizing: border-box;
	font-family: sans-serif;
}

body {
	height: 100vh;
	width: 100%;
	background-image:
		url("https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/1cac9c76940585.5c786dc5bc866.jpg");
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}

h1 {
	text-shadow:red;
	padding-top: 10px;
	text-align: center;
	color: white;
	font-size: 34px;
	font-style: oblique;
	font-weight: bold;
}

header nav {
	padding: 50px 25px;
}

header nav div a {
	display: flex;
	flex-direction: row;
	padding: 10px 15px;
	border: 1px solid transparent;
	border-radius: 2px;
	text-decoration: none;
	font-weight: bold;
	font-size: 28px;
	font-style: italic; text-shadow : gray;
	color: white;
	margin-left: -25px;
	text-shadow: gray; color : white; margin-left : -25px;
	margin-top: 20px;
}

header nav div {
	margin-left: 3%;
}
</style>
</head>
<body>
	<h1>WELCOME TO CAR DEKHO</h1>
	<header>
		<nav>
			<div>
				<a href="https://www.cardekho.com/">ABOUT US</a>
				<a href="http://localhost:8080/cardekhowithservlets/search_car">SHOW CARS</a>
				<a href="http://localhost:8080/cardekhowithservlets/add_car.jsp">ADD CAR</a>
				<a href="http://localhost:8080/cardekhowithservlets/search_car1.jsp">SEARCH CAR</a>
				<a href="http://localhost:8080/cardekhowithservlets/update_car1.jsp">UPDATE CAR</a>
				<a href="http://localhost:8080/cardekhowithservlets/delete_car.jsp">DELETE CAR</a>
			</div>
		</nav>
	</header>
</body>
</html>