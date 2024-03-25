package com.jspiders.corejavaprograms.interfaceprog;

//Multiple inheritance
public class Trailor extends Movie implements WebSeries 
{
	public void trailor(){
		System.out.println("Movies & WebSeries has trailor");
	}
	public static void main(String[] args) 
	{
		Trailor t=new Trailor();
		Movie m=t;		//upcasting
		System.out.println(m);
		m.trailor();
		System.out.println();

		WebSeries w=t;		//upcasting
		System.out.println(w);
		w.trailor();
	}
}
