package com.jspiders.cardekho.entity;
import java.util.ArrayList;
import java.util.List;
public class Car {
	private int id;
	private String name;
	private String model;
	private String brand;
	private String fuelType;
	private double price;
	private String colour;

	// Getter and Setter Methods or helper methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model + ", brand=" + brand + ", fuelType=" + fuelType
				+ ", price=" + price + ", colour=" + colour + "]";
	}
	
}
