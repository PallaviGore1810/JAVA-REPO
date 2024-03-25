package com.jspiders.corejavaprograms.oops;

//H I
public class Truck extends Vehicle 
{
	int capacity;

	Truck(String model,int year,String fuel,int cap)
	{
	super(model,year,fuel);
	this.capacity=cap;
	}

	public int getCapacity()
	{
		return capacity;
	}
	

	public static void main(String[] args) 
	{
		Truck obj=new Truck("Tata-101",2021,"Disel",1000);
		System.out.println("Truck Model: "+obj.getModel());
		System.out.println("Truck Capacity: "+obj.getCapacity());
	}
}
