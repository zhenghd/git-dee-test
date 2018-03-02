package com.leo.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.leo.springboot.pojo.User;
import com.leo.springboot.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController2 {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list/{userName}")
	public List<User> queryUserByName(@PathVariable String userName) {
		System.out.println("=================="+userName);
		return userService.queryUserByName(userName);
	}
	
	@RequestMapping("/list/all")
	public List<User> queryUsers(){
		return userService.queryUsers();
	}
	
}
