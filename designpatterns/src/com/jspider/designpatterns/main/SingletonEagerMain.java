package com.jspider.designpatterns.main;

import com.jspider.designpatterns.creational.SingletonEager;

public class SingletonEagerMain {
	public static void main(String[] args) {
		SingletonEager singletonEager1 = SingletonEager.getObject();
		System.out.println(singletonEager1);

		SingletonEager singletonEager2 = SingletonEager.getObject();
		System.out.println(singletonEager2);
	}
}
