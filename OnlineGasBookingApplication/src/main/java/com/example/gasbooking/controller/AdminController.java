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

import com.example.gasbooking.entity.Admin;
import com.example.gasbooking.service.AdminService;


@RestController
@RequestMapping("/admins")
public class AdminController {
	@Autowired
	AdminService service;
	
	// http://localhost:1111/admins/addAdmin
	@PostMapping("/addAdmin")
	public String addAdmin(@RequestBody @Valid Admin admin) {
		return service.addAdmin(admin);
	}
	
	// http://localhost:1111/admins/updateAdmin
	@PutMapping("/updateAdmin")
	public String updateAdmin(@RequestBody @Valid Admin admin) {
		return service.updateAdmin(admin);
	}
	
	// http://localhost:1111/admins/deleteAdmin
	@DeleteMapping("/deleteAdmin")
	public String deleteAdmin(@PathVariable("aid") int adminId) {
		return service.deleteAdmin(adminId);
	}
	
	// http://localhost:1111/admins/getAdmin/aid
	@GetMapping("/getAdmin/{aid}")
	public Admin getAdmin(@PathVariable("aid") int adminId) {
		return service.getAdmin(adminId);
	}
	
	// http://localhost:1111/admins/getAdmins
	@GetMapping("/getAdmins")
	public List<Admin>getAllAdmins(){
		return service.getAllAdmin(); 
	}

}
