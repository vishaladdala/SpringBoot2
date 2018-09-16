package com.vishal.learningspringboot.dao;

import java.util.List;
import java.util.UUID;



import com.vishal.learningspringboot.model.User;

public interface UserDao {
	
	List<User> selectAllUsers();
	
	User selectUserbyUserUid(UUID userUid);
	
	int updateUser(User user);
	
	int deleteUserbyUserUid(UUID userUid);
	
	int insertUser(UUID userId,User user);
	
}
