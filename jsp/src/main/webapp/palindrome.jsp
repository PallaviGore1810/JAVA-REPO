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
		<form action="palindrome.jsp">
			<table>
				<tr>
					<td><input type="number" placeholder="Enter number" name="num"></td>
					<td><input type="submit" value="verify"></td>
				</tr>
			</table>
		</form>
	</div>

	<%!
	int num, rem, sum = 0;
	%>
	<%
	String inp1 = request.getParameter("num");
	if (inp1 != null) {
		num = Integer.parseInt(inp1);
		int temp = num;
		while (num > 0) {
			for (int i = 0; i < num; i++) {
		rem = num % 10;
		sum = (sum * 10) + rem;
		num = num / 10;
			}
		}
		if (sum == temp) {
	%>
	<div align="center">
		<h3><%=inp1%>
			is Palindrome
		</h3>
	</div>
	<%
	} else {
	%>
	<div align="center">
		<h3><%=inp1%>
			is not Palindrome
		</h3>
	</div>
	<%
	}
	}
	%>
</body>
</html>