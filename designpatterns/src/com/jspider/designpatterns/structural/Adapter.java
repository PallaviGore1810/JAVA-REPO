package com.jspider.designpatterns.structural;

public class Adapter extends Employee implements Event {

	@Override
	public void womensDay() {
		System.out.println("The chief guest for Womens day is " + getName());
	}

	@Override
	public void mensDay() {
		System.out.println("The chief guest for Mens day is " + getName());
	}

}
