package com.example.gasbooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gasbooking.entity.Cylinder;



@Repository
public interface CylinderDao extends JpaRepository<Cylinder, Integer> {

	void deleteById(int cylinderId);

	List<Cylinder> findByCylinderType(String cylinderType);

}
