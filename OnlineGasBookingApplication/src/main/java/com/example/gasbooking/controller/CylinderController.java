package com.example.gasbooking.controller;



import java.util.List;

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

import com.example.gasbooking.entity.Cylinder;
import com.example.gasbooking.service.CylinderService;

@RestController
@RequestMapping("/cylinders")
public class CylinderController {
	@Autowired
	CylinderService service;
	
	// http://localhost:1111/cylinders/addCylinder

		@PostMapping("/addCylinder")
		public String addCylinder(@RequestBody @Valid Cylinder cylinder) {
			return service.addCylinder(cylinder);
		}
		

		// http://localhost:1111/cylinders/updateCylinder

		@PutMapping("/updateCylinder")
		public String updateCylinder(@RequestBody @Valid Cylinder cylinder) {
			return service.updateCylinder(cylinder);
		}
		
		// http://localhost:1111/cylinders/deleteCylinder/123

		@DeleteMapping("/deleteCylinder/{cylinderId}")
		public String deleteCylinder(@PathVariable("cylinderId") int cylinderId) {
			return service.deleteCylinder(cylinderId);
		}
		
		// http://localhost:1111/cylinders/getCylinderByType/
		@GetMapping("/getCylinderByType/{cylinderType}")
		public List<Cylinder> getCylinder(@PathVariable("cylinderType") String cylinderType) {
			return service.getCylinder(cylinderType);
		}


}
