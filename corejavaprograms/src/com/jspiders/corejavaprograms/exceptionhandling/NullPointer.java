package com.jspiders.corejavaprograms.exceptionhandling;

//NullPointerException 
public class NullPointer
{ 
  public static void main(String args[]) 
  { 
      try
		{ 
          String a = null; //null value 
          System.out.println(a.charAt(1)); 
      } 
		catch(NullPointerException e)
		{ 
          System.out.println("exception caught!"); 
      } 
  } 
} 
