<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flights</title>
</head>
<body>
	<h2>Find Flights</h2>
	<form action="findFlights" method="post">
	<table>
			<tr>
				<td>From</td>
				<td><input type="text" name="from" /></td>
			</tr>
			<tr>
				<td>To</td>
				<td><input type="text" name="to" /></td>
			</tr>
			<tr>
				<td>Departure Date</td>
				<td><input type="text" name="DepartureDate" /></td>
			</tr>
		</table>
		<input type="submit" value="search"/>
	
	</form>
</body>
</html>