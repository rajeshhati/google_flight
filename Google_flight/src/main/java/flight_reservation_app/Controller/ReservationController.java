package flight_reservation_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import flight_reservation_app.DTO.ReservationRequest;
import flight_reservation_app.Entity.Reservation;
import flight_reservation_app.Service.reservationService;

@Controller
public class ReservationController {
	
	@Autowired
	private reservationService reservationService;
	
	@RequestMapping("/confirmReservation")
	public String confirmReservation(ReservationRequest request, ModelMap modelMap) {
		
		Reservation reservationid = reservationService.bookFlight(request);
		modelMap.addAttribute("reservationid", reservationid.getId());
		
		return "confirmReservation";
		
	}
}
