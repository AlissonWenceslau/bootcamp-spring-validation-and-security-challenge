package com.devsuperior.bds04.services;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.devsuperior.bds04.entities.User;
import com.devsuperior.bds04.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(UserService.class);
	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByEmail(username);
		if(user == null) {
			logger.error("Not Fount: " + username);
			throw new UsernameNotFoundException(" Email Not Found: " + username);
		}
		logger.info("Found User: " + username);
		return user;
	}
}
