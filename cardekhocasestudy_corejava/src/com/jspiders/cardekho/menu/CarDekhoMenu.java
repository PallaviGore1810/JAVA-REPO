package com.jspiders.cardekho.menu;

import java.util.Scanner;

import com.jspiders.cardekho.operations.CarOperations;

public class CarDekhoMenu {
	static CarOperations op = new CarOperations();
	static boolean flag = true;

	public static void main(String[] args) {
		while (flag) {
			mainMenu();
		}
	}

	private static void mainMenu() {

		System.out.println("=====MENU=====\n" + "1.View all cars\n" + "2.Search Car\n" + "3.Add Car\n"
				+ "4.Remove Car\n" + "5.Edit Car\n" + "6.Exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			op.viewCar();
			break;
		case 2:
			System.out.println("=====Search Car=====\n" + "1.Search by name\n" + "2.Search by Brand\n"
					+ "3.Search by Fuel Type\n" + "4.Search by Price Range\n" + "5.Go back to menu");
			int choice1 = sc.nextInt();
			switch (choice1) {
			case 1:
				System.out.println("Enter Car Name: ");
				String name = sc.next();
				op.searchByName(name);
				break;
			case 2:
				System.out.println("Enter Car Brand: ");
				String brand = sc.next();
				op.searchByBrand(brand);
				break;
			case 3:
				System.out.println("Enter Car Fuel-Type: ");
				String FuelType = sc.next();
				op.searchByFuelType(FuelType);
				break;
			case 4:
				System.out.println("Enter Price Range: ");
				double MinimunPrice = sc.nextDouble();
				double MaximumPrice = sc.nextDouble();
				op.searchByPrice(MinimunPrice, MaximumPrice);
				break;
			case 5:
				mainMenu();
				break;
			default:
				System.out.println("Invalid input.Please try again!\n");
				break;
			}
			break;
		case 3:
			op.addCar();
			break;
		case 4:
			System.out.println("Enter Car Id You Want to Remove: ");
			int id = sc.nextInt();
			op.removeCar(id);
			break;
		case 5:
			System.out.println("Enter Car Id to Update the Car Details: ");
			int id2 = sc.nextInt();
			System.out.println("Enter what you want to update: \n" + "1.Update Car Name: \n" + "2.Update Car Brand \n"
					+ "3.Update Car Model: \n" + "4.Update Car Fuel Type: \n" + "5.Update Car Price: \n"
					+ "6.Go back to Menu\n");
			int choice2 = sc.nextInt();
			switch (choice2) {
			case 1:
				System.out.println("Enter Car Name: ");
				String name = sc.next();
				op.editCarByName(name, id2);
				break;
			case 2:
				System.out.println("Enter Car Brand: ");
				String brand = sc.next();
				op.editCarByBrand(brand, id2);
				break;
			case 3:
				System.out.println("Enter Car Model: ");
				String model = sc.next();
				op.editCarByModel(model, id2);
				break;
			case 4:
				System.out.println("Enter Car Fuel-Type: ");
				String FuelType = sc.next();
				op.editCarByFuelType(FuelType, id2);
				break;
			case 5:
				System.out.println("Enter Price : ");
				double price = sc.nextDouble();
				op.editCarByPrice(price, id2);
				break;
			case 6:
				mainMenu();
				break;
			default:
				System.out.println("Invalid input.Please try again!\n");
				break;
			}
			break;
		case 6:
			flag = false;
			System.out.println("Thank you.Visit again!!!");
			break;

		default:
			System.out.println("Invalid input.Please try again!\n");
			break;
		}

	}
}
