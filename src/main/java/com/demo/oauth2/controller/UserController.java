package com.demo.oauth2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.oauth2.enities.Role;
import com.demo.oauth2.enities.RoleRequest;
import com.demo.oauth2.enities.User;
import com.demo.oauth2.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "Hello"+name;
	}
	
	@PostMapping("/api/saveUser")
	public User saveUser(@RequestBody User user) {
		
		return service.saveUser(user);
	}
	
}
