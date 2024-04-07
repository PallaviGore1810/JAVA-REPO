<%@page import="com.jspiders.cardekhowithservlets.object.Car"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Car</title>
<style type="text/css">
* {
	padding: 0px;
	margin: 0px;
	box-sizing: border-box;
	font-family: sans-serif;
}

h1 {
	margin-top: -40px;
}

body {
	background-color: beige;
	font-size: 18px;
}

#box {
	margin-top: 100px;
}

#table1 {
	border: 1px solid black;
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
	List<Car> cars = (List<Car>) request.getAttribute("cars");
	if (cars != null && cars.size() > 0) {
	%>
	<div align="center" id="box">
		<h1 align="center">CAR DETAILS</h1>
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
</body>
</html>