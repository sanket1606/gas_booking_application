package com.example.gasbooking.exception;

public class GasBookingNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public GasBookingNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public GasBookingNotFoundException(String message) {
		super(message);
	}

}
