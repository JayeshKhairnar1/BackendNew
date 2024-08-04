 package com.vita.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vita.model.User;
import com.vita.repositoty.UserRepository;
import com.vita.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping(value="/register")
	public User createUser(@RequestBody User user) {
		userRepo.save(user);
		return user;
	}

	
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserById(String userid) {
        return userRepo.findById(userid).orElse(null);
    }
	
	
}
