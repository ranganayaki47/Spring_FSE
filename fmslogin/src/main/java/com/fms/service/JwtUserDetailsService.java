package com.fms.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fms.entity.DashBoard;
import com.fms.repository.UserRepository;

import reactor.core.publisher.Mono;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository UserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Mono<com.fms.entity.User> userData = UserRepository.findByEmail(username);
		return new User(username, userData.block().getPassword(),new ArrayList<>());
		
	}

}