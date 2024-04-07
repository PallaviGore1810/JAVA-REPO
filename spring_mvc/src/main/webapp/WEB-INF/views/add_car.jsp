<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="nav_bar.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Page</title>
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
	width: 65px;
	margin-left: 260px;
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
	<div align="center" id="container">
		<h3 id="head">Add Car Details</h3>
		<form action="add_car" method="post">
			<table>
				<tr>
					<td class="label">Name:</td>
					<td><input class="input" type="text" name="name"></td>
				</tr>
				<tr>
					<td class="label">Brand:</td>
					<td><input class="input" type="text" name="brand"></td>
				</tr>
				<tr>
					<td class="label">Price:</td>
					<td><input class="input" type="text" name="price"></td>
				</tr>
			</table>
			<input id="button" type="submit" value="ADD">
		</form>
	</div>
	<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<div>
		<h3 id="message"><%=message%></h3>
	</div>
	<%
	}
	%>
	<div align="center">
		<h3 id="foot">
			Do you want to go to <a href="home">Home Page</a> ?
		</h3>
	</div>
</body>
</html>