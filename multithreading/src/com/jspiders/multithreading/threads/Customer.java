package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resource.Food;

public class Customer extends Thread {

	private Food food;

	public Customer(Food food) {
		this.food = food;
	}

	@Override
	public void run() {
		food.order();
	}
}
