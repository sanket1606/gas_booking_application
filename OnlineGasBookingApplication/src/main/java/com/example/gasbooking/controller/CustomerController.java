package com.example.gasbooking.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gasbooking.entity.Customer;
import com.example.gasbooking.service.CustomerService;


@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	CustomerService service;
	
	// http://localhost:1111/customers/addCustomer

		@PostMapping("/addCustomer")
		public String addCustomer(@RequestBody @Valid Customer customer) {
			return service.addCustomer(customer);
		}
		
		// http://localhost:1111/customers/updateCustomer

		@PutMapping("/updateCustomer")
		public String updateCustomer(@RequestBody @Valid Customer customer) {
			return service.updateCustomer(customer);
		}
		
		// http://localhost:1111/customers/deleteCustomer/123

		@DeleteMapping("/deleteCustomer/{cid}")
		public String deleteCustomer(@PathVariable("cid") int customerId) {
			return service.deleteCustomer(customerId);
		}
		

		// http://localhost:1111/customers/getCustomer/123
		@GetMapping("/getCustomer/{eid}")
		public Customer getCustomer(@PathVariable("eid") int customerId) {
			return service.getCustomer(customerId);
		}
		
		// http://localhost:1111/customers/getCustomers
		@GetMapping("/getCustomers")
		public List<Customer> getAllCustomers() {
			return service.getAllCustomers();
		}
}

