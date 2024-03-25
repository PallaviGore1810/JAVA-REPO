package com.jspiders.corejavaprograms.oops;

//single-level inheritance
public class Dog extends Animal
{
	public static void main(String[] args) 
	{
		Dog obj= new Dog();
		System.out.println(obj);
		System.out.println(obj.legs);
		System.out.println(obj.category);
		obj.bark();
		obj.eat();
	}
}
