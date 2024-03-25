package com.jspiders.corejavaprograms.oops;

//multi-level inheritance
public class  Programmer extends Developer
{
	Programmer(String name,double sal,String lang)
	{
		super(name,"Programmer",sal,lang);
	}
	
	public void debugCode()
	{
		System.out.println("Programmer "+getName()+" is debugging code in "+getProgLang());
	}

	public static void main(String[] args) 
	{
		Programmer obj=new Programmer("Pallavi",55000,"Java");
		System.out.println(obj);
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());
		System.out.println(obj.getProgLang());
		obj.empPromotion();
		obj.writeCode();
		obj.debugCode();
	}
}

