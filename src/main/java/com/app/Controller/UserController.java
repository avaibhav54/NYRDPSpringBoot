package com.app.Controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Models.User;
import com.app.Service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public ResponseEntity<?> getUsers()
	{
		return ResponseEntity.ok(this.userService.getUsers());
	}
	@PostMapping("/")
	public ResponseEntity<?> addUser(@RequestBody User user)
	{
		System.out.println(user);
		
		return ResponseEntity.ok(this.userService.addUser(user));
		
	}
	

}
