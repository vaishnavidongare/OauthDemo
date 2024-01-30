package com.demo.oauth2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.oauth2.enities.User;
import com.demo.oauth2.repository.UserRepository;
//UserDetailsService interface to load user specific data
@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByUsername(username);
		return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),user.getRoles());
		
	}
public CustomUserDetailsService() {
	// TODO Auto-generated constructor stub
}
}
