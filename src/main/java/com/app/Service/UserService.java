package com.app.Service;

import java.util.ArrayList;

import com.app.Models.User;

public interface UserService {

	public User addUser(User user);
	public ArrayList<User> getUsers();
	public ArrayList<User> getUserBuAgeGroup(int agegroupid);
	public ArrayList<User> getUserByGender(String gender);
	public ArrayList<User> getUserByPersonality(int personalityId);
	public ArrayList<User> getUserBySleepHabit(String sleepHabit);
	
}
