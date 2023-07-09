package com.example.gasbooking.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gasbooking.entity.User;
import com.example.gasbooking.service.UserService;
@RestController
@Component
public class UserController {
	@Autowired
	UserService service;
	
	// http://localhost:1111/users
	@PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }
	
	// http://localhost:1111/login
	@PostMapping("/logIn")
	public User logIn(@RequestBody User user) {
	return service.logIn(user);
		
	}

	// http://localhost:1111/signout
	@PostMapping("/signOut")
	public User signOut(@RequestBody User user) {
		return service.logOut(user);
	}

	// http://localhost:1111/changepassword/id
	@PutMapping("/changePassword/{id}")
	public User changePassword(@PathVariable long id, @RequestBody User user) {
		return service.changePassword(id, user);
	}
	
}
