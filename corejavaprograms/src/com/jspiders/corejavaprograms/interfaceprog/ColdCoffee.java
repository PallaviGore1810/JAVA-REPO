package com.jspiders.corejavaprograms.interfaceprog;

//heirarichal1
public class ColdCoffee implements Coffee
{
	public void Coffee_type(){
		System.out.println("It is a cold coffee!");
	}
	public static void main(String[] args) 
	{
		ColdCoffee cc=new ColdCoffee();
		Coffee c=cc;		//upcasting
		System.out.println(c);
		System.out.println();
		c.Coffee_type();

		System.out.println();
		ColdCoffee cc1=(ColdCoffee)c;		//downcasting
		cc1.Coffee_type();
		System.out.println();
	
		//method overloading
		Coffee.taste();
		Coffee.taste("Iced Americano");
	}
}

