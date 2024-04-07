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
}

#button {
	border: 1px solid;
	background-color: green;
	color: white;
	border-radius: 3px;
	padding: 10px;
	padding-top:50px
	width: 75px;
	margin-left: 280px;
	margin-top: 20px;
	font-size: 15px;
}

#box {
	border: 3px solid;
	height: 330px;
	width: 440px;
	background-color: beige;
	margin:100px auto;
}

.input {
	border: 1px solid;
	padding: 10px;
	width: 250px;
	margin-top: 10px;
}

#head {
	font-size: 30px;
}

.label {
	font-size: 20px;
	padding-top: 10px;
}

#message {
	text-align:center;
	font-size: 25px;
}

a {
	text-decoration: none;
}
</style>
</head>
<body>
	<div id="box" align="center">
		<h3 id="head">Sign In</h3>
		<form action="check_user" method="post">
			<table>
				<tr>
					<td class="label">Email</td>
					<td><input class="input" type="text" name="email"
						required="required" autofocus="autofocus"></td>
				</tr>
				<tr>
					<td class="label">Password</td>
					<td><input class="input" type="text" name="password"
						required="required"></td>
				</tr>
			</table>
			<input id="button" type="submit" value="Sign In">
		</form>
		<h3>
			New User? <a href="sign_up">Sign up</a>
		</h3>
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

</body>
</html>