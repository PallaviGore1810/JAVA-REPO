package com.jspider.filehandling.operation;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File file = new File("D:/file/Demo.txt");
		if (file.exists()) {
			System.out.println("File name : " + file.getName());
			System.out.println("File path : " + file.getAbsolutePath());
			System.out.println("No of characters : " + file.length());
			if (file.canWrite()) {
				System.out.println("file is writable!");
			} else {
				System.out.println("file is not writable!");
			}
			if (file.canRead()) {
				System.out.println("file is readable!");
			} else {
				System.out.println("file is not readable!");
			}
			if (file.canExecute()) {
				System.out.println("file is executable!");
			} else {
				System.out.println("file is not executable!");
			}
		} else {
			System.out.println("File does not exists!!! ");
		}

	}
}
