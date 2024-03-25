package com.jspiders.corejavaprograms.oops;

public class Book {
	public String BookType()
	{
		return "It is book";
	}
	public static void main(String[] args) 
	{
		
		   Fiction f=new Fiction();
		   System.out.println(f.BookType());
		  
		   Book b=f;
		   System.out.println(b.BookType());
		   
		   NonFiction nf=new   NonFiction();
		   System.out.println(nf.BookType());
		   
		   Book b1=nf;
		   System.out.println(b1.BookType());
		 
	}
}
