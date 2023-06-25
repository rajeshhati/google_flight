package flight_reservation_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import flight_reservation_app.Entity.User;
import flight_reservation_app.Repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "login/login";
	}
	@RequestMapping("/showRegPage")
	public String showRegPage() {
		return "login/showReg";
	}
	
	//localhost:8080/flights/showReg
		@RequestMapping("/showReg")
		public String Reg() {
			return "login/showReg";
			
		}
		@RequestMapping("/saveReg")
		public String saveRegi(@ModelAttribute("user") User user) {
			userRepo.save(user);
			return "login/login";
			
		}
		@RequestMapping("verifyLogin")
		public String verifyLogin(@RequestParam("email/mobile") String emailid, @RequestParam("password") String password, ModelMap modelMap) {
			User user = userRepo.findByEmail(emailid);
			if (user!=null) {
			if (user.getEmail().equals(emailid) && user.getPassword().equals(password)) {
				return "findFlights";
			}else {
				modelMap.addAttribute("error", "invalid user name and password");
				return "login/login";
			}
			}else {
				modelMap.addAttribute("error", "invalid user name and password");
				return "login/login";
			}
		}
	
	
}
