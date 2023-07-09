package com.example.gasbooking.exception;



import org.springframework.http.HttpStatus;

public class GasBookingException {
	private final String message;
	private final HttpStatus httpStatus;
	
	public GasBookingException(String message, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
}

