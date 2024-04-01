package com.qspiders.springcore_annotation.config;

import org.springframework.context.annotation.Bean;

import com.qspiders.springcore_annotation.entity.User;

public class UserConfig {

	@Bean(name="user")
	public User getUser() {
		return new User();
	}
}
