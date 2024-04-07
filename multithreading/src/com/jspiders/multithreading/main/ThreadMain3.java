package com.jspiders.multithreading.main;

import com.jspiders.multithreading.threads.MyThread3;
import com.jspiders.multithreading.threads.MyThread4;

public class ThreadMain3 {
	public static void main(String[] args) {

		MyThread3 myThread3 = new MyThread3();
		MyThread4 myThread4 = new MyThread4();
		myThread3.start();
		myThread4.start();

	}
}
