package com.jspiders.corejavaprograms.oops.abstraction;

//Abstraction using multilevel inheritance
public class  Sweater extends WoolenCloth
{
	public void product()
	{
		System.out.println("Cloths are made of wool");
	}
	public void wc_Details()
	{
		System.out.println("Woolen cloths are used in winter");
	}
	public static void main(String[] args) 
	{

		WoolenCloth wc=new Sweater();	//upcasting
		wc.wc_Details();
		System.out.println(wc);
		
		Cloths c=wc;	//upcasting
		c.product();
		System.out.println(c);
	}
}
