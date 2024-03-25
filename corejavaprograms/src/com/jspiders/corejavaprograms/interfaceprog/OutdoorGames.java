package com.jspiders.corejavaprograms.interfaceprog;

//multilevel1
interface OutdoorGames extends Games
{
	void outdoorGames();

	public static void indoorGame(String s)
	{
		System.out.println(s+ ", it is a indoor game!");
	}
	
	public static void indoorGame()
	{
		System.out.println("indoor games are carrom, cards");
	}
}
