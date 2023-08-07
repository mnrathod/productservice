package demo.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	
	@GetMapping ("/login")
	public String login () {
		return "loginform";
	}

	@GetMapping ("/mobile")
	public String mobile() {
		return "mobileform";
	}
		
}
