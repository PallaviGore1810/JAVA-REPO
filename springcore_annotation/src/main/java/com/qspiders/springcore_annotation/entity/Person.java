package com.qspiders.springcore_annotation.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Scope(value = "prototype")
@Component
@Data
public class Person {
	@Value("1")
	private int id;
	@Value("Ram")
	private String name;
	@Value("ram@gmail.com")
	private String email;
	@Autowired
	private Aadhar aadhar;
	@Autowired
	private PanCard panCard;
}
