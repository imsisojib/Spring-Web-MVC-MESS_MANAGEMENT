package main.webapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.webapp.services.UserService;

@Configuration
public class MyRootConfig {
	@Bean
	public UserService userService() {
		return new UserService();
	}
}
