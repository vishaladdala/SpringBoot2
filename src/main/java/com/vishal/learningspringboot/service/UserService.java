package com.vishal.learningspringboot.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.learningspringboot.dao.UserDao;
import com.vishal.learningspringboot.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.selectAllUsers();
	}

	
	public User getUser(UUID userUid) {
		// TODO Auto-generated method stub
		return userDao.selectUserbyUserUid(userUid);
	}

	
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		
		return 1;
	}

	
	public int removeUser(UUID userUid) {
		// TODO Auto-generated method stub
		return 1;
	}

	
	public int insertUser(UUID userId,User user) {
		// TODO Auto-generated method stub
		return 1;
		
	}

}
