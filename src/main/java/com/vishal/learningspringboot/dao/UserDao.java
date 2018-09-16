package com.vishal.learningspringboot.dao;

import java.util.List;
import java.util.UUID;



import com.vishal.learningspringboot.model.User;

public interface UserDao {
	
	List<User> getAllUsers();
	
	User getUser(UUID userUid);
	
	int updateUser(User user);
	
	int removeUser(UUID userUid);
	
	int insertUser(User user);
	
}
