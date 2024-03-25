package com.jspiders.corejavaprograms.oops;

//single-level inheritance
public class Twitter extends App 
{
	public String post="Today is my Birthday..!!!";

	public void showPost()
	{
		System.out.println(post);
	}

	public static void main(String[] args) 
	{
		Twitter obj=new Twitter();
		System.out.println(obj);
		obj.userDetails();
		obj.showPost();
		System.out.println(obj.post);
	}
}