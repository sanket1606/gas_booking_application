package com.example.gasbooking.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gasbooking.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{
	

}
