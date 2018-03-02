package com.leo.springboot.service;

import java.util.List;

import com.leo.springboot.pojo.User;

public interface UserService {
	public List<User> queryUserByName(String name);
	
	public List<User> queryUsers();
}
