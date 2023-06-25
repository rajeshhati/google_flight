<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Flight Details</h2>
	
	<form action="saveflights" method="post">
		<table>
			<tr>
				<td>Flight Number</td>
				<td><input type="text" name="flightNumber"/></td>
			</tr>
			<tr>
				<td>Operating Air Lines</td>
				<td><input type="text" name="operatingAirLines"/></td>
			</tr>
			<tr>
				<td>Departure City</td>
				<td><input type="text" name="departureCity"/></td>
			</tr>
			<tr>
				<td>Arrival City</td>
				<td><input type="text" name="arrivalCity"/></td>
			</tr>
			<tr>
				<td>Date Of Departure</td>
				<td><input type="text" name="dateOfDeparture"/></td>
			</tr>
			<tr>
				<td>Estimated Departure Time</td>
				<td><input type="text" name="estimatedDepartureTime"/></td>
			</tr>
		</table>
		<input type="submit" value="save"/>
	</form>
</body>
</html>