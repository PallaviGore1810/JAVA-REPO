package com.jspiders.corejavaprograms.exceptionhandling;

//NumberFormatException
public class NFE
{
	public static void main(String[] args) 
	{
		try
		{
			int a=Integer.parseInt("12a");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("NumberFormat Exception occur: invalid input string!!!");
		}
		System.out.println("Execution continued!");
	}
}
