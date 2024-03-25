package com.jspiders.corejavaprograms.oops;

//HI
public class Car extends Vehicle 
{
	int numSeats;

	Car(String model,int year,String fuel,int seats)
	{
	super(model,year,fuel);
	this.numSeats=seats;
	}

	public int getNumSeat()
	{
		return numSeats;
	}


	public static void main(String[] args) 
	{
		Car obj=new Car("Tata-Nano",2019,"Hybrid",4);
		System.out.println("Car Model: "+obj.getModel());
		System.out.println("Car Number of Seats: "+obj.getNumSeat());
	}
}
