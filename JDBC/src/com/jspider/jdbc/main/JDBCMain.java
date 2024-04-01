package com.jspider.jdbc.main;

import java.util.Scanner;

import com.jspider.jdbc.operations.JDBCService;

public class JDBCMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("1.Sign Up\n" + "2.Log In\n" + "3.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				JDBCService.signUp(scanner);
				break;
			case 2:
				JDBCService.logIn(scanner);
				break;
			case 3:
				flag = false;
				System.out.println("Thank you!");
				break;
			default:
				System.out.println("invalid choice");
			}
		}
		scanner.close();
	}
}
