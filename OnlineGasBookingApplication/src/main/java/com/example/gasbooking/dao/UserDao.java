package com.example.gasbooking.dao;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gasbooking.entity.User;

public interface UserDao extends JpaRepository<User,Integer>{
	Optional<User> findById(long id);

	User findByUserId(String userId);
}

