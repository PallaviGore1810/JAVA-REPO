package com.jspiders.corejavaprograms.exceptionhandling;

//StringIndexOutOfBoundException
public class StringIndexOutOfBound {
	public static void main(String args[]) 
    { 
		String a = "Exception Handling";	 // length is 18
        try 
		{ 
            char c = a.charAt(20);		 // accessing 21th element 
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e)
		{ 
            System.out.println("Exception Handled!!!"); 
        } 
    }
}
