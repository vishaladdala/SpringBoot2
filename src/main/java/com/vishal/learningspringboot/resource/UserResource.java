package com.vishal.learningspringboot.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.learningspringboot.model.User;
import com.vishal.learningspringboot.service.UserService;


@RestController
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("\fetchUsers")
	public List<User> fetchUsers(){
		return userService.getAllUsers();
	}
	
	
	

}
