package com.vishal.learningspringboot.model;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class User {
	private final UUID userId;
	private final String firstName;
	private final String lastName;
	//private final Gender gender;
	private final Integer age;
	private final String email;
	
	
	public User(UUID userId, String firstName, String lastName, Integer age, String email) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		//this.gender = gender;
		this.age = age;
		this.email = email;
	}






	public UUID getUserId() {
		return userId;
	}






	public String getFirstName() {
		return firstName;
	}






	public String getLastName() {
		return lastName;
	}







	public Integer getAge() {
		return age;
	}






	public String getEmail() {
		return email;
	}






	
}
