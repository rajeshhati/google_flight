<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Reservation Details</title>
</head>
<body>
	<h2>Your Flight Details</h2>
	
	
	Flight Number: ${flight.flightNumber}</br>
	Operating Airlines: ${flight.operatingAirLines}</br>
	Departure City: ${flight.departureCity}</br>
	Arrival City: ${flight.arrivalCity}</br>
	Date of Departure: ${flight.dateOfDeparture}</br>
	
		<h2>Enter Passenger Details</h2>
		<form action="confirmReservation" method="post">
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
				<td>Middle Name</td>
				<td><input type="text" name="middleName"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"/></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="text" name="phone"/></td>
			</tr>
			</table>
			
		<input type="hidden" name="flightId" value="${flight.id}"/>
		
		<table>
			<tr>
				<td>Card Number</td>
				<td><input type="text" name="cardNumber"/></td>
			</tr>
			<tr>
				<td>Name On Card</td>
				<td><input type="text" name="nameOfCard"/></td>
			</tr>
			<tr>
				<td>CVV</td>
				<td><input type="text" name="cvv"/></td>
			</tr>
			<tr>
				<td>Expire Date</td>
				<td><input type="text" name="expiryDate"/></td>
			</tr>
		</table>
		
		<input type="submit" value="Complete Reservation"/>
		</form>
</body>
</html>