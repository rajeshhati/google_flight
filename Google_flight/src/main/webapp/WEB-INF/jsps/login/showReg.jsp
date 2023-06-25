<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Register Here Yourself Garib Admi If You Wanna Fly!!!!</h2>
	
	<form action="saveReg" method="post">
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName"/></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"/></td>
			</tr>
		</table>
		<input type="submit" value="save"/>
	</form>
</body>
</html>