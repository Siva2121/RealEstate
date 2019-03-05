<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REAL ESTATE</title>
</head>
<body>
	<form action="Add" method="post">
		<table align="center" border="0">
			<tr>
				<td colspan="3" align="center">REAL ESTATE ENTRY</td>
			</tr>
			<tr>
				<td align="center">FLAT NUMBER</td>
				<td align="center">:</td>
				<td align="center"><input type="text" name="flatNumber"></td>
			</tr>
			<tr>
				<td align="center">AREA</td>
				<td align="center">:</td>
				<td align="center"><input type="text" name="area"></td>
			</tr>
			<tr>
				<td align="center">DISTRICT</td>
				<td align="center">:</td>
				<td align="center"><input type="text" name="district"></td>
			</tr>
			<tr>
				<td align="center">LENGTH</td>
				<td align="center">:</td>
				<td align="center"><input type="text" name="length"></td>
			</tr>
			<tr>
				<td align="center">OWNER NAME</td>
				<td align="center">:</td>
				<td align="center"><input type="text" name="ownerName"></td>
			</tr>
			<tr>
				<td align="center">CONTACT NUMBER</td>
				<td align="center">:</td>
				<td align="center"><input type="number" name="contactNumber"></td>
			</tr>
			<tr>
				<td align="center">AMOUNT</td>
				<td align="center">:</td>
				<td align="center"><input type="number" name="amount"></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="INSERT"></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><a href="home.jsp">HOME</a></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><a href="index.html">LOGOUT</a>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>