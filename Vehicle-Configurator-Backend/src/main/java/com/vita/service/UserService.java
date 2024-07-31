package com.vita.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.vita.model.User;

public interface UserService {
	public User createUser( User user);
}
