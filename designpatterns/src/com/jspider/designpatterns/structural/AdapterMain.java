package com.jspider.designpatterns.structural;

public class AdapterMain {
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.setName("Ram");
		adapter.mensDay();

		adapter.setName("Roma");
		adapter.womensDay();
	}
}
