package com.app.Service.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Models.User;
import com.app.Repositories.UserRepository;
import com.app.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	@Override
	public ArrayList<User> getUsers() {
		// TODO Auto-generated method stub
		return new ArrayList<>(this.userRepository.findAll());
	}


}
