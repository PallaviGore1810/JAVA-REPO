package com.qspiders.springcore_annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qspiders.springcore_annotation.config.PersonConfig;
import com.qspiders.springcore_annotation.entity.Person;

public class PersonMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
		((AnnotationConfigApplicationContext) applicationContext).close();
	}
}
