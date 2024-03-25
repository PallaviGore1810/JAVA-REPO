package com.jspiders.corejavaprograms.interfaceprog;

//heirarichal1
public class HotCoffee implements Coffee
{
	public void Coffee_type(){
		System.out.println("It is a hot coffee!");
	}
	public static void main(String[] args) 
	{
		HotCoffee hc=new HotCoffee();
		Coffee c=hc;		//upcasting
		System.out.println(c);
		System.out.println();
		c.Coffee_type();

		System.out.println();
		HotCoffee hc1=(HotCoffee)c;		//downcasting
		hc1.Coffee_type();
		System.out.println();
	
		//method overloading
		Coffee.taste();
		Coffee.taste("espresso");
	}
}

