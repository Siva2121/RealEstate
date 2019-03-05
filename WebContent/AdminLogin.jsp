<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
margin-left: 600px;
margin-top: 150px;
}
</style>
<body bgcolor="#E6E6FA">
<form action="LoginController" method="post">
			<table>
				<tr>
					<td colspan="3" align="center"><h1>LOGIN</h1>
						<br>
					<br></td>
				</tr>
				<tr>
					<td align="center"><label class="col-form-label-lg">USERNAME</label></td>
					<td align="center">:</td>
					<td align="center"><input type="text" name="userName" required="required"></td>
				</tr>
				<tr>
					<td align="center"><label class="col-form-label-lg">PASSWORD</label></td>
					<td align="center">:</td>
					<td align="center"><input type="password" name="password" required="required" ></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><label style="color: red">${ERROR_MSG}</label></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br><button type="SUBMIT">SUBMIT</button></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br>
								<a href="Login.html" style="color: purple;"><button
							type="button" >HOME</button></a></td>
							
						
				</tr>
			</table>
		</div>
	</form>
</body>
</html>