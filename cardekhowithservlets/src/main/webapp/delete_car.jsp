<%@page import="com.jspiders.cardekhowithservlets.jdbc.CarJDBC"%>
<%@page import="com.jspiders.cardekhowithservlets.object.Car"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete car</title>
<style type="text/css">
* {
	padding: 0px;
	margin: 0px;
	box-sizing: border-box;
	font-family: sans-serif;
	
}

body {
	background-color: beige;
}

#box {
	margin-top: 100px;
}

table {
	background-color: grey;
	border: 1px solid black;
	text-align: center;
	color: white;
	font-size: 18px;
}

th {
	height: 30px;
	width: 100px;
	color: white;
	text-align: center;
	background-color: black;
}

#btn {
	height: 30px;
	width: 85px;
	color: white;
	background-color: black;
	border-radius: 10px;
	font-size: 16px;
}

table tr th {
	background-color: black;
	color: white;
	padding: 13px;
}

table tr td {
	background-color: grey;
	color: black;
	padding: 13px;
}

table tr td input {
	border: none;
	outline: none;
	padding: 13px;
}

</style>
</head>
<body>
	<%
	List<Car> cars = CarJDBC.searchAllCar();
	if (cars != null && cars.size() > 0) {
	%>
	<div id="box" align="center">
		<h1>Car Details</h1>
		<br>
		<table id="table">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>MODEL</th>
				<th>BRAND</th>
				<th>FUEL TYPE</th>
				<th>PRICE</th>
				<th>COLOUR</th>
			</tr>
			<%
			for (Car car : cars) {
			%>
			<tr>
				<td><%=car.getId()%></td>
				<td><%=car.getName()%></td>
				<td><%=car.getModel()%></td>
				<td><%=car.getBrand()%></td>
				<td><%=car.getFuelType()%></td>
				<td><%=car.getPrice()%></td>
				<td><%=car.getColour()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>
	<%
	} else {
	%>
	<div align="center">
		<h3>Car details not available!!!</h3>
	</div>
	<%
	}
	%>
	<br>
	<br>
	<div align="center">
		<form action="delete_car" method="post">
			<table id="table2">
				<tr>
					<td>Enter ID to delete car:</td>
					<td><input type="text" name="id"></td>
				</tr>
			</table>
			<br> <input type="submit" id="btn" value="DELETE">
		</form>
	</div>

	<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<div align="center">
		<h3><%=message%></h3>
	</div>
	<%
	}
	%>
</body>
</html>