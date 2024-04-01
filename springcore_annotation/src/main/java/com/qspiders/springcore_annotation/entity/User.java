package com.qspiders.springcore_annotation.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component(value="user3")
public class User {

	@Value("1")
	private int id;
	@Value("Pallavi")
	private String name;
	@Value("pallavi@gmail.com")
	private String email;
	@Value("Pallavi@1234")
	private String password;
}
