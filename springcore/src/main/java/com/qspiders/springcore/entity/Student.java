package com.qspiders.springcore.entity;

import java.util.List;

import lombok.Data;

@Data
public class Student {
	private int id;
	private String name;
	private String email;
	private List<Course> courses;
}
