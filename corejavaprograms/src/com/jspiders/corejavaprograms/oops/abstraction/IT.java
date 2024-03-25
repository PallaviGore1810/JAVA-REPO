package com.jspiders.corejavaprograms.oops.abstraction;

//Abstraction using single inheritance
public class IT extends Subject
{
	public void Syllabus()
	{
		System.out.println("Encapsulation, inhertance, ppolymorphism, abstraction");
	}
	public static void main(String[] args) 
	{
		Subject s=new IT();             //upcasting
		s.Syllabus();

		System.out.println(s);
	}
}
