package com.jspider.designpatterns.main;

import java.util.Scanner;

import com.jspider.designpatterns.creational.Beverage;
import com.jspider.designpatterns.creational.GingerTea;
import com.jspider.designpatterns.creational.GreenTea;
import com.jspider.designpatterns.creational.LemonTea;
import com.jspider.designpatterns.creational.MasalaTea;

public class FactoryMain {
	public static void main(String[] args) {
		try {
			factory().order();
		} catch (NullPointerException e) {
			System.out.println("No tea ordered!");
			e.printStackTrace();
		}
	}

	private static Beverage factory() {
		Beverage beverage = null;
		System.out.println("Enter 1 to order Masala Tea\n" + "Enter 2 to order Green Tea\n"
				+ "Enter 3 to order Lemon Tea\n" + "Enter 4 to order Ginger Tea\n");
		System.out.println("Enter your choice : ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			beverage = new MasalaTea();
			break;
		case 2:
			beverage = new GreenTea();
			break;
		case 3:
			beverage = new LemonTea();
			break;
		case 4:
			beverage = new GingerTea();
			break;
		default:
			System.out.println("Invalid Input!");
		}
		return beverage;
	}
}
