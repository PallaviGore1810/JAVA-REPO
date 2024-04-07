<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Navigation Page</title>
<style type="text/css">
* {
	padding: 0px;
	margin: 0px;
	box-sizing: border-box;
}

#box {
	height: 60px;
	background-color: black;
	border: 3px solid;
	display: flex;
	justify-content: center;
	align-items: center;
}

a {
	height: 40px;
	width: 60px;
	background-color: gray;
	color: white;
	margin-left: 30px;
	margin-bottom: 5px;
	border-radius: 3px;
	box-shadow: 0px 0px 20px gray; padding : 10px;
	font-size: 20px;
	text-decoration: none;
	padding: 10px;
}

nav {
	width: 100%;
	margin-top: 1px;
	margin-left: 500px;
}
</style>
</head>
<body>

	<div id="box" align="center">
		<nav>
			<a href="add_page">ADD CAR</a> <a href="cars">SHOW CARS</a> <a
				href="my_cars">MY CARS</a> <a href="sign_out">SIGN OUT</a> <a
				href="delete_user">DELETE ACCOUNT</a>
		</nav>
	</div>
</body>
</html>