package com.vishal.learningspringboot.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.vishal.learningspringboot.model.User;

@Repository
public class FakeDataDao implements UserDao{
	
	private static Map<UUID,User> database;
	
	static {
		
		database = new HashMap<>();
		UUID userUid = UUID.randomUUID();
		database.put(userUid, new User(userUid,"Vishal","Addala",22,"vishal@walmart.com"));
	}
	
	@Override
	public List<User> selectAllUsers() {
		// TODO Auto-generated method stub
		return new ArrayList<>(database.values());
	}

	@Override
	public User selectUserbyUserUid(UUID userUid) {
		// TODO Auto-generated method stub
		return database.get(userUid);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		database.put(user.getUserId(), user);
		return 1;
	}

	@Override
	public int deleteUserbyUserUid(UUID userUid) {
		// TODO Auto-generated method stub
		database.remove(userUid);
		return 1;
	}

	@Override
	public int insertUser(UUID userId,User user) {
		// TODO Auto-generated method stub
		database.put(userId,user);
		return 1;
		
	}

	
	
	
}
