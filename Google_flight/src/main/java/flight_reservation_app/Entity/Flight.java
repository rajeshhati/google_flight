package flight_reservation_app.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flights")
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name= "flight_number", nullable=false, length=45)
	private String flightNumber;
	
	@Column(name= "operating_airLines", nullable=false, length=45)
	private String operatingAirLines;
	
	@Column(name= "departure_city", nullable=false, length=45)
	private String departureCity;
	
	@Column(name= "arrival_city", nullable=false, length=45)
	private String arrivalCity;
	
	@Column(name= "date_of_departure", nullable=false, length=45)
	private Date dateOfDeparture;
	
	@Column(name= "estimated_departure_time", nullable=false, length=45)
	private Date estimatedDepartureTime;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirLines() {
		return operatingAirLines;
	}

	public void setOperatingAirLines(String operatingAirLines) {
		this.operatingAirLines = operatingAirLines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Date getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Date estimatedDepartureTime2) {
		this.estimatedDepartureTime = estimatedDepartureTime2;
	}
	
}
