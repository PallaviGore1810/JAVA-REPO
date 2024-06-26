package com.jspider.designpatterns.main;

import com.jspider.designpatterns.creational.SingletonLazy;

public class SingletonLazyMain {
	public static void main(String[] args) {
		SingletonLazy singletonLazy1 = SingletonLazy.getObject();
		System.out.println(singletonLazy1);

		SingletonLazy singletonLazy2 = SingletonLazy.getObject();
		System.out.println(singletonLazy2);
	}
}
