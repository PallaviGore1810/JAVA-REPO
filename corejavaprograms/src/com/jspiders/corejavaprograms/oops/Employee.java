package com.jspiders.corejavaprograms.oops;

//multi-level inheritance
public class Employee 
{
	static String Ename;
	static String Ejob;
	static double Esalary;

	Employee(String name,String job,double sal)
	{
		Employee.Ename=name;
		Employee.Ejob=job;
		Employee.Esalary=sal;
	}

	public String getName()
	{
		return  Ename;
	}
	public double getSalary()
	{
		return Esalary;
	}

	public String empPromotion()
	{
		return "No promotion given!!";
	}
}

