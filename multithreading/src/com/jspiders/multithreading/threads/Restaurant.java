package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resource.Food;

public class Restaurant extends Thread {

	private Food food;

	public Restaurant(Food food) {
		this.food = food;
	}

	@Override
	public void run() {
		food.prepare();
	}
}
