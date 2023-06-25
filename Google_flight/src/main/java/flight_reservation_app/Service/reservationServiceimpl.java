package flight_reservation_app.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flight_reservation_app.DTO.ReservationRequest;
import flight_reservation_app.Entity.Flight;
import flight_reservation_app.Entity.Passenger;
import flight_reservation_app.Entity.Reservation;
import flight_reservation_app.Repository.ReservationRepository;
import flight_reservation_app.Repository.flightRepository;
import flight_reservation_app.Repository.passengerRepository;
import flight_reservation_app.utilities.PDFgenerator;

@Service
public class reservationServiceimpl implements reservationService {

	@Autowired
	private passengerRepository passengerRepo;
	
	@Autowired
	private flightRepository flightRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	@Autowired
	private PDFgenerator pdfGenerator;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		String filePath = "D:\\tickets\\bookings\\";
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		
		passengerRepo.save(passenger);
		
		Long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		
		reservationRepo.save(reservation);
		
		
//		pdf.generationPDF(filePath+reservation.getId()+".pdf", request.getFirstName(), request.getEmail(),request.getPhone(),flight.getOperatingAirLines(), flight.getDateOfDeparture(), flight.getDepartureCity(),flight.getArrivalCity());
		pdfGenerator.generationPDF(reservation, filePath);
		
		return reservation;
	}

}
