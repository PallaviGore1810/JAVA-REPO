<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
	background-color: beige;
	font-size: 18px;
}
#box {
	margin-top: 100px;
}

#table1 {
	background-color: grey;
	border: 1px solid black;
	text-align: center;
	color: white;
}

#btn {
	height: 30px;
	width: 85px;
	color: white;
	background-color: black;
	border-radius: 10px;
	font-size: 16px;
}


</style>

</head>
<body>
	<div align="center" id="box">
		<form action="update_car" method="post">
			<table id="table1">
				<tr>
					<td>Enter ID to update car:</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>Enter new car name to update:</td>
					<td><input type="text" name="name"></td>
				</tr>
			</table>
			<br>
			<input id="btn" type="submit" value="UPDATE">
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