package com.qspiders.springcore_annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qspiders.springcore_annotation.config.UserConfig;
import com.qspiders.springcore_annotation.entity.User;

public class UserMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(UserConfig.class);
		User user1 = (User) applicationContext1.getBean(User.class);// using class name to get object of the class
		System.out.println(user1);
		((AnnotationConfigApplicationContext) applicationContext1).close();

		ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(UserConfig.class);
		User user2 = (User) applicationContext2.getBean("user");// providing the name given to bean in config class
		System.out.println(user2);
		((AnnotationConfigApplicationContext) applicationContext2).close();

		ApplicationContext applicationContext3 = new AnnotationConfigApplicationContext(
				"com.qspiders.springcore_annotation");// give base package name it will search for class with @component
														// annotation in base package provided
		User user3 = (User) applicationContext3.getBean("user3");
		System.out.println(user3);
		((AnnotationConfigApplicationContext) applicationContext3).close();
	}
}
