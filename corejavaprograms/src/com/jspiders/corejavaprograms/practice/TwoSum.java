package com.jspiders.corejavaprograms.practice;

public class TwoSum {
	public static void main(String[] args) {
		int num[]= {1,0,2,3,6};
		int target=5;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]+num[j]==target) {
//					System.out.println("true");
					System.out.println(i+" "+j);
				}
			}
		}
	}
}
