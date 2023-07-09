package com.example.gasbooking.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gasbooking.dao.UserDao;
import com.example.gasbooking.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao dao;
	@Override
	public User logIn(User user) {
		User savedUser = dao.findByUserId(user.getUserId());
	    if (savedUser == null) {
	        savedUser = dao.save(user);
	        System.out.println("New user Signed Up: " + savedUser);
	    }
	    if (savedUser.getPassword().equals(user.getPassword())) {
	        savedUser.setStatus(true);
	        dao.save(savedUser);
	        System.out.println("User Signed In: " + savedUser);
	    } else {
	        System.out.println("User Sign In Is Failed For: " + user);
	    }
	    return null;
	}

	@Override
	public User logOut(User user) {
		User savedUser = dao.findByUserId(user.getUserId());
	    if (savedUser != null && savedUser.isStatus()) {
	        savedUser.setStatus(false);
	        dao.save(savedUser);
	        System.out.println("User " + user.getUserId() + " has been Signed out.");
	    } else {
	        System.out.println("User " + user.getUserId() + " has not Signed in yet.");
	    }
	    return null;
	}

	@Override
	public User changePassword(long id, User user) {
		
		Optional<User> optionalUser = dao.findById(id);
		if (optionalUser.isPresent()) {
			User existingUser = optionalUser.get();
			existingUser.setPassword(user.getPassword());
			User updatedUser = dao.save(existingUser);
			System.out.println("Password updated in the database: " + updatedUser);
			return updatedUser;
		} else {
			System.out.println("User not found with id " + id);
		}
		return null;
	}
	 public User createUser(User user) {
	        User savedUser = dao.save(user);
	        System.out.println("New user Created: " + savedUser);
	        return savedUser;
	    }

	
	
}
