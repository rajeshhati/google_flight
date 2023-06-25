package flight_reservation_app.Controller;

import java.security.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import flight_reservation_app.Entity.Flight;
import flight_reservation_app.Repository.flightRepository;
import flight_reservation_app.Service.flightService;

@Controller
public class FligthController {
	
	@Autowired
	private flightService flightservice;
	
	@Autowired
	private flightRepository flightRepo;

	//localhost:8080/flights/addFlight
			@RequestMapping("/addFlight")
			public String addFligth() {
				return "login/addFlight";
			}
			@RequestMapping("/saveflights")
			public String saveflights
			        (
			        @RequestParam("flightNumber") String flightNumber,
					@RequestParam("operatingAirLines") String operatingAirLines,
					@RequestParam("departureCity") String departureCity,
					@RequestParam("arrivalCity") String arrivalCity,
					@RequestParam("dateOfDeparture") @DateTimeFormat(pattern = "MM-dd-yyyy")
			                              Date dateOfDeparture,
			        @RequestParam("estimatedDepartureTime") @DateTimeFormat(pattern = "hh:mm:ss")
                    Date estimatedDepartureTime, 
                    ModelMap model
					) {
				Flight flight = new Flight();
				
				flight.setFlightNumber(flightNumber);
				flight.setOperatingAirLines(operatingAirLines);
				flight.setDepartureCity(departureCity);
				flight.setArrivalCity(arrivalCity);
				flight.setDateOfDeparture(dateOfDeparture);
				flight.setEstimatedDepartureTime(estimatedDepartureTime);
				flightservice.saveFlightInfo(flight);
				return "login/addFlight";
			}
	
	@RequestMapping("/findFlights")
	public String findFlights(
			@RequestParam("from") String from,
			@RequestParam("to") String to,
			@RequestParam("DepartureDate") 
			@DateTimeFormat(pattern = "MM-dd-yyyy") Date DepartureDate, ModelMap modelMap) {
		
		List<Flight> findFlights = flightRepo.findFlights(from, to, DepartureDate);
		modelMap.addAttribute("findFlights", findFlights);
		return"displayFlights";
	}
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId")Long flightId, ModelMap modelMap) {
		
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		
		modelMap.addAttribute("flight", flight);
		return "showCompleteReservation";
	}
}
			

