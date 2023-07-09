package com.example.gasbooking.service;


import java.util.List;

import com.example.gasbooking.entity.Customer;


public interface CustomerService {
public String addCustomer( Customer customer);
	
	public String updateCustomer( Customer customer);

	public String deleteCustomer(int customerId);

	public  Customer getCustomer(int customerId);

	public List< Customer> getAllCustomers();
}

