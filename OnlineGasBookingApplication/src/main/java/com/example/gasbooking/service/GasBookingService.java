package com.example.gasbooking.service;


import org.springframework.stereotype.Service;

import com.example.gasbooking.entity.GasBooking;

@Service
public interface GasBookingService {

	public String addBooking(GasBooking gasBooking);
	public String updateBooking(GasBooking gasBooking);
	public String deleteBooking(long gasBookingId);
	public String getBill(long customerId);
    
	
}
