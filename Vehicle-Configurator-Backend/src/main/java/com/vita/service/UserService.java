package com.vita.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.vita.model.User;
import com.vita.model.Vehicle;

public interface UserService {
	User createUser(User user);

	User getUserByEmail(String email);

	User getUserById(String userid);

}
