package com.jspiders.corejavaprograms.oops;

//multi-level inheritance
public class  Developer extends Employee
{
	String progLang;

  Developer(String name,String job,double sal,String lang)
	{
		super(name,job,sal);
		this.progLang=lang;
	}

	public String getProgLang()
	{
		return progLang;
	}

	public void writeCode()
	{
		System.out.println("Developer "+getName()+" is writing code in "+getProgLang());
	}
}
