package demo.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.product.dao.CustomerRepository;
import demo.product.domain.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Transactional
	public List<Customer> findByName(String name) {
		return customerRepository.findByName(name);
	}
	
	@Transactional
	public Customer getById(Integer id) {
		return customerRepository.findById(id).get();
	}
	
	@Transactional
	public boolean addCustomer(Customer customer) {
		return customerRepository.save(customer)  != null;
	}

	@Transactional
	public boolean updateCustomer(Customer customer) {
		return customerRepository.save(customer)  != null;
	}

	@Transactional
	public List<Customer> getAllCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}

}
