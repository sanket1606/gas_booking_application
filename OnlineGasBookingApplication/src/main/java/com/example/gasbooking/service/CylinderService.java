package com.example.gasbooking.service;

import java.util.List;

import com.example.gasbooking.entity.Cylinder;


public interface CylinderService {

	public String addCylinder(Cylinder cylinder);

	public String updateCylinder(Cylinder cylinder);

	public String deleteCylinder(int cylinderId);

	public List<Cylinder> getCylinder(String cylinderType);

}
