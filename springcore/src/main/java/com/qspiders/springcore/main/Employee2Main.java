package com.qspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qspiders.springcore.entity.Employee2;

public class Employee2Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("employee2_config.xml");
		Employee2 employee1 = (Employee2) applicationContext1.getBean("employee1");
		System.out.println(employee1);
		((ClassPathXmlApplicationContext) applicationContext1).close();

		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("employee2_config.xml");
		Employee2 employee2 = (Employee2) applicationContext2.getBean("employee2");
		System.out.println(employee2);
		((ClassPathXmlApplicationContext) applicationContext2).close();

		ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("employee2_config.xml");
		Employee2 employee3 = (Employee2) applicationContext3.getBean("employee3");
		System.out.println(employee3);
		((ClassPathXmlApplicationContext) applicationContext3).close();

		ApplicationContext applicationContext4 = new ClassPathXmlApplicationContext("employee2_config.xml");
		Employee2 employee4 = (Employee2) applicationContext4.getBean("employee4");
		System.out.println(employee4);
		((ClassPathXmlApplicationContext) applicationContext4).close();
	}
}
