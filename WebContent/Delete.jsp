<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REAL ESTATE</title>
</head>
<style>
body{
margin-left: 500px;
margin-top: 150px;
}
</style>

<body  bgcolor="#E6E6FA">
	<form action="Delete" method="post">
		<table>
			<tr>
				<td colspan="3" align="center">DETAILS REMOVING</td>
			</tr>
			<tr>
				<td align="center">FLAT NUMBER</td>
				<td align="center">:</td>
				<td align="center"><input type="text" name="flatNumber"></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit" name="but"
					value="SUBMIT"></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><a href="Home.jsp">HOME</a></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><a href="Login.html">LOGOUT</a>
				</td>
			</tr>
		</table>
</form>
</body>
</html>