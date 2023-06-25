package flight_reservation_app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flight_reservation_app.Entity.Flight;
import flight_reservation_app.Repository.flightRepository;

@Service
public class flighthServiceImpl implements flightService {

	
	@Autowired
	private flightRepository flightRepo;
	
	@Override
	public void saveFlightInfo(Flight flight) {
		flightRepo.save(flight);
	}

}
