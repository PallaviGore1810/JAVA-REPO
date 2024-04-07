package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.Food;
import com.jspiders.multithreading.threads.Customer;
import com.jspiders.multithreading.threads.Restaurant;

public class RestFood {

	public static void main(String[] args) {

		Food food = new Food();

		Customer customer = new Customer(food);
		customer.start();

		Restaurant restaurant = new Restaurant(food);
		restaurant.start();

	}

}
