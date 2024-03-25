package com.jspiders.corejavaprograms.exceptionhandling;

//ArithmeticException 
public class ArithmeticException
{ 
 public static void main(String args[]) 
 { 
		float a = 1;
		int b = 0; 
		 
		 try 
			{ 
	           float c = a/b;			 // cannot divide by zero 
	        } 
	        catch(Throwable e)
			{ 
	            System.out.println(e); 
	        } 
 }
}