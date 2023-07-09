package com.example.gasbooking.entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gasbooking_Info")
public class GasBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="gasBookingId")
	private Long gasBookingId;
	
	@Column(name="CustomerId")
	private Long customerId;
	
	@Column(name="BookingDate")
	private LocalDate bookingDate;
	
	@Column(name="Status")
	private boolean status;
	
	@Column(name="bill")
	private float bill;
	
	//------------------------Constructors--------------------------------
	public GasBooking() {
		super();
	}
	public GasBooking(Long gasBookingId, Long customerId, LocalDate bookingDate, boolean status, float bill) {
		super();
		this.gasBookingId = gasBookingId;
		this.customerId = customerId;
		this.bookingDate = bookingDate;
		this.status = status;
		this.bill = bill;
	}
	
	//------------------------Getters and Setters--------------------------------
	public Long getGasBookingId() {
		return gasBookingId;
	}
	public void setGasBookingId(Long gasBookingId) {
		this.gasBookingId = gasBookingId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
	}
	
	
	//------------------------toString--------------------------------
	@Override
	public String toString() {
		return "GasBooking [gasBookingId=" + gasBookingId + ", customerId=" + customerId + ", bookingDate="
				+ bookingDate + ", status=" + status + ", bill=" + bill + "]";
	}
	
}
