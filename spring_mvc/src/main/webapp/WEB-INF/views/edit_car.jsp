<%@page import="com.jspiders.spring_mvc.dto.CarDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="nav_bar.jsp" />
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
}

#button {
	border: 1px solid;
	background-color: green;
	color: white;
	padding: 10px;
	width: 80px;
	margin-left: 250px;
	margin-top: 25px;
	border-radius: 2px;
	font-size: 15px;
}

#container {
	border: 3px solid;
	height: 365px;
	width: 440px;
	background-color: beige;
	margin-left: 525px;
	margin-top: 80px;
}

.input {
	border: 1px solid;
	padding: 10px;
	width: 250px;
	margin-top: 15px;
	outline: none;
	font-size: 18px;
}

#head {
	font-size: 30px;
	margin-top: 10px;
}

.label {
	font-size: 20px;
	padding-top: 10px;
}

#message {
	font-size: 25px;
	text-align: center;
	margin-left: 13%;
	margin-top: 20px;
}

a {
	text-decoration: none;
}

#foot {
	margin-top: 25px;
	margin-left: 13%;
	text-align: center;
}
</style>
</head>
<body>
	<%
	CarDTO car = (CarDTO) request.getAttribute("car");
	%>
	<div id="container" align="center">
		<h3 id="head">Update Car Details</h3>
		<form action="update_car" method="post">
			<table>
				<tr>
					<td class="label">Id</td>
					<td><input class="input" type="text" name="id"
						value="<%=car.getId()%>" readonly="readonly"></td>
				</tr>
				<tr>
					<td class="label">Name</td>
					<td><input class="input" type="text" name="name"
						value="<%=car.getName()%>" required="required"></td>
				</tr>
				<tr>
					<td class="label">Brand</td>
					<td><input class="input" type="text" name="brand"
						value="<%=car.getBrand()%>" required="required"></td>
				</tr>
				<tr>
					<td class="label">Price</td>
					<td><input class="input" type="text" name="price"
						value="<%=car.getPrice()%>" required="required"></td>
				</tr>
			</table>
			<input id="button" type="submit" value="UPDATE">
		</form>
	</div>
	<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<div align="center">
		<h3 id="message"><%=message%></h3>
	</div>
	<%
	}
	%>
	<h3 id="foot">
		Do you want to go to <a href="home">Home Page</a> ?
	</h3>
</body>
</html>