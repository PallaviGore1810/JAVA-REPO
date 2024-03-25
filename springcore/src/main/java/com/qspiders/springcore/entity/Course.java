package com.qspiders.springcore.entity;

import java.util.List;

import lombok.Data;

@Data
public class Course {
	private int id;
	private String name;
	private double fees;
	private List<Student> students;
}
