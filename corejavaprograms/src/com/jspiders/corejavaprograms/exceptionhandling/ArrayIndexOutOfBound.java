package com.jspiders.corejavaprograms.exceptionhandling;

public class ArrayIndexOutOfBound {

	 public static void main(String args[]) 
	    { 
			int a[] = new int[5]; 
	        try
			{ 
	            a[6] = 9;		// accessing 7th element in an array of size 5 
								
	        } 
	        catch(ArrayIndexOutOfBoundsException e)
			{ 
	            System.out.println ("Exception Caught!"); 
	        } 
	    } 
}
