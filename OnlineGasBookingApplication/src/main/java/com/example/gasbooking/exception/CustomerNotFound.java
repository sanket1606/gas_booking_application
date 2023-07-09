package com.example.gasbooking.exception;

public class CustomerNotFound extends RuntimeException {
	public CustomerNotFound(String message) {
		super(message);
	}
}
