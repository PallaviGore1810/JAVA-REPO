package com.qspiders.springcore.entity;

import lombok.Data;

@Data
public class Employee2 {
	private int id;
	private String name;
	private String email;
	private Company2 company2;
}
