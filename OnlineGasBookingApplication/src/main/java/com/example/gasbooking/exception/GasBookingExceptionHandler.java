package com.example.gasbooking.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GasBookingExceptionHandler {
	
	@ExceptionHandler(value = {GasBookingNotFoundException.class})
	public ResponseEntity<Object> handleGBNFException
		(GasBookingNotFoundException gasBookingNotFoundException)
	{
		GasBookingException gbe = new GasBookingException(
				gasBookingNotFoundException.getMessage(),
				HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(gbe, HttpStatus.NOT_FOUND);
	}
}
