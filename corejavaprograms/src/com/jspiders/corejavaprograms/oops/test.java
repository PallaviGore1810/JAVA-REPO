package com.jspiders.corejavaprograms.oops;

public class test {
	public static void main(String[] args) {
		encap1 obj=new encap1(10,"sayali");
		System.out.println(obj);
		System.out.println(obj.getName());
		System.out.println(obj.getRollno());
		obj.setRollno(15);
		System.out.println(obj.getRollno());
	}
}
