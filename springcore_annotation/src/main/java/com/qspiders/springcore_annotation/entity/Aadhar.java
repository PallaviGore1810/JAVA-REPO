package com.qspiders.springcore_annotation.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Aadhar {
	@Value("1")
	private int id;
	@Value("123456789012")
	private long aadharNo;
}
