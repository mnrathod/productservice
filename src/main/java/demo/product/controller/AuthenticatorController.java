package demo.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import demo.product.domain.Customer;

@Controller
public class AuthenticatorController {

	@PostMapping ("/authenticate")
	public String authenticate (@RequestBody Customer customer) {
		return "addcustomer";
	}

}
