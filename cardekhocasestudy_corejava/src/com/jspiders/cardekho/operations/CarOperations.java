package com.jspiders.cardekho.operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.jspiders.cardekho.entity.Car;

public class CarOperations {

	private List<Car> cars = new ArrayList<>();

	// *****VIEW ALL CAR*****//
	public void viewCar() {
		boolean flag = false;
		for (Car car : cars) {
			System.out.println(car);
			flag = true;
		}
		if (!flag) {
			System.out.println("Data Not Present!");
		}

	}

	// *****ADD CAR METHOD*****//
	public void addCar() {
		System.out.println("How many cars do you want to add?");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		for (int i = 1; i <= choice; i++) {
			Car car = new Car();
			System.out.println("Enter id: ");
//			int id=sc.nextInt();
//			car.setId(id);
			car.setId(sc.nextInt());
			System.out.println("Enter name: ");
			car.setName(sc.next());
			System.out.println("Enter model: ");
			car.setModel(sc.next());
			System.out.println("Enter brand: ");
			car.setBrand(sc.next());
			System.out.println("Enter Fuel Type: ");
			car.setFuelType(sc.next());
			System.out.println("Enter Price: ");
			car.setPrice(sc.nextDouble());
			System.out.println("Enter Colour: ");
			car.setColour(sc.next());
			cars.add(car);
		}

	}

	// *****REMOVE CAR METHOD****//
	public void removeCar(int id) {
		boolean flag = false;
		System.out.println("Processing...");
		for (Car car : cars) {
			if (car.getId() == id) {
				cars.remove(id);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Car Not Found!");
		}
	}

	// ***SEARCH METHODS OF CARS***//
	public void searchByName(String name) {
		boolean flag = false;
		System.out.println("Searching...");
		for (Car car : cars) {
			if (car.getName().equals(name)) {
				System.out.println(car);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Car Not Found!");
		}

	}

	public void searchByBrand(String brand) {
		boolean flag = false;
		System.out.println("Searching...");
		for (Car car : cars) {
			if (car.getBrand().equals(brand)) {
				System.out.println(car);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Car Not Found!");
		}

	}

	public void searchByFuelType(String FuelType) {
		boolean flag = false;
		System.out.println("Searching...");
		for (Car car : cars) {
			if (car.getFuelType().equals(FuelType)) {
				System.out.println(car);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Car Not Found!");
		}
	}

	public void searchByPrice(double MinimumPrice, double MaximumPrice) {
		boolean flag = false;
		System.out.println("Searching...");
		for (Car car : cars) {
			if (car.getPrice() > MinimumPrice && car.getPrice() < MaximumPrice) {
				System.out.println(car);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Car Not Found!");
		}

	}

	// *****UPDATE CAR DETAILS*****//
	public void editCarByName(String name, int id2) {
		boolean flag = false;
		for (Car car : cars) {
			if (car.getId() == id2) {
				car.setName(name);
				System.out.println("Car name updated!");
				System.out.println(car);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Car Not Found!");
		}
	}

	public void editCarByBrand(String brand, int id2) {
		boolean flag = false;
		for (Car car : cars) {
			if (car.getId() == id2) {
				car.setBrand(brand);
				System.out.println("Car brand updated!");
				System.out.println(car);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Car Not Found!");
		}

	}

	public void editCarByModel(String model, int id2) {
		boolean flag = false;
		for (Car car : cars) {
			if (car.getId() == id2) {
				car.setModel(model);
				System.out.println("Car Model updated!");
				System.out.println(car);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Car Not Found!");
		}

	}

	public void editCarByFuelType(String fuelType, int id2) {
		boolean flag = false;
		for (Car car : cars) {
			if (car.getId() == id2) {
				car.setFuelType(fuelType);
				System.out.println("Car fueltype updated!");
				System.out.println(car);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Car Not Found!");
		}

	}

	public void editCarByPrice(double price, int id2) {
		boolean flag = false;
		for (Car car : cars) {
			if (car.getId() == id2) {
				car.setPrice(price);
				System.out.println("Car name updated!");
				System.out.println(car);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Car Not Found!");
		}

	}

}
