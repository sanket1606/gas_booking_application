package com.example.gasbooking.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gasbooking.dao.GasBookingDao;
import com.example.gasbooking.entity.GasBooking;
import com.example.gasbooking.exception.GasBookingNotFoundException;

import javax.transaction.Transactional;

@Service
@Transactional
public class GasBookingServiceImpl implements GasBookingService {
	@Autowired
	GasBookingDao dao;
	
	@Override
	public String addBooking(GasBooking gasBooking) {
		dao.save(gasBooking);
		return "Gas Booked Successfully.. Your Booking Id is: "+gasBooking.getGasBookingId();
	}

	@Override
	public String updateBooking(GasBooking gasBooking) {
		Optional<GasBooking> booking = dao.findById(gasBooking.getGasBookingId());
		if(booking.isEmpty()) {
			throw new GasBookingNotFoundException("Gas Booking ID "+ gasBooking.getGasBookingId() + " is not valid");
		}else {
			dao.save(gasBooking);
			return "Booking Updated Successfully";
		}
	}

	@Override
	public String deleteBooking(long gasBookingId) {
		Optional<GasBooking> booking = dao.findById(gasBookingId);
		if(booking.isEmpty()) {
			throw new GasBookingNotFoundException("Gas Booking ID "+ gasBookingId + " is not valid");
		}else {
			dao.deleteById(gasBookingId);
			return "Booking Deleted Successfully";
		}
	}

	@Override
	public String getBill(long customerId) {
		Optional<GasBooking> booking = dao.findByCustomerId(customerId);
		if(booking.isEmpty()) {
			throw new GasBookingNotFoundException("No Booking with Customer ID : "+ customerId + " found");
		}else {
			return "Your bill is: "+booking.get().getBill();
		}
	}
	
}

