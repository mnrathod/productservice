package demo.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.product.domain.Customer;
import demo.product.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService; 
	
	@ResponseBody
	@PostMapping ("/addCustomer")
	public String addCustomer (@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return "success";
	}
	
	@GetMapping ("/signUp")
	public String signUp () {
		return "signup";
	}

	@PostMapping ("/updateCustomer")
	public String updateCustomer() {
		return "updatecustomer";
	}

	@ResponseBody
	@GetMapping("/customers")
	public List<Customer> getAll() {
		return customerService.getAllCustomers();
	}
}
