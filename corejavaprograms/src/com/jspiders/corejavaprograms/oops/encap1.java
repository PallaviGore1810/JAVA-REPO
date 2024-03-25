package com.jspiders.corejavaprograms.oops;

public class encap1 {
	private int rollno;
	private String name;
	
	encap1(int no,String name)
	{
		this.rollno=no;
		this.name=name;
	}
	
	public String  getName()
	{
		return name;
		
	}
	public void setRollno(int n)
	{
		this.rollno=n;
	}
	
	public int getRollno()
	{
		return rollno;
		
	}
}
