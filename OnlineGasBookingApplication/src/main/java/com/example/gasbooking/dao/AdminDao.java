package com.example.gasbooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gasbooking.entity.Admin;
import com.example.gasbooking.entity.GasBooking;

public interface AdminDao extends JpaRepository<Admin, Integer> {


}
