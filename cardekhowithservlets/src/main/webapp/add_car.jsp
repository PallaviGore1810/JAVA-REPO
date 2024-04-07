<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddCar</title>
<style type="text/css">
body {
	background-color: beige;
}

#table {
	background-color: gray;
	border-radius: 5px;
	height: 260px;
	width: 305px;
	font-size: 22px;
}

input {
	height: 24px;
	border: none;
	outline: none;
	margin-left: 14px;
	font-size: 20px;
	margin-left: 14px;
}

#btn {
	height: 30px;
	width: 85px;
	color: white;
	background-color: black;
	border-radius: 10px;
	font-size: 20px;
}

h4 {
	font-size: 22px;
}
</style>
</head>
<body>
	<div align="center">
		<h1>Add a new car</h1>
		<form action="add_car" method="post">
			<table id="table">
				<tr>
					<td>Id</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Model</td>
					<td><input type="text" name="model"></td>
				</tr>
				<tr>
					<td>Brand</td>
					<td><input type="text" name="brand"></td>
				</tr>
				<tr>
					<td>FuelType</td>
					<td><input type="text" name="fuelType"></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><input type="text" name="price"></td>
				</tr>
				<tr>
					<td>Colour</td>
					<td><input type="text" name="colour"></td>
				</tr>
			</table>
			<br> <input type="submit" id="btn" name="ADD">
		</form>
	</div>
	<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<h4 align="center"><%=message%></h4>
	<%
	}
	%>

</body>
</html>