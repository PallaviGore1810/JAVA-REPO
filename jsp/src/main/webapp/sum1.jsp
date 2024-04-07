<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="sum1.jsp">
			<table>
				<tr>
					<td>Num1</td>
					<td><input type="text" name="num1"></td>
				</tr>
				<tr>
					<td>Num2</td>
					<td><input type="text" name="num2"></td>
				</tr>
			</table>
			<input type="submit" value="ADD">
		</form>
	</div>
	<%!int num1, num2, sum;%>
	<%
	String inp1 = request.getParameter("num1");
	String inp2 = request.getParameter("num2");
	if (inp1 != null && inp2 != null) {
		num1 = Integer.parseInt(inp1);
		num2 = Integer.parseInt(inp2);
		sum = num1 + num2;
	%>
	<div align="center">
		<h4>
			Sum of
			<%=num1%>
			and
			<%=num2%>
			is
			<%=sum%>
		</h4>
	</div>

	<%
	}
	%>
</body>
</html>