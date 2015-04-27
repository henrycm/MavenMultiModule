package com.jhcm.audit.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jhcm.audit.backend.model.User;
import com.jhcm.audit.backend.repositories.UserRepository;

@Configuration
public class InitialDataConfig {

	@Bean
	public InitializingBean insertDefaultUsers() {
		return new InitializingBean() {
			@Autowired
			private UserRepository userRepository;

			public void afterPropertiesSet() {
				addUser("admin", "admin");
				addUser("user", "user");
			}

			private void addUser(String username, String password) {
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				userRepository.save(user);
			}
		};
	}

}
