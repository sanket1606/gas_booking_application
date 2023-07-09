package com.example.gasbooking.controller;

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

import com.example.gasbooking.entity.SurrenderCylinder;
import com.example.gasbooking.service.SurrenderCylinderService;

@RestController
@RequestMapping("/surrendercylinders")
public class SurrenderCylinderController {
	@Autowired
	SurrenderCylinderService service;

	// http://localhost:1111/surrendercylinders/addSurrenderCylinder

	@PostMapping("/addSurrenderCylinder")
	public String addSurrenderCylinder(@RequestBody @Valid SurrenderCylinder surrendercylinder) {
		return service.addSurrenderCylinder(surrendercylinder);
	}

	// http://localhost:1111/surrendercylinders/updateSurrenderCylinder

	@PutMapping("/updateSurrenderCylinder")
	public String updateSurrenderCylinder(@RequestBody @Valid SurrenderCylinder surrendercylinder) {
		return service.updateSurrenderCylinder(surrendercylinder);
	}

	// http://localhost:1111/surrendercylinders/deleteSurrenderCylinder/123

	@DeleteMapping("/deleteSurrenderCylinder/{surrenderId}")
	public String deleteSurrenderCylinder(@PathVariable("surrenderId") int surrenderId) {
		return service.deleteSurrenderCylinder(surrenderId);
	}

	// http://localhost:1111/surrendercylinders/countSurrenderedCylinders
	@GetMapping("/countSurrenderedCylinders")
	public int countSurrenderedCylinders() {
		return service.countSurrenderedCylinders();
	}

}
