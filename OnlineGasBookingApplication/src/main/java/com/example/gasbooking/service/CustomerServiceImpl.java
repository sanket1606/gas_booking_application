package com.example.gasbooking.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gasbooking.dao.CustomerDao;
import com.example.gasbooking.entity.Customer;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao dao;
	
	@Override
	public String addCustomer(Customer customer) {
		dao.save(customer);
		return "customer Inserted Successfully";
	}

	@Override
	public String updateCustomer(Customer customer) {
		dao.save(customer);
		return "customer Updated Successfully";
	}

	@Override
	public String deleteCustomer(int customerId) {
		dao.deleteById(customerId);
		return "customer Deleted Successfully";
	}

	@Override
	public Customer getCustomer(int customerId) {
		Optional<Customer>customer=dao.findById(customerId);
		return customer.get();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return dao.findAll();
	}

}

