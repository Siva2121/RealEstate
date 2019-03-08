<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
margin-left: 600px;
margin-top: 150px;
 background-color: lightblue
}
</style>
<div >
<form action="UserLoginController" method="post">
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
					<td colspan="3" align="center"><button type="SUBMIT">SUBMIT</button></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br>
								<a href="Login.html" style="color: purple;"><button
							type="button" >HOME</button></a></td>
							
						
				</tr>
		
			</table>
		
	</form>
</div>
</body>
</html>