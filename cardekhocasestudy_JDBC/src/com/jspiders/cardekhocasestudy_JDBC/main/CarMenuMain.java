package com.jspiders.cardekhocasestudy_JDBC.main;

import java.util.Scanner;

import com.jspiders.cardekhocasestudy_JDBC.operations.CarOperation;


public class CarMenuMain {
	static boolean loop = true;
	private static CarOperation carOperations = new CarOperation();

	public static void main(String[] args) {
		while (loop) {
			menu();
		}
	}

	private static void menu() {
		System.out.println("Welcome to car dekho app");
		System.out.println("=====Main Menu====\n" + "1. View All Cars \n" + "2. Search Car \n" + "3. Add Car \n"
				+ "4. Remove Car \n" + "5. Edit Car \n" + "6. Exit \n");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			carOperations.viewAll();
			break;
		case 2:
			carOperations.searchCar(scanner);
			break;
		case 3:
			carOperations.addCar(scanner);
			break;
		case 4:
			carOperations.removeCar(scanner);
			break;
		case 5:
			carOperations.editCar(scanner);
			break;
			
		case 6:
			System.out.println("Thank You For Visiting");
			loop = false;
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

}
