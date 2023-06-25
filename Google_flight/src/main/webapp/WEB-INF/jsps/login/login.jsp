<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here</title>
</head>
<body>
	<h2>Login Here</h2>
	${error}
	<form action="verifyLogin" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="email/mobile" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
		</table>
		<input type="submit" value="Sign in"/>
	</form>
	
</body>
</html>