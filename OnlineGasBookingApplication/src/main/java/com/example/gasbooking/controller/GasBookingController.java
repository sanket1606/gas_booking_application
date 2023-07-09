package com.example.gasbooking.controller;

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

import com.example.gasbooking.entity.GasBooking;
import com.example.gasbooking.service.GasBookingService;

@RestController
@RequestMapping("/api")
public class GasBookingController {

	@Autowired
	GasBookingService service;

	// http://localhost:1111/api/addBooking
	@PostMapping("/addBooking")
	public String addNewGasBooking(@RequestBody @Valid GasBooking gasBooking) {
		return service.addBooking(gasBooking);
	}

	// http://localhost:1111/api/updateBooking
	@PutMapping("/updateBooking")
	public String updateBooking(@RequestBody @Valid GasBooking gasBooking) {
		return service.updateBooking(gasBooking);
	}

	// http://localhost:1111/api/deleteBooking
	@DeleteMapping("/deleteBooking/{bookingId}")
	public String deleteBooking(@PathVariable("bookingId") int bookingId) {
		return service.deleteBooking(bookingId);
	}

	// http://localhost:1111/api/getBill/customerId
	@GetMapping("/getBill/{customerId}")
	public String getBill(@PathVariable("customerId") int customerId) {
		return service.getBill(customerId);
	}
}
