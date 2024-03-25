package com.jspiders.corejavaprograms.interfaceprog;

//multilevel1
public class Cricket implements OutdoorGames
{
	public void cricket()
	{
		System.out.println("I like Cricket!!!");
	}
	public void typeOfGames()
	{
		System.out.println("There are 2 types of games: Outdoor and Indoor");
	}

	public void outdoorGames()
	{
		
		System.out.println("Outdoor Games: Cricket,Hockey");
	}
	public static void main(String[] args) 
	{
		Cricket c=new Cricket();
		System.out.println(c);
		
		System.out.println();
		OutdoorGames og=c;		//upcasting
		System.out.println(og);
		og.outdoorGames();		//calling its own method(method overriding)

		System.out.println();
		Games g=og;				//upcasting
		System.out.println(g);
		g.typeOfGames();		//calling its own method(method overriding)

		System.out.println();
		Cricket ob=(Cricket)g;	//downcasting
		System.out.println(ob);
		ob.cricket();
		System.out.println();

		//method overloading
		OutdoorGames.indoorGame();
		OutdoorGames.indoorGame("cards");
	}
}

