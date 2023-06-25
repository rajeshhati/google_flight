package flight_reservation_app.Service;

import org.springframework.stereotype.Service;

import flight_reservation_app.DTO.ReservationRequest;
import flight_reservation_app.Entity.Reservation;


@Service
public interface reservationService {
	Reservation bookFlight(ReservationRequest request);
}
