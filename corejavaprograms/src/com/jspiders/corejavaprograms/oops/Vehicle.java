package com.jspiders.corejavaprograms.oops;

//Hierarchical inheritance
public class  Vehicle
{
	String Vmodel;
	int Vyear;
	String Vfuel;
	

	Vehicle(String model,int year,String fuel)
	{
		this.Vmodel=model;
		this.Vyear=year;
		this.Vfuel=fuel;
	}

	public String getModel()
	{
		return Vmodel;
	}

	public int getYear()
	{
		return Vyear;
	}
	public String getFuel()
	{
		return Vfuel;
	}
	
}

