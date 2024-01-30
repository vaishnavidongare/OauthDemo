package com.demo.oauth2.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.demo.oauth2.enities.Role;
import com.demo.oauth2.enities.RoleRequest;
import com.demo.oauth2.enities.User;
import com.demo.oauth2.repository.RoleRepository;
import com.demo.oauth2.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private RoleRepository roleRepository;
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	
}
