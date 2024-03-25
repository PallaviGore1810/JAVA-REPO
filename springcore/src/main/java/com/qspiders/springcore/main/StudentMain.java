package com.qspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qspiders.springcore.entity.Course;
import com.qspiders.springcore.entity.Student;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("student_config.xml");
		Student student1 = (Student) applicationContext1.getBean("student1");
		System.out.println(student1);
		((ClassPathXmlApplicationContext) applicationContext1).close();

		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("student_config.xml");
		Course course1 = (Course) applicationContext2.getBean("course3");
		System.out.println(course1);
		((ClassPathXmlApplicationContext) applicationContext2).close();
//	}
	}
}
