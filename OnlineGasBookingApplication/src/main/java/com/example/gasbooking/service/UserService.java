package com.example.gasbooking.service;



import com.example.gasbooking.entity.User;

public interface UserService {
	
	public User logIn(User user);
	public User logOut(User user);
	public User changePassword(long id, User user);
	public User createUser(User user);
}

