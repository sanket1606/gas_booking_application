package com.example.gasbooking.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gasbooking.entity.GasBooking;

@Repository
public interface GasBookingDao extends JpaRepository<GasBooking, Long> {

	Optional<GasBooking> findByCustomerId(Long customerId);
}
