package com.jhcm.audit.backend.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jhcm.audit.backend.model.User;
import com.jhcm.audit.backend.repositories.UserRepository;

@Service
public class UserService {

	private Logger logger = LoggerFactory.getLogger(UserService.class);

	@Resource
	private UserRepository urepo;

	public User save(User user) {
		return urepo.save(user);
	}

	public User getUser(String userName) {
		logger.debug("Finding user...");
		return urepo.findByUsername(userName);
	}

	public List<User> list() {
		return urepo.findAll();
	}
}
