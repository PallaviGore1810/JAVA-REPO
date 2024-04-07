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
	<div align="center" id="box" >
		<h3 id="head">Sign Up</h3>
		<form action="add_user" method="post">
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
			<input type="submit" id="button" value="Sign Up">
		</form><br/>
		<h3>
			Do you want to <a href="sign_in">Sign in</a> ?
		</h3>
	</div>
</body>
</html>