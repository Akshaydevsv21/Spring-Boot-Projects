package community.foundation.bank.Community_bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import community.foundation.bank.Community_bank.entity.Customer;
import community.foundation.bank.Community_bank.service.CustomerService;

@RestController
public class Bank_controller {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/")
	public String home() {
		return "Welcome to home..";
	}
	
	@RequestMapping("/Customer")
	public List<Customer> getAllCustomer(){
		
		return customerService.getAllCustomer();
		
	}
	
	@RequestMapping("/Customer/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
	
	@PostMapping("/Customer")
	public void addCustomer(@RequestBody Customer customer) {
		 customerService.addCustomer(customer);
	}
	
	@PutMapping("/Customer/{id}")
	public void putCustomer(@PathVariable int id, @RequestBody Customer customer) {
		customerService.putCustomer(id,customer);
	}
	
	@DeleteMapping("/Customer/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
	}
}
