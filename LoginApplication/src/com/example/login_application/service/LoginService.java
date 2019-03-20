package com.example.login_application.service;

import java.util.HashMap;

import com.example.login_application.dto.User;

public class LoginService {
	
	HashMap<String, String> users = new HashMap<>();
	public LoginService(){
		users.put("john", "John Doe");
		users.put("jane", "Jane Doe");
		users.put("vipul", "Vipul Sharma");
	}
	
	public boolean authenticate(String username, String password) {
		if(password == null || password.trim() == "") {
			return false;
		}
		return true;
	}
	
	public User getUser(String username) {
		User user = new User();
		user.setUsername(username);
		user.setName(users.get(username));
		return user;
	}
}
